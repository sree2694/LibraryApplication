package com.example.LibraryApplication.model;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private Author author;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @Column(name = "publication_date")
    private LocalDate publicationDate;

    @Column(nullable = false)
    private String genre;

    // Getters and Setters
}