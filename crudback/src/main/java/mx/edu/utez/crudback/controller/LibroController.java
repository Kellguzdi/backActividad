package mx.edu.utez.crudback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.utez.crudback.model.Libros;
import mx.edu.utez.crudback.service.LibrosService;

@RestController
@RequestMapping("/api/books")
public class LibroController {
    @Autowired
    private LibrosService service;

    @GetMapping
    public List<Libros> getAllBooks() {
        return service.findAllBooks();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Libros> getBookById(@PathVariable Long id) {
        return service.findBookById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Libros createBook(@RequestBody Libros book) {
        return service.saveBook(book);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        service.deleteBook(id);
        return ResponseEntity.ok().build();
    }
}
