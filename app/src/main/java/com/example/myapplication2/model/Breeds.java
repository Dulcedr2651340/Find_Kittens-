package com.example.myapplication2.model;

public class Breeds {

        private Integer id;

        private String name;

        private String life_span;

        private String origin;

        private String temperament;

        private String image_url;


        public Breeds(){

        }

        public Breeds(Integer id, String name, String life_span, String origin, String temperament, String image_url){

            this.id = id;
            this.name = name;
            this.life_span = life_span;
            this.origin = origin;
            this.temperament = temperament;
            this.image_url = image_url;
        }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLife_Span() {
        return life_span;
    }

    public void setLife_Span(String life_span) {
        this.life_span = life_span;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getTemperament() {
        return temperament;
    }

    public void setTemperament(String temperament) {
        this.temperament = temperament;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
}
