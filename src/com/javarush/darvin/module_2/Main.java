package com.javarush.darvin.module_2;

public class Main {

    public static void main(String[] args) {
        Island island = new Island();
        island.addAnimal();
        island.addObjectsIntoField();
        island.addPlants();
        island.printInfo();


        //test
        island.lifeCycle(1000);
    }
}
