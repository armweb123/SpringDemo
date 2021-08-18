package com.example.springdemo.repository;
import com.example.springdemo.model.Book;
import com.example.springdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}