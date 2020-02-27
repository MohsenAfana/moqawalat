package com.mohsenafana.muqawlat.Data;

import android.content.Context;
import android.content.res.TypedArray;

import androidx.appcompat.content.res.AppCompatResources;


import com.mohsenafana.muqawlat.R;
import com.mohsenafana.muqawlat.Tools.MaterialColor;
import com.mohsenafana.muqawlat.model.Image;
import com.mohsenafana.muqawlat.model.Inbox;
import com.mohsenafana.muqawlat.model.MusicAlbum;
import com.mohsenafana.muqawlat.model.MusicSong;
import com.mohsenafana.muqawlat.model.News;
import com.mohsenafana.muqawlat.model.ShopCategory;
import com.mohsenafana.muqawlat.model.ShopProduct;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class DataGenerator {


    public static List<People> getPeopleData(Context ctx) {
        List<People> items = new ArrayList<>();
        TypedArray drw_arr = ctx.getResources().obtainTypedArray(R.array.sample_images);
        String name_arr[] = ctx.getResources().getStringArray(R.array.people_names);

        for (int i = 0; i < drw_arr.length(); i++) {
            People obj = new People();
            obj.image = drw_arr.getResourceId(i, -1);
            obj.name = name_arr[i];
            obj.email = Tools.getEmailFromName(obj.name);
            obj.imageDrw = ctx.getResources().getDrawable(obj.image);
            items.add(obj);
        }
        Collections.shuffle(items);
        return items;
    }


}
