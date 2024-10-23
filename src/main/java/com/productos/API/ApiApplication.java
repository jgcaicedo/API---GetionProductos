package com.productos.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.productos.API.Config", "com.productos.API.Controlador", "com.productos.API.Modelo", "com.productos.API.Repositorio", "com.productos.API.Servicio"})
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
