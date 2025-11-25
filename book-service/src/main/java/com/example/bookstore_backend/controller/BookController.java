package com.example.bookstore_backend.controller;

import com.example.bookstore_backend.dto.*;
import com.example.bookstore_backend.service.BookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping
    public ResponseEntity<BookResponse> create(
            @RequestBody @Valid BookCreateRequest request) {
        return ResponseEntity.ok(bookService.create(request));
    }

    @PutMapping("/{id}")
    public ResponseEntity<BookResponse> update(
            @PathVariable Long id,
            @RequestBody @Valid BookUpdateRequest request) {
        return ResponseEntity.ok(bookService.update(id, request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookResponse> findById(@PathVariable Long id) {
        return ResponseEntity.ok(bookService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<BookResponse>> findByTitle(@RequestParam String title) {
        return ResponseEntity.ok(bookService.findByTitle(title));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        bookService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
