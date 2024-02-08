package mx.edu.utez.crudback.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.utez.crudback.model.Libros;
import mx.edu.utez.crudback.model.LibrosRepository;

@Service
public class LibrosService {
    private final LibrosRepository repository;

    @Autowired
    public LibrosService(LibrosRepository repository) {
        this.repository = repository;
    }

    public List<Libros> findAllBooks() {
        return repository.findAll();
    }

    public Optional<Libros> findBookById(Long id) {
        return repository.findById(id);
    }

    public Libros saveBook(Libros book) {
        return repository.save(book);
    }

    public void deleteBook(Long id) {
        repository.deleteById(id);
    }
}
