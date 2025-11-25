package com.example.bookstore_backend.dto;

import jakarta.validation.constraints.*;

public record BookCreateRequest(
        @NotBlank String title,
        @NotBlank String author,
        @NotBlank String isbn,
        @NotBlank String category,
        @NotBlank String publisher,
        String description,
        @Positive int publication_year
) {}
