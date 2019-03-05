package com.example.demo.controlle;


import com.example.demo.entity.Book;
import com.example.demo.entity.User;
import com.example.demo.service.BookManager;
import com.example.demo.service.UserManager;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
//
//@Controller
//@ResponseBody
//
//public class Usercontrolle {
//
//    @Autowired
//    UserManager userManager;
//    @RequestMapping(name = "",method = RequestMethod.GET)
//    public String addUser(String json){
//        User user = new Gson().fromJson(json, User.class);
//        return new Gson().toJson(userManager.addUser(user));
//    }

//    @RequestMapping(name = "/login",method = RequestMethod.GET)
//    public String login(String json){
//        User user = new Gson().fromJson(json, User.class);
//        User user1=userManager.selectById(user.getuId());
//        if(user.getuName()!=null&&user.getuPassword()!=null&&user1.getuName()==user.getuPassword()&&user.getuName()==user1.getuName()){
//
//
//        }
//        return "";
//
//
//
//    }



//
//    @RequestMapping(name ="/userAll",method = RequestMethod.GET)
//    public  String userAll(){
//
//        return new Gson().toJson(userManager.selectUserAll());
   //   }
//





//}
