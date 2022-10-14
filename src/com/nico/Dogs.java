package com.nico;

import java.util.Random;

public class Dogs {

    private Dog dogs;

    Dogs() {
        Item[] brownyItems = new Item[2];
        brownyItems[0] = new Item("Menacing Huge Paws", 0);
        brownyItems[1] = new Item("Bark", 0);
        Dog browny = new Dog("Browny", "Askal", 15, "guarding", brownyItems);
        dogs = browny;
    }

    public boolean catchCats(Cats gang) {
        if (areCatssCaught()) {
            System.out.println(dogs.getName() + " managed to catch the cats");
            if (gang.getSumRobbedValue() > 0) {
                System.out.println("The stolen items are recovered.");
                System.out.println();
                System.out.println("Cats overall items stolen value is ₱" + gang.getSumRobbedValue());
            } else {
                System.out.println("The cats couldn't steal anything.");
            }
            return true;
        } else {
            System.out.println(dogs.getName() + " couldn't catch the cats.");
            System.out.println("They managed to steal items valued ₱" + gang.getSumRobbedValue());
            return false;
        }
    }

    private boolean areCatssCaught() {
        Random randomNumberGenerator = new Random();
        if (randomNumberGenerator.nextInt(101) >= Dog.SUCCESS_PERCENTAGE) {
            return false;
        }
        return true;
    }
    public void printDogData(){
        dogs.printBrownyData();
    }

}
