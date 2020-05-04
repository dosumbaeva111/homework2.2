package com.company;

public class Beverage implements Printable {
    private String name;

    public String getName() {
        return name;
    }

    public Beverage(String name) {
        this.name = name;
    }

    @Override
    public void print() {

    }
}
