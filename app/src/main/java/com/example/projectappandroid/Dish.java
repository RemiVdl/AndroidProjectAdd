package com.example.projectappandroid;

public class Dish {

    private String Name;
    private String Description;
    private double price;
    private int Image;

    public Dish() {
    }

    public Dish(String name, String description, double price, int image) {
        Name = name;
        Description = description;
        this.price = price;
        Image = image;
    }

    //getters


    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }

    public double getPrice() {
        return price;
    }

    public int getImage() {
        return Image;
    }

    //setters


    public void setName(String name) {
        Name = name;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setImage(int image) {
        Image = image;
    }

}
