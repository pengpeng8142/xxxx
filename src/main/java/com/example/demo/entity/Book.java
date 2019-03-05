package com.example.demo.entity;


import org.apache.ibatis.type.Alias;

import java.sql.Date;
import java.util.Objects;

@Alias("book")
public class Book {
    private int bId;
    private String bName;
    private String bAuthor;
    private String bPublishingHouse;
    private Date bDate;
    private int bNumber;


    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }


    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbAuthor() {
        return bAuthor;
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }

    public String getbPublishingHouse() {
        return bPublishingHouse;
    }

    public void setbPublishingHouse(String bPublishingHouse) {
        this.bPublishingHouse = bPublishingHouse;
    }

    public Date getbDate() {
        return bDate;
    }

    public void setbDate(Date bDate) {
        this.bDate = bDate;
    }


    public int getbNumber() {
        return bNumber;
    }

    public void setbNumber(int bNumber) {
        this.bNumber = bNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bId == book.bId &&
                bNumber == book.bNumber &&
                Objects.equals(bName, book.bName) &&
                Objects.equals(bAuthor, book.bAuthor) &&
                Objects.equals(bPublishingHouse, book.bPublishingHouse) &&
                Objects.equals(bDate, book.bDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bId, bName, bAuthor, bPublishingHouse, bDate, bNumber);
    }
}
