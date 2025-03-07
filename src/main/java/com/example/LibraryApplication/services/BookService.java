package com.example.LibraryApplication.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import com.example.LibraryApplication.Repository.BookRepository;
import com.example.LibraryApplication.model.Book;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    
    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }
    
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getBooksByGenre(String genre) {
        return bookRepository.findByGenre(genre);
    }
    
    public List<Book> getBooksSortedByPublicationDate() {
        return bookRepository.findAllByOrderByPublicationDateAsc();
    }
    
    public Page<Book> getBooksPaginated(int page, int size) {
        PageRequest pageable = PageRequest.of(page, size, Sort.by("title"));
        return bookRepository.findAll(pageable);
    }
}