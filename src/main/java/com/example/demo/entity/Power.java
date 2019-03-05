package com.example.demo.entity;

import java.util.Objects;

public class Power {
    private int pId;
    private String pName;

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Power power = (Power) o;
        return pId == power.pId &&
                Objects.equals(pName, power.pName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pId, pName);
    }
}
