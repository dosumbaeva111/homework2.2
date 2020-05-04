package com.company;

public class Cocacola extends Beverage implements Printable {
    private double volume;

    public Cocacola(String name, double volume) {
        super(name);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
    public void getVolume(double volume) {
        this.volume = volume;
    }


    @Override
    public void print() {
        System.out.println("Название напитка " + getName() + "Год выдержки " + getVolume() + " L");
    }
}
