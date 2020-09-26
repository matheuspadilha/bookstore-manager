package com.matheuspadilha.bookstoremanager.repository;

import com.matheuspadilha.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
