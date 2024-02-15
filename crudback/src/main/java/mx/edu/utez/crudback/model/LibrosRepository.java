package mx.edu.utez.crudback.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface LibrosRepository extends JpaRepository<Libros,Long>{
    List<Libros> findByTitleContaining(String nombre);

    List<Libros> findByName(String nombreAutor);

    List<Libros> findByIssueDateBetween(Date fechaInicio, Date fechaFin);

    List<Libros> findAllByCategoria(String categoria);

    List<Libros> findAllByOrderByIssueDateDesc();
}
