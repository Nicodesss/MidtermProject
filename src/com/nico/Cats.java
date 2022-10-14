package com.nico;

import java.util.Random;

public class Cats {

    private Cat[] cats = new Cat[2];
    private Random randomNumberGenerator = new Random();
    private double sumRobbedValue;

    Cats() {
        Item[] siomaiItems = new Item[2];
        siomaiItems[0] = new Item("Sharp Nails", 0);
        siomaiItems[1] = new Item("Half rotten apple", 0.0);
        Cat siomai = new Cat("Siomai", "The Sneaky Mingming", 8, "breaking in", siomaiItems);
        cats[0] = siomai;
        Item[] siopaoItems = new Item[2];
        siopaoItems[0] = new Item("Huge Paws", 0);
        siopaoItems[1] = new Item("Injured Paw", 0);
        Cat siopao = new Cat("Siopao", "The Chonki Mingming", 12, "knocking out", siopaoItems);
        cats[1] = siopao;
    }

    public double getSumRobbedValue() {
        return sumRobbedValue;
    }

    public void printCatsInfo() {
        for (Cat cat : cats) {
            System.out.println("---------------------------");
            cat.printData();
        }
    }

    private boolean isSuccessfulRobbery() {
        int randomNumber = randomNumberGenerator.nextInt(101);
        int summarizedSuccessChange = cats.length * Cat.SUCCESS_PERCENTAGE;
        if (randomNumber >= summarizedSuccessChange) {
            return false;
        }
        return true;
    }

    public void letsRob(House[] houses) {
        int randomBuildingIndex = randomNumberGenerator.nextInt(houses.length );
        System.out.println("-------------------------------");
        if (isSuccessfulRobbery()) {
            System.out.println("The cats managed to rob the following items from the " + houses[randomBuildingIndex].getName() + ":");
            for (Item item : houses[randomBuildingIndex].getItems()) {
                sumRobbedValue += item.getValue();
                System.out.println("-" + item.getName());
            }
        } else {
            System.out.println("The cats tried to rob the " + houses[randomBuildingIndex].getName() + " but they failed.");
        }

    }
}
