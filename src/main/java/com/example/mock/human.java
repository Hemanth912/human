package com.example.mock;

public class human {

    private long adhaarId;

    public human(long adhaarId, String name) {
        this.adhaarId = adhaarId;
        this.name = name;
    }

    private String name;
    public long getAdhaarId() {
        return adhaarId;
    }

    public void setAdhaarId(long adhaarId) {
        this.adhaarId = adhaarId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
