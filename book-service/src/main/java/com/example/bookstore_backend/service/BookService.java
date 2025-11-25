package com.example.bookstore_backend.service;

import com.example.bookstore_backend.dto.*;
import java.util.List;

public interface BookService {

    BookResponse create(BookCreateRequest request);

    BookResponse update(Long id, BookUpdateRequest request);

    BookResponse findById(Long id);

    List<BookResponse> findByTitle(String title);

    void delete(Long id);
}