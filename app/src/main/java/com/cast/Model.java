package com.cast;

public class Model {

    private String title, subtitle1, subtitle2;

    public Model() {
    }

    public Model(String title, String genre, String year) {
        this.title = title;
        this.subtitle1 = genre;
        this.subtitle2 = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }



    public String getGenre() {
        return subtitle1;
    }

    public void setGenre(String genre) {
        this.subtitle1 = genre;
    }



    public String getYear() {
        return subtitle2;
    }

    public void setYear(String year) {
        this.subtitle2 = year;
    }
}