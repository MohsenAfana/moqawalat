package com.am.moqawalat.model;

import android.graphics.drawable.Drawable;

public class Adverisemnet {

    public int image;
    public Drawable imageDrw;
    public String name;
    public String email;
    public boolean section = false;

    public Adverisemnet() {
    }

    public Adverisemnet(String name, boolean section) {
        this.name = name;
        this.section = section;
    }

}
