package com.example.myapplication2.model;

public class CatMiau{

    String miau_name;
    Integer miau_imageUrl;

    public CatMiau(String miau_name, Integer miau_imageUrl) {
        this.miau_name = miau_name;
        this.miau_imageUrl = miau_imageUrl;
    }

    public String getMiau_name() {
        return miau_name;
    }

    public void setMiau_name(String miau_name) {
        this.miau_name = miau_name;
    }

    public Integer getMiau_imageUrl() {
        return miau_imageUrl;
    }

    public void setMiau_imageUrl(Integer miau_imageUrl) {
        this.miau_imageUrl = miau_imageUrl;
    }
}
