package com.example.bookstore_backend.service;

import com.example.bookstore_backend.entity.Book;
import com.example.bookstore_backend.dto.*;
import com.example.bookstore_backend.mapper.BookMapper;
import com.example.bookstore_backend.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final BookMapper mapper;

    @Override
    public BookResponse create(BookCreateRequest request) {
        Book book = mapper.toEntity(request);
        return mapper.toResponse(bookRepository.save(book));
    }

    @Override
    public BookResponse update(Long id, BookUpdateRequest request) {
        Book book = bookRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Book not found"));

        mapper.updateEntity(book, request);
        return mapper.toResponse(bookRepository.save(book));
    }

    @Override
    public BookResponse findById(Long id) {
        return bookRepository.findById(id)
            .map(mapper::toResponse)
            .orElseThrow(() -> new RuntimeException("Book not found"));
    }

    @Override
    public List<BookResponse> findByTitle(String title) {
        return bookRepository.findByTitleContaining(title)
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Override
    public void delete(Long id) {
        bookRepository.deleteById(id);
    }
}