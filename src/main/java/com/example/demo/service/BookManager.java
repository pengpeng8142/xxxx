package com.example.demo.service;

import com.example.demo.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BookManager {
    List<Book> bookAll1();
    Book bookByID(int id);
    int deleteById(int id);
    int saveBook(Book book);
}
