package com.example.LibraryApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LibraryApplication.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}