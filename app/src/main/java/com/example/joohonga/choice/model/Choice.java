package com.example.joohonga.choice.model;

import android.net.Uri;

public class Choice {
    private String choice;
    private String category;
    private Uri image;

    public Choice(String choice) {
        this.choice = choice;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public Uri getImage() {
        return image;
    }

    public void setImage(Uri image) {
        this.image = image;
    }
}
