package com.example.LibraryApplication.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import com.example.LibraryApplication.model.Book;
import com.example.LibraryApplication.services.BookService;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;
    
    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }
    
     @GetMapping("/genre/{genre}")
    public List<Book> getBooksByGenre(@PathVariable String genre) {
        return bookService.getBooksByGenre(genre);
    }
    
    @GetMapping("/sorted")
    public List<Book> getBooksSortedByPublicationDate() {
        return bookService.getBooksSortedByPublicationDate();
    }
    
    @GetMapping("/paginated")
    public Page<Book> getBooksPaginated(@RequestParam int page, @RequestParam int size) {
        return bookService.getBooksPaginated(page, size);
    }
    
    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }
}