package com.hotel.dreams.dreams;

import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.hotel.dreams.dreams.models.Habitacion;
import com.hotel.dreams.dreams.models.Usuario;
import com.hotel.dreams.dreams.repositories.RepositorioHabitacion;
import com.hotel.dreams.dreams.services.impl.ServicioImplUsuario;

@SpringBootApplication
public class DreamsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DreamsApplication.class, args);
	}

	// todo: una vez terminda el proyecto se puede borrar
	@Bean
	CommandLineRunner init(RepositorioHabitacion repHabitacion, ServicioImplUsuario serviceUser) {
		return args -> {
			// agregamos un usuario
			Usuario usuarioOne = Usuario.builder()
					.nombreCompleto("Kevin Jeancarlo")
					.clave("Kevin123")
					.numeroCelular("916214065")
					.build();

			// agregamos dos habitaciones
			Habitacion habitacionOne = Habitacion.builder()
					.descripcion(
							"Su estética minimalista, su paleta de colores neutros y su abundante luz natural crean una atmósfera tranquila y relajante, lo que la convierte en un refugio ideal del ajetreo de la vida cotidiana.")
					.precioDia(520)
					.numero(400)
					.estado("1")
					.imagen(
							"https://cdn.shopify.com/s/files/1/0417/8349/2759/files/Habitacion-Modenrna-y-minimalista_large.jpg?v=1595955799")
					.build();
			Habitacion habitacionTwo = Habitacion.builder()
					.descripcion(
							"Las paredes de la habitación están pintadas en un tono suave de blanco, lo que realza aún más la sensación de amplitud. Una lámpara colgante elegante cuelga del techo, arrojando un brillo cálido sobre la cama.")
					.precioDia(200.40)
					.numero(401)
					.estado("1")
					.imagen("https://www.cemix.com/wp-content/uploads/2023/01/habitaciones-modernas-tipos-1024x512.jpg")
					.build();

			Habitacion habitacionThree = Habitacion.builder()
					.descripcion(
							"La luz natural que inunda cada espacio ilumina suavemente el ambiente, brindando una sensación de paz y bienestar.")
					.precioDia(200.40)
					.numero(402)
					.estado("1")
					.imagen(
							"https://uvn-brightspot.s3.amazonaws.com/assets/vixes/imj/hogartotal/1/10-cosas-que-no-pueden-faltar-en-tu-dormitorio-2.jpg")
					.build();

			Habitacion habitacionFour = Habitacion.builder()
					.descripcion(
							"La luz natural que inunda cada espacio ilumina suavemente el ambiente, brindando una sensación de paz y bienestar.")
					.precioDia(200.40)
					.numero(403)
					.estado("1")
					.imagen("https://i.pinimg.com/236x/c9/6e/d4/c96ed4b39e6809108c66b2ce0c58d667.jpg")
					.build();

			Habitacion habitacionFive = Habitacion.builder()
					.descripcion(
							"Cada elemento de diseño ha sido cuidadosamente seleccionado para mantener la estética minimalista, lo que resulta en un refugio acogedor y relajante.")
					.precioDia(200.40)
					.numero(501)
					.estado("1")
					.imagen("https://img.freepik.com/fotos-premium/habitaciones-4_1045419-15.jpg")
					.build();

			Habitacion habitacionSix = Habitacion.builder()
					.descripcion(
							"La combinación de colores neutros como blancos, grises y tonos tierra, crea una paleta serena y reconfortante, ideal para descansar y recargar energías.")
					.precioDia(200.40)
					.numero(502)
					.estado("1")
					.imagen("https://i.pinimg.com/564x/34/6c/48/346c48cd2e019a1765c26c12704c46b8.jpg")
					.build();

			Habitacion habitacionSeven = Habitacion.builder()
					.descripcion(
							"La ausencia de elementos superfluos y la organización impecable de cada espacio contribuyen a una sensación de orden y armonía, brindándote la tranquilidad que necesitas.")
					.precioDia(200.40)
					.numero(503)
					.estado("1")
					.imagen("https://media-cdn.tripadvisor.com/media/photo-s/15/b6/c8/19/habitacion-doble-con.jpg")
					.build();

			Habitacion habitacionEight = Habitacion.builder()
					.descripcion(
							"La habitación te envuelve en una sensación de serenidad con su decoración minimalista y colores neutros. La luz natural que llena el espacio a través de las grandes ventanas realza la elegancia de cada detalle, ofreciendo un refugio acogedor y libre de distracciones.")
					.precioDia(200.40)
					.numero(601)
					.estado("1")
					.imagen(
							"https://cf.bstatic.com/xdata/images/hotel/max1024x768/432026286.jpg?k=f42c2c3f1d50a2fe432b44652140826dcb70893e10d00be3d1ea866ec40e6341&o=&hp=1")
					.build();

			Habitacion habitacionNine = Habitacion.builder()
					.descripcion(
							"La integración de la naturaleza a través de grandes ventanales y plantas, junto con la paleta de colores neutros, crea una conexión con el entorno, generando una sensación de paz y conexión con la naturaleza")
					.precioDia(200.40)
					.numero(602)
					.estado("1")
					.imagen(
							"https://cf.bstatic.com/xdata/images/hotel/max1024x768/479962244.jpg?k=6933374b7b72a47a60611c6998204e7fdda202c11600152a13dc46b5c833db76&o=&hp=1")
					.build();

			Habitacion habitacionTen = Habitacion.builder()
					.descripcion(
							"La habitación se presenta como un oasis de tranquilidad, con su diseño minimalista que resalta la belleza de cada elemento. Los tonos neutros y la luz natural que se filtra a través de las cortinas crean una atmósfera relajante y pacífica, ideal para descansar y recargar energías.")
					.precioDia(200.40)
					.numero(603)
					.estado("1")
					.imagen(
							"https://www.estiloydecoracion.es/wp-content/uploads/2019/12/habitacion-lujo-e1577726822324.jpg")
					.build();

			repHabitacion.saveAll(Set.of(habitacionOne, habitacionTwo, habitacionThree, habitacionFour, habitacionFive,
					habitacionSix, habitacionSeven, habitacionEight, habitacionNine, habitacionTen));
			serviceUser.registrarUsuario(usuarioOne);

		};
	}

}
