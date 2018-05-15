package com.visitoslo.tourguide;

/**
 * Created by user on 5/6/2018.
 * The Place class contains all the fields for different places like Hotels, Restaurants or Museums
 */

public class Place {

    private String name;
    private String address;
    private int imageResourceId;

    public Place(String name, String address, int imageResourceId) {
        this.name = name;
        this.address = address;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getAddress() {
        return address;
    }
}
