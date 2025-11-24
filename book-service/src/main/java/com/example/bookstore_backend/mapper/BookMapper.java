package com.example.bookstore_backend.mapper;

import com.example.bookstore_backend.dto.*;
import com.example.bookstore_backend.entity.Book;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {

    public Book toEntity(BookCreateRequest request) {
        return Book.builder()
                .title(request.title())
                .author(request.author())
                .publication_year(request.publication_year())
                .build();
    }

    public BookResponse toResponse(Book book) {
        return new BookResponse(
                book.getId(),
                book.getTitle(),
                book.getAuthor(),
                book.getPublication_year()
        );
    }

    public void updateEntity(Book book, BookUpdateRequest request) {
        book.setTitle(request.title());
        book.setAuthor(request.author());
        book.setPublication_year(request.publication_year());
    }
}

