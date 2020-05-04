package com.company;

public class Jameson extends Beverage implements Printable {
    private int year;

    public Jameson(String name, int year) {
        super(name);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void print() {
        System.out.println("Название напитка " + getName() + " Год выдержки " + getYear());
    }
}
