package com.matheuspadilha.bookstoremanager.controller;

import com.matheuspadilha.bookstoremanager.dto.BookDTO;
import com.matheuspadilha.bookstoremanager.dto.MessageResponseDTO;
import com.matheuspadilha.bookstoremanager.exception.BookNotFoundException;
import com.matheuspadilha.bookstoremanager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/book")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody @Valid BookDTO bookDTO) {
        return bookService.create(bookDTO);
    }

    @GetMapping("/{id}")
    public BookDTO findById(@PathVariable Long id) throws BookNotFoundException {
        return bookService.findById(id);
    }
}
