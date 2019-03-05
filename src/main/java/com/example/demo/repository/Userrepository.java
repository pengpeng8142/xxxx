package com.example.demo.repository;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Mapper
@Transactional
public interface Userrepository {
    void addUser(User user);
    List<User> selectUserAll();
    User selectById(int id);



}
