package com.example.demo.repository;

import com.example.demo.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Mapper
@Transactional
public interface BookRepository {
    List<Book> bookAll();
    Book bookByID(int id);
    int deleteById(int id);
    int saveBook(Book book);


}
