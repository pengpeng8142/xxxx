package com.example.demo.service.Impl;

import com.example.demo.entity.User;
import com.example.demo.repository.Userrepository;
import com.example.demo.service.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserManagerImpl implements UserManager {
    @Autowired
    Userrepository userrepository;

    @Override
    public int addUser(User user) {
        userrepository.addUser(user);

        return 0;
    }

    @Override
    public List<User> selectUserAll() {

        return this.userrepository.selectUserAll();
    }

    @Override
    public User selectById(int id) {

        return this.userrepository.selectById(id);
    }
}
