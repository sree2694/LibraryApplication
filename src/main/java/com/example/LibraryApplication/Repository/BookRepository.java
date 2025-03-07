package com.example.LibraryApplication.Repository;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LibraryApplication.model.Book;


public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByGenre(String genre);
    List<Book> findAllByOrderByPublicationDateAsc();
    Page<Book> findAll(Pageable pageable);
}
