package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("CocaCola").print();
        createObject("Coffee").print();
        createObject("Jameson").print();
    }

    public static Beverage createObject(String className) {
        Beverage beverage = null;
        switch (className) {
            case "CocaCola":
                beverage = new Cocacola("CocaCola", 2);
                break;
            case "Coffee":
                beverage = new Coffee("Latte", "Arabica");
                break;
            case "Jameson":
                beverage = new Jameson("Jameson", 1997);
                break;

        }
        return beverage;
    }
}
