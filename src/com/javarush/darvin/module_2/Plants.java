package com.javarush.darvin.module_2;

public class Plants extends Animal {
    public int UNKNOWN = 0;

    public Plants() {
        setWeight(1.0);
        setCountAnimal(200);
        setMovePerStep(UNKNOWN);
        setMaxFoodForAnimal(UNKNOWN);
        setName("\uD83C\uDF31");
    }

    @Override
    public void eat() {}

    public void reproduction() {
        for (int x = 0; x < Island.getIsland().length; x++) {
            for (int y = 0; y < Island.getIsland()[x].length; y++) {

                for (Animal animal : Island.getIsland()[x][y]) {
                    if (animal instanceof Plants) {
                        Island.addObjectsIntoFields();
                    }
                }
            }
        }
    }

}
