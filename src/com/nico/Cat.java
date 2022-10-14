package com.nico;

public class Cat extends Individual {

    public static final int SUCCESS_PERCENTAGE = 90;

    public Cat(String name, String nickname, int age, String expertIn, Item[] items) {
        super(name, nickname, age, expertIn, items);
    }

    @Override
    public void printData() {
        System.out.println("Cat:");
        super.printData();
    }
}
