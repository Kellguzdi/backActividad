package mx.edu.utez.crudback.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.annotation.Generated;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "books")
@Data
public class Libros {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="title",nullable = false)
    private String title;

    @Column(name = "image", nullable = false)
    private String image;

    @Column(name = "issueDate", nullable = false)
    private Integer issueDate;
    @ManyToOne()
    @JoinColumn(name = "author_id")

    private Autor autor;
    @ManyToOne( )
    @JoinColumn(name = "genero_id")

    private Categoria categoria;
}
