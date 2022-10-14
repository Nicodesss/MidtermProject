package com.nico;

public class CatsAndDogs {

    public static void main(String[] args) {
        Target target = new Target();
        Cats cats = new Cats();
        Dogs dogs = new Dogs();

        cats.printCatsInfo();
        dogs.printDogData();

        do {
            cats.letsRob(target.getBuildings());
        } while (!dogs.catchCats(cats));
    }
}
