package com.company;

public class Coffee extends Beverage implements Printable {
    private String sort;

    public Coffee(String name, String sort) {
        super(name);
        this.sort = sort;
    }

    public String getSort() {
        return sort;
    }

    @Override
    public void print() {
        System.out.println("Название напитка " + getName() + " Сорт Кофе " + getSort());
    }
}
