package com.example.wvand.friendsr;

import java.io.Serializable;

// Defining the friend class
public class Friend implements Serializable {
    private String name, bio;
    private int drawableId;
    private float rating;

    // Constructor for the friends class
    public Friend(String name, String bio, int drawableId) {
        this.name = name;
        this.bio = bio;
        this.drawableId = drawableId;
    }

    public String getName() {
        return name;
    }

    public String getBio() {

        return bio;
    }

    public int getDrawableId() {

        return drawableId;
    }

    public float getRating() {

        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
