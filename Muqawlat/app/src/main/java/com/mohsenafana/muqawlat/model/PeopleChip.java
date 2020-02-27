package com.mohsenafana.muqawlat.model;

import android.graphics.drawable.Drawable;
import android.net.Uri;


public class PeopleChip   {

    private String id;
    private Drawable image;
    private String name;
    private String info;

    public PeopleChip(String id, Drawable image, String name, String info) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.info = info;
    }


    public Object getId() {
        return id;
    }

    public Uri getAvatarUri() {
        return null;
    }

    public Drawable getAvatarDrawable() {
        return image;
    }

    public String getLabel() {
        return name;
    }


    public String getInfo() {
        return info;
    }
}