package com.example.eli.vegprices;

import java.util.ArrayList;
import java.util.HashMap;

import com.example.eli.vegprices.Vegtable_e;

/**
 * Created by Eli on 8/5/2017.
 */

public class Veg {
    String      name;
    String      imageUrl;
    float       price;
    static HashMap<Vegtable_e,Integer> vegEnumToImgId = new HashMap<>();

    public Veg(String name, float price, Vegtable_e vegKind_e) {
        this.name = name;
        this.price = price;
        this.vegKind_e = vegKind_e;
    }

    Vegtable_e  vegKind_e;

    public Veg(String name, float price, String imageUrl, Vegtable_e vegKind_e) {
        this.name = name;
        this.price = price;
        this.imageUrl = imageUrl;
        this.vegKind_e = vegKind_e;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {

        return name;
    }

    public float getPrice() {
        return price;
    }


    public Vegtable_e getVegKind_e() {
        return vegKind_e;
    }

    public void setVegKind_e(Vegtable_e vegKind_e) {
        this.vegKind_e = vegKind_e;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public static ArrayList<Veg> getDummyVegs(String s, MainActivity mainActivity) {

        ArrayList<Veg> arr = new ArrayList<Veg>();

        arr.add(0, new Veg("tomato",  (float) 0.0,Vegtable_e.TOMATO ));
        arr.add(1, new Veg("cucumber",(float) 1.1, Vegtable_e.CUCUMBER));
        arr.add(2, new Veg("papper",   (float) 2.2, Vegtable_e.PAPPER));

        return arr;
    }

    // init vegEnumToImgId hash map
    public static void Init() {
        vegEnumToImgId.put(Vegtable_e.CUCUMBER, R.drawable.cucumber);
        vegEnumToImgId.put(Vegtable_e.PAPPER, R.drawable.papper);
        vegEnumToImgId.put(Vegtable_e.TOMATO, R.drawable.tomato);
    }
}

