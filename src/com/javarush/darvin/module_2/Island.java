package com.javarush.darvin.module_2;

import com.javarush.darvin.module_2.herbivore.herbivoreImpl.*;
import com.javarush.darvin.module_2.predator.predatorImpl.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Island {
    private final int WIDTH = 20;
    private final int HEIGHT = 20;
    private int newPositionX;
    private int newPositionY;

    private final Object[][] fields = new Object[WIDTH][HEIGHT];
    private final List<Plants> plantsList = new ArrayList<>();
    private final List<Animal> animalList = new ArrayList<>();
    private final List<Animal> animalsOnIsland = new ArrayList<>();

    public Object[][] getFields() {
        return fields;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public List<Plants> getPlantsList() {
        return plantsList;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }


    public void addPlants() {
        plantsList.add(new Plants());
    }

    public void addAnimal() {
        animalList.add(new Bear());
        animalList.add(new Eagle());
        animalList.add(new Fox());
        animalList.add(new Snake());
//        animalList.add(new Wolf());
//        animalList.add(new Buffalo());
//        animalList.add(new Caterpillar());
//        animalList.add(new Deer());
//        animalList.add(new Duck());
//        animalList.add(new Goat());
//        animalList.add(new Hog());
//        animalList.add(new Horse());
//        animalList.add(new Mouse());
//        animalList.add(new Rabbit());
//        animalList.add(new Sheep());
    }

    public static int getRandomNumber(int maxNumber) {
        return new Random().nextInt(maxNumber);
    }

    public void addObjectsIntoField() {

        for (Animal animal : animalList) {
            int width = getRandomNumber(WIDTH);
            int height = getRandomNumber(HEIGHT);

            if (fields[width][height] == null) {
                fields[width][height] = animal;
                animalsOnIsland.add(animal);
                System.out.println(animal.getName() + " is on position " + getPosition(fields, animal));
            }
            //Дописать else если два животных выпадают на одно поле после генерации рандома
        }

        for (int y = 0; y < fields.length; y++) {
            for (int x = 0; x < fields[y].length; x++) {
                if (fields[x][y] == null) {
                    fields[x][y] = new Plants();
                }
            }
        }
    }

    public void printInfo() {
        for (int y = 0; y < fields.length; y++) {
            for (int x = 0; x < fields[y].length; x++) {
                System.out.print(fields[x][y] + " ");
            }
            System.out.println();
        }
    }

    public void move() {
        try {

            for (Animal animal : animalsOnIsland) {
                System.out.println(animal.getName() + " starting to move");
                String oldPosition = getPosition(fields, animal);

                int positionX = Integer.parseInt(oldPosition.split(" ")[0]);
                int positionY = Integer.parseInt(oldPosition.split(" ")[1]);
                System.out.println(animal.getName() + " текущая позиция " + getPosition(fields, animal));

                if (animal.getMovePerStep() > 0) {
                    switch (animal.chooseTheWay()) {
                        case LEFT -> {
                            System.out.println(animal.getName() + " picked the direction " + Animal.Direction.LEFT.name());
                            if ((positionX - animal.getMovePerStep()) <= 0) {
                                //newPositionX = WIDTH - (animal.getMovePerStep() - positionX);
                                newPositionX = 0;
                            } else {
                                newPositionX = positionX - animal.getMovePerStep();
                            }
                            fields[newPositionX][positionY] = animal;
                            fields[positionX][positionY] = new Plants();

                        }
                        case RIGHT -> {
                            System.out.println(animal.getName() + " picked the direction " + Animal.Direction.RIGHT.name());
                            if ((positionX + animal.getMovePerStep()) >= WIDTH) {
                                newPositionX = WIDTH;
                            } else {
                                newPositionX = positionX + animal.getMovePerStep();
                            }

                            fields[newPositionX][positionY] = animal;
                            fields[positionX][positionY] = new Plants();
                        }
                        case UP -> {
                            System.out.println(animal.getName() + " picked the direction " + Animal.Direction.UP.name());
                            if ((positionY - animal.getMovePerStep()) <= 0) {
                                newPositionY = 0;
                            } else {
                                newPositionY = positionY - animal.getMovePerStep();
                            }

                            fields[positionX][newPositionY] = animal;
                            fields[positionX][positionY] = new Plants();

                        }
                        case DOWN -> {
                            System.out.println(animal.getName() + " picked the direction " + Animal.Direction.DOWN.name());
                            if ((positionY + animal.getMovePerStep()) >= HEIGHT) {
                                newPositionY = HEIGHT;
                            } else {
                                newPositionY = positionY + animal.getMovePerStep();
                            }

                            fields[positionX][newPositionY] = animal;
                            fields[positionX][positionY] = new Plants();

                        }
                        case STAY -> {
                            System.out.println(animal.getName() + " picked the direction " + Animal.Direction.STAY.name());
                            fields[positionX][positionY] = animal;
                        }
                        default -> {
                            System.out.println("Direction was wrong");
                        }
                    }


                }
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Граница поля " + exception);
        }
    }

    public void lifeCycle(long millis) {
        for (int i = 0; i < 3; i++) {
            move();
            System.out.println("Move was successful");
            try {
                Thread.sleep(millis);
            } catch (InterruptedException exception) {
              System.out.println("Interrupted exception has been occured " + exception);
            }
            printInfo();
        }

    }

    public String getPosition(Object[][] animals, Animal positionOfTheAnimal) {

        for (int x = 0; x < animals.length; x++) {
            for (int y = 0; y < animals[x].length; y++) {

                if (animals[x][y] == positionOfTheAnimal) {
                    return x + " " + y;
                }
            }
        }
        return "Position of the Animal has not found";
    }

}
