package com.example.bookstore_backend.dto;


public record BookResponse(
        Long id,
        String title,
        String author,
        int publication_year
) {}
