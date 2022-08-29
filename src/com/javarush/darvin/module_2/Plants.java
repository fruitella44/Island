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

    @Override
    public void eat() {}

    public void reproduction() {
        CURRENT_POSITION = getPosition();
        POSITION_X = Integer.parseInt(CURRENT_POSITION.split(" ")[0]);
        POSITION_Y = Integer.parseInt(CURRENT_POSITION.split(" ")[1]);

        for (int x = 0; x < Island.getIsland().length; x++) {
            for (int y = 0; y < Island.getIsland()[x].length; y++) {

                for (Animal animal : Island.getIsland()[x][y]) {
                    if (Island.getIsland()[x][y] == null && animal instanceof Plants && animal.getName().equals(this.getName())) {
                        Island.getIsland()[POSITION_X][POSITION_Y].add(animal);
                    }
                }
            }
        }
    }

}
