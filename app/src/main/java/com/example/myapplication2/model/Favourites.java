package com.example.myapplication2.model;

public class Favourites {

    private Integer id;
    private String createdAt;
    private String userName;
    private String view;
    private String saved;
    private String loveIt;
    private String description;

    public Favourites() {
    }


    public Favourites(Integer id, String createdAt, String userName, String view, String saved, String loveIt, String description){
        this.id = id;
        this.createdAt = createdAt;
        this.userName = userName;
        this.view = view;
        this.saved = saved;
        this.loveIt = loveIt;
        this.description = description;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getLoveIt() {
        return loveIt;
    }

    public void setLoveIt(String loveIt) {
        this.loveIt = loveIt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
