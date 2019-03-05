package com.example.demo.entity;

import java.sql.Date;
import java.util.Objects;

public class BorrowBook {
    private int bkId;
    private Date bkDate;
    private int bkOutNumber;

    public int getBkId() {
        return bkId;
    }

    public void setBkId(int bkId) {
        this.bkId = bkId;
    }

    public Date getBkDate() {
        return bkDate;
    }

    public void setBkDate(Date bkDate) {
        this.bkDate = bkDate;
    }

    public int getBkOutNumber() {
        return bkOutNumber;
    }

    public void setBkOutNumber(int bkOutNumber) {
        this.bkOutNumber = bkOutNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BorrowBook that = (BorrowBook) o;
        return bkId == that.bkId &&
                bkOutNumber == that.bkOutNumber &&
                Objects.equals(bkDate, that.bkDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bkId, bkDate, bkOutNumber);
    }
}
