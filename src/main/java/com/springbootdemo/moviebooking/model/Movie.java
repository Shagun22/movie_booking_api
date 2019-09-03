package com.springbootdemo.moviebooking.model;

public class Movie {


    private String title;

    public Movie() {

    }
    public Movie(String title) {
        super();
        this.title=title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    //getters and setters


    @Override
    public String toString() {
        return "Movie [title=" + title + "]";
    }
}