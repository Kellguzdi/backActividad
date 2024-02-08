package mx.edu.utez.crudback.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "genre", nullable = false)
    private String genre;

    @Column(name = "image", nullable = false)
    private String image;

    @Column(name = "IssueDate", nullable = false)
    private Integer issueDate;
    @ManyToOne()
    @JoinColumn(name = "author_id")
    private Autor autor;
    @ManyToOne()
    @JoinColumn(name = "genero_id")
    private Categoria categoria;
}
