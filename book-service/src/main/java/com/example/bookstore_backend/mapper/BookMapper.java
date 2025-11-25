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
                .isbn(request.isbn())
                .category(request.category())
                .publisher(request.publisher())
                .description(request.description())
                .publication_year(request.publication_year())
                .build();
    }

    public BookResponse toResponse(Book book) {
        return new BookResponse(
                book.getId(),
                book.getTitle(),
                book.getAuthor(),
                book.getIsbn(),
                book.getCategory(),
                book.getPublisher(),
                book.getDescription(),
                book.getPublication_year()
        );
    }

    public void updateEntity(Book book, BookUpdateRequest request) {
        book.setTitle(request.title());
        book.setAuthor(request.author());
        book.setIsbn(request.isbn());
        book.setCategory(request.category());
        book.setPublisher(request.publisher());
        book.setDescription(request.description());
        book.setPublication_year(request.publication_year());
    }
}

