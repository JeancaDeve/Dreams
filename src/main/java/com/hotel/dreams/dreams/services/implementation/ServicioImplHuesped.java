package com.hotel.dreams.dreams.services.implementation;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.dreams.dreams.models.Habitacion;
import com.hotel.dreams.dreams.models.Huesped;
import com.hotel.dreams.dreams.models.Reserva;
import com.hotel.dreams.dreams.repositories.RepositorioBase;
import com.hotel.dreams.dreams.repositories.RepositorioHabitacion;
import com.hotel.dreams.dreams.repositories.RepositorioHuesped;
import com.hotel.dreams.dreams.services.business.ServicioHuesped;

import java.util.Optional;
import java.util.Random;
import jakarta.transaction.Transactional;

@Service
public class ServicioImplHuesped extends ServicioBaseImpl<Huesped, Integer> implements ServicioHuesped {
    @Autowired
    protected RepositorioHabitacion _RepositorioHabitacion;

    @Autowired
    protected RepositorioHuesped _RepositorioHuesped;

    public ServicioImplHuesped(RepositorioBase<Huesped, Integer> repositorioBase) {
        super(repositorioBase);
    }

    @Transactional
    @Override
    public void hacerReserva(Huesped huesped) throws Exception {

        uniqueCelularAndDni(huesped);

        mayorEdad(huesped.getFechaNacimiento());

        Reserva nuevaReserva = huesped.getReservas().get(0);

        validadFechas(nuevaReserva);

        Huesped huespedReserva = huespedExistente(huesped) ? _RepositorioHuesped.findByAll(huesped).get() : huesped;

        Habitacion habitacionReserva = _RepositorioHabitacion.findById(nuevaReserva.getHabitacion().getCodigo())
                .orElseThrow(() -> new Exception("No se encontro la habitacion"));

        habitacionReservaDisponible(habitacionReserva);

        double precioDiaHbaitacion = habitacionReserva.getPrecioDia();
        double montoFactura = precioDiaHbaitacion * diasHospedaje(nuevaReserva);

        nuevaReserva.getFactura().setMonto(montoFactura);
        nuevaReserva.getFactura().setRuc(rucGenerado());

        // agregamos la nueva reserva a la lista de reservas en caso el huesped ya haya
        // existido
        if (huespedReserva != huesped)
            huespedReserva.getReservas().add(nuevaReserva);

        _RepositorioHuesped.save(huespedReserva);

        _RepositorioHabitacion.cambiarEstadoHabitacion(huesped.getReservas().get(0).getHabitacion().getCodigo());

    }

    public void mayorEdad(String fechaNacimiento) throws Exception {

        LocalDate fechaActual = LocalDate.now();

        LocalDate fechaDeNacimiento = LocalDate.parse(fechaNacimiento);

        // Aqui encontramos la diferencia entre la fecha de nacimiento y la fecha actual
        long edadHuesped = ChronoUnit.YEARS.between(fechaDeNacimiento, fechaActual);

        if (edadHuesped < 18)
            throw new Exception("El huesped es menor de edad");
    }

    public void uniqueCelularAndDni(Huesped huesped) throws Exception {

        Optional<Huesped> cel = _RepositorioHuesped.findByNumeroCelular(huesped.getNumeroCelular());

        Optional<Huesped> dni = _RepositorioHuesped.findByDni(huesped.getDni());

        if (!huespedExistente(huesped)) {
            if (cel.isPresent())
                throw new Exception("El numero celular le pertence a otro huesped");
            if (dni.isPresent())
                throw new Exception("El dni le pertence a otro huesped");
        }
    }

    // todo: mejorar metodo, podemos usar algun api u otro sistema
    public String rucGenerado() {

        Random random = new Random();
        int primerGrupo = random.nextInt(8000) + 1000;
        int segundoGrupo = random.nextInt(8000) + 1000;
        return primerGrupo + "3" + segundoGrupo + "53";

    }

    public boolean huespedExistente(Huesped huesped) {

        Optional<Huesped> huespedExistente = _RepositorioHuesped.findByAll(huesped);

        return huespedExistente.isPresent();
    }

    public void validadFechas(Reserva reserva) throws Exception {

        LocalDate entrada = LocalDate.parse(reserva.getFechaEntrada());
        LocalDate salida = LocalDate.parse(reserva.getFechaSalida());
        LocalDate fechaActual = LocalDate.now();

        if (entrada.isBefore(fechaActual))
            throw new Exception("La fecha de entrada no puede ser antes de " + fechaActual);
        else if (salida.isBefore(entrada))
            throw new Exception("La fecha de salida no puede ser antes de " + entrada);
    }

    public long diasHospedaje(Reserva reserva) throws Exception {
        LocalDate entrada = LocalDate.parse(reserva.getFechaEntrada());
        LocalDate salida = LocalDate.parse(reserva.getFechaSalida());

        // retornamos la cantidad de dias que pasan entre 2 fechas
        return ChronoUnit.DAYS.between(entrada, salida);

    }

    @Override
    public Huesped buscarPorDni(String numeroDni) throws Exception {

        return _RepositorioHuesped.findByDni(numeroDni)
                .orElseThrow(() -> new Exception("No se encontro el huesped con el DNI: " + numeroDni));

    }

    public void habitacionReservaDisponible(Habitacion habitacion) throws Exception {

        boolean disponible = _RepositorioHabitacion.getHabitacionesDisponibles().contains(habitacion);

        if (!disponible)
            throw new Exception("La habitacion no se encuentra disponible");

    }

}
