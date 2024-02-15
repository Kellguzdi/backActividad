package mx.edu.utez.crudback.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface LibrosRepository extends JpaRepository<Libros,Long>{
    List<Libros> findByNombreContaining(String nombre);

    List<Libros> findByAutorNombre(String nombreAutor);

    List<Libros> findByFechaPublicacionBetween(Date fechaInicio, Date fechaFin);

    List<Libros> findByCategoria(String categoria);

    List<Libros> findAllByOrderByFechaPublicacionDesc();
}
