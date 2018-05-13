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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
