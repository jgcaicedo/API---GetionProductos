package com.productos.API.Servicio;

// Importa las clases necesarias para implementar la lógica de negocio relacionada con los contactos.
import com.productos.API.Modelo.Producto;
import com.productos.API.Repositorio.Productorepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// La anotación @Service indica que esta clase es un componente de servicio en Spring,
// encargado de manejar la lógica de negocio.
@Service
public class ProductoService {

    // Inyecta el repositorio de Contacto para acceder a las operaciones de la base de datos.
    @Autowired
    private Productorepository productorepository;

    // Método para obtener todos los contactos de la base de datos.
    public List<Producto> obtenerTodosLosContactos() {
        // Utiliza el repositorio para recuperar todos los contactos.
        return productorepository.findAll();
    }

    // Método para obtener un contacto específico por su ID.
    public Optional<Producto> obtenerContactoPorId(Integer id) {
        // Utiliza el repositorio para encontrar un contacto por su ID.
        return productorepository.findById(id);
    }

    // Método para guardar un nuevo contacto o actualizar un contacto existente en la base de datos.
    public Producto guardarContacto(Producto contacto) {
        // Utiliza el repositorio para guardar el contacto.
        return productorepository.save(contacto);
    }

    // Método para eliminar un contacto por su ID.
    public void eliminarContacto(Integer id) {
        // Utiliza el repositorio para eliminar el contacto con el ID especificado.
        productorepository.deleteById(id);
    }
}
