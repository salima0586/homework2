package com.company;

public class Mersedes extends CAR implements Printable  {
    private   String name;
    private   String color;

    public Mersedes(String name, String color) {
        this.name = name;
        this.color = color;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println("name"+ getName() + "\n color"+getColor()
        );

    }
}
