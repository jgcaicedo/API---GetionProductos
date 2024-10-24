package com.productos.API.Modelo;

// Importa las anotaciones y clases necesarias para definir una entidad JPA (Java Persistence API).

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// @Entity indica que esta clase representa una entidad que será mapeada a una tabla en la base de datos.
@Entity
public class Producto {

    // @Id indica que este campo es la clave primaria de la entidad.
    // @GeneratedValue define la estrategia para la generación automática de valores para la clave primaria.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // Define los campos de la entidad 'Contacto', que se mapearán a columnas en la tabla de la base de datos.
    private String nombre;

    private String precio;

    // Métodos getters y setters para acceder y modificar los campos privados de la clase.
    // Estos métodos permiten la encapsulación de los datos.
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
