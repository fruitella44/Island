package com.javarush.darvin.module_2;


public class Plants extends Animal {
    public int UNKNOWN = 0;
    private String CURRENT_POSITION;
    private int POSITION_X;
    private int POSITION_Y;
    private int counter;

    public Plants() {
        setWeight(1.0);
        setCountAnimal(200);
        setMovePerStep(UNKNOWN);
        setMaxFoodForAnimal(UNKNOWN);
        setName("\uD83C\uDF31");
    }

    public void eat() {}

    public void reproduction() {
        CURRENT_POSITION = getPosition();
        POSITION_X = Integer.parseInt(CURRENT_POSITION.split(" ")[0]);
        POSITION_Y = Integer.parseInt(CURRENT_POSITION.split(" ")[1]);

        for (int x = 0; x < Island.getField().length; x++) {
            for (int y = 0; y < Island.getField()[x].length; y++) {

                for (Animal plant : Island.getField()[x][y]) {
                    if (Island.getField()[x][y] == null && plant instanceof Plants && plant.getName().equals(this.getName())) {
                        Island.getField()[POSITION_X][POSITION_Y].add(plant);
                    }
                }
            }
        }
    }



}