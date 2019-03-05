package com.example.demo.service.Impl;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.BookManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class BookManagerImpl implements BookManager {
    @Autowired
    BookRepository bookRepository;


    @Override
    public List<Book> bookAll1() {
        return bookRepository.bookAll();
    }

    @Override
    public Book bookByID(int id) {
        return bookRepository.bookByID(id);
    }

    @Override
    public int deleteById(int id) {
        this.bookRepository.deleteById(id);
        return 1;
    }

    @Override
    public int saveBook(Book book) {
        this.bookRepository.saveBook(book);
        return 1;
    }
}
