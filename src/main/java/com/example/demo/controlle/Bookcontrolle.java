package com.example.demo.controlle;

import com.example.demo.entity.Book;
import com.example.demo.service.BookManager;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody

public class Bookcontrolle {

    @Autowired
    BookManager bookManager;

    @RequestMapping(name = "/selectBookById",method = RequestMethod.GET)
    public  String selectBook(){
        // Book book = new Gson().fromJson(json, Book.class);

        List<Book> bookList=bookManager.bookAll1();
        return new Gson().toJson(bookList);


    }



}
