package com.example.myapplication2.model;

public class Categories {

    private Integer id;
    private String view;
    private String saved;
    private String location;
    private String name_cat;
    private String image_url;
    private String created_at;
    private String description;

    public Categories() {

    }

    public Categories(Integer id, String view, String saved, String location, String name_cat, String image_url, String created_at, String description) {

        this.id = id;
        this.view = view;
        this.saved = saved;
        this.location = location;
        this.name_cat = name_cat;
        this.image_url = image_url;
        this.created_at = created_at;
        this.description = description;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getSaved() {
        return saved;
    }

    public void setSaved(String saved) {
        this.saved = saved;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName_cat() {
        return name_cat;
    }

    public void setName_cat(String name_cat) {
        this.name_cat = name_cat;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}