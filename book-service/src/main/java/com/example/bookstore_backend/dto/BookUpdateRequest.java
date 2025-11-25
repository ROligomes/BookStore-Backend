package com.example.bookstore_backend.dto;

import jakarta.validation.constraints.*;

public record BookUpdateRequest(
        @NotBlank String title,
        @NotBlank String author,
        String isbn,
        String category,
        String publisher,
        String description,
        @Positive int publication_year
) {}
