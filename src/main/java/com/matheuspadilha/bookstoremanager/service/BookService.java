package com.matheuspadilha.bookstoremanager.service;

import com.matheuspadilha.bookstoremanager.dto.MessageResponseDTO;
import com.matheuspadilha.bookstoremanager.entity.Book;
import com.matheuspadilha.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(Book book) {
        Book savedBook = bookRepository.save(book);

        return MessageResponseDTO.builder().message("Book created with ID " + savedBook.getId()).build();
    }
}
