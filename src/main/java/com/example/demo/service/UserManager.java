package com.example.demo.service;

import com.example.demo.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserManager {
    int addUser(User user);
    List<User> selectUserAll();
    User selectById(int id);
}
