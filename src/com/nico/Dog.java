package com.nico;

public class Dog extends Individual {

    public static final int SUCCESS_PERCENTAGE = 50;

    public Dog(String name, String nickname, int yearOfBorn, String expertIn, Item[] items) {
        super(name, nickname, yearOfBorn, expertIn, items);
    }

    @Override
    public void printBrownyData() {
        System.out.println("---------------------------");
        System.out.println("Dog:");
        super.printBrownyData();
    }
}
