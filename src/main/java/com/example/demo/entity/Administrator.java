package com.example.demo.entity;


import java.util.Objects;


public class Administrator {
    private int aId;
    private String aName;
    private String aPassword;


    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaPassword() {
        return aPassword;
    }

    public void setaPassword(String aPassword) {
        this.aPassword = aPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Administrator that = (Administrator) o;
        return aId == that.aId &&
                Objects.equals(aName, that.aName) &&
                Objects.equals(aPassword, that.aPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aId, aName, aPassword);
    }
}
