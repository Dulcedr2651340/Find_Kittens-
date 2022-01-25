package com.example.myapplication2.model;

public class CatPopular {

    public String popular_name;
    public String popular_description;
    public Integer popular_imageUrl;
    public String rating;
    public String view;

    public CatPopular(String popular_name, String popular_description, Integer popular_imageUrl, String rating, String view) {
        this.popular_name = popular_name;
        this.popular_description = popular_description;
        this.popular_imageUrl = popular_imageUrl;
        this.rating = rating;
        this.view = view;
    }

    public String getPopular_name() {
        return popular_name;
    }

    public void setPopular_name(String popular_name) {
        this.popular_name = popular_name;
    }

    public String getPopular_description() {
        return popular_description;
    }

    public void setPopular_description(String popular_description) {
        this.popular_description = popular_description;
    }

    public Integer getPopular_imageUrl() {
        return popular_imageUrl;
    }

    public void setPopular_imageUrl(Integer popular_imageUrl) {
        this.popular_imageUrl = popular_imageUrl;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }
}
