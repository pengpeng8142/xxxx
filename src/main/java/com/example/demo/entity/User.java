package com.example.demo.entity;

import org.apache.ibatis.type.Alias;

import java.util.Objects;

@Alias("User")
public class User {
    private int uId;
    private String uName;
    private String uPassword;
    private int uAge;
    private String uBorrowBook;

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }


    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public int getuAge() {
        return uAge;
    }

    public void setuAge(int uAge) {
        this.uAge = uAge;
    }


    public String getuBorrowBook() {
        return uBorrowBook;
    }

    public void setuBorrowBook(String uBorrowBook) {
        this.uBorrowBook = uBorrowBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return uId == user.uId &&
                uAge == user.uAge &&
                Objects.equals(uName, user.uName) &&
                Objects.equals(uPassword, user.uPassword) &&
                Objects.equals(uBorrowBook, user.uBorrowBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uId, uName, uPassword, uAge, uBorrowBook);
    }

    public User(String uName, String uPassword, int uAge, String uBorrowBook) {
        this.uName = uName;
        this.uPassword = uPassword;
        this.uAge = uAge;
        this.uBorrowBook = uBorrowBook;
    }
}
