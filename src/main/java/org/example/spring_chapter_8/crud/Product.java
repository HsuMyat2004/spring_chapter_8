package org.example.spring_chapter_8.crud;

public class Product {
    private String name;
    private double price;

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }
}
