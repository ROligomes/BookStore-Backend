package com.example.bookstore_backend.dto;

import jakarta.validation.constraints.*;

public record BookCreateRequest(
        @NotBlank String title,
        @NotBlank String author,
        @Positive int publication_year
) {}
