package com.nico;

public class Target {

    private House[] houses = new House[4];

    public Target() {
        Item[] alingNena = new Item[2];
        alingNena[0] = new Item("Dried Fish", 1.5);
        alingNena[1] = new Item("Sardines", 2.5);
        houses[0] = new House("Aling Nena's Kitchen", alingNena);

        Item[] trash = new Item[2];
        trash[0] = new Item("Whiskers Premium Wet Food", 25.0);
        trash[1] = new Item("Cockroach", 0.1);
        houses[1] = new House("Trash Bin", trash);

        Item[] garden = new Item[2];
        garden[0] = new Item("Snake", 1.5);
        garden[1] = new Item("Bone", 2.0);
        houses[2] = new House("Aling Nena's Backyard", garden);

        Item[] alingNenaStore = new Item[2];
        alingNenaStore[0] = new Item("Milk", 2.5);
        alingNenaStore[1] = new Item("A bag of chips", 6.5);
        houses[3] = new House("Aling Nena's Store", alingNenaStore);

    }

    public House[] getBuildings() {
        return houses;
    }
}
