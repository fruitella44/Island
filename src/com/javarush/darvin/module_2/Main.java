package com.javarush.darvin.module_2;

public class Main {

    public static void main(String[] args) {
        Island island = new Island();
        island.addObjectsIntoFields();
        island.printInfo();

        island.lifeCycle(1000);
    }
}
