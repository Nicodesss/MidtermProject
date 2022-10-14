package com.nico;

public class Target {

    private House[] houses = new House[4];

    public Target() {
        Item[] alingNena = new Item[2];
        alingNena[0] = new Item("Dried Fish", 15);
        alingNena[1] = new Item("Sardines", 25);
        houses[0] = new House("Aling Nena's Kitchen", alingNena);

        Item[] trash = new Item[2];
        trash[0] = new Item("Whiskers Premium Wet Food", 50);
        trash[1] = new Item("Cockroach", 0.1);
        houses[1] = new House("Trash Bin", trash);

        Item[] garden = new Item[2];
        garden[0] = new Item("Snake", 2);
        garden[1] = new Item("Bone", 5);
        houses[2] = new House("Aling Nena's Backyard", garden);

        Item[] alingNenaStore = new Item[2];
        alingNenaStore[0] = new Item("Milk", 15);
        alingNenaStore[1] = new Item("A bag of chips", 7);
        houses[3] = new House("Aling Nena's Store", alingNenaStore);

    }

    public House[] getHouses() {
        return houses;
    }
}
