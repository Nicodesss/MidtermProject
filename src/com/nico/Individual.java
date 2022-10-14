package com.nico;

public abstract class Individual {
    private String name;
    private String nickname;
    private int age;
    private String expertIn;
    private Item[] items;

    public Individual(String name, String nickname, int yearOfBorn, String expertIn, Item[] items) {
        this.name = name;
        this.nickname = nickname;
        this.age = yearOfBorn;
        this.expertIn = expertIn;
        this.items = items;
    }

    public void printData() {
        System.out.println("Name: " + name + " (" + nickname + ")");
        System.out.println("Cat age: " + age);
        System.out.println("Expert in: " + expertIn);
        System.out.println("Abilities:");
        for (Item item : items) {
            System.out.println("-" + item.getName());
        }
    }
    public void printBrownyData() {
        System.out.println("Name: " + name + " (" + nickname + ")");
        System.out.println("Dog age: " + age);
        System.out.println("Expert in: " + expertIn);
        System.out.println("Abilities:");
        for (Item item : items) {
            System.out.println("-" + item.getName());
        }
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }
}
