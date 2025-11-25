package com.example.bookstore_backend.dto;


public record BookResponse(
        Long id,
        String title,
        String author,
        String isbn,
        String category,
        String publisher,
        String description,
        int publication_year
) {}
