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
							"Adipisicing sint ea anim labore est in ad labore. Aliqua ea sit cupidatat amet. Culpa id quis nostrud cillum ipsum duis et deserunt dolor et. Consectetur reprehenderit ullamco adipisicing sint cillum anim pariatur elit dolor non id ut cillum minim. Voluptate occaecat culpa quis anim officia est voluptate elit. Esse irure irure Lorem ex aliqua culpa consectetur officia pariatur. Nulla duis in ipsum sint nisi ex ut pariatur velit consequat velit. Nulla proident id id qui. Pariatur nostrud nisi fugiat dolor reprehenderit deserunt incididunt Lorem elit. Ut irure fugiat et cupidatat sit. Veniam aliqua ut occaecat cupidatat consectetur eiusmod ea eu.")
					.precioDia(200.50)
					.numero(400)
					.estado("1")
					.imagen("https://inspira.oechsle.pe/wp-content/uploads/2023/05/habitaciones-modernas.jpg")
					.build();
			Habitacion habitacionTwo = Habitacion.builder()
					.descripcion(
							"Adipisicing sint ea anim labore est in ad labore. Aliqua ea sit cupidatat amet. Culpa id quis nostrud cillum ipsum duis et deserunt dolor et. Consectetur reprehenderit ullamco adipisicing sint cillum anim pariatur elit dolor non id ut cillum minim. Voluptate occaecat culpa quis anim officia est voluptate elit. Esse irure irure Lorem ex aliqua culpa consectetur officia pariatur. Nulla duis in ipsum sint nisi ex ut pariatur velit consequat velit. Nulla proident id id qui. Pariatur nostrud nisi fugiat dolor reprehenderit deserunt incididunt Lorem elit. Ut irure fugiat et cupidatat sit. Veniam aliqua ut occaecat cupidatat consectetur eiusmod ea eu.")
					.precioDia(200.40)
					.numero(401)
					.estado("1")
					.imagen("https://inspira.oechsle.pe/wp-content/uploads/2023/05/habitaciones-modernas.jpg")
					.build();

			repHabitacion.saveAll(Set.of(habitacionOne, habitacionTwo));
			serviceUser.registrarUsuario(usuarioOne);

		};
	}

}
