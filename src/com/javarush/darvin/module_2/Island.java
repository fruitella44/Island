package com.javarush.darvin.module_2;

import com.javarush.darvin.module_2.herbivore.herbivoreImpl.*;
import com.javarush.darvin.module_2.predator.predatorImpl.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Island {
    private static final int WIDTH = 5;
    private static final int HEIGHT = 5;
    private int newPositionX;
    private int newPositionY;

    private static Random random = new Random();
    private static final int TYPE_OF_ANIMAL = 16;
    private final int DAYS = 10;
    private final int ACTIONS = 2;

    private static final Rectangle BOUNDS_OF_ISLAND = new Rectangle(0, 0, WIDTH, HEIGHT);
    private static ArrayList<Animal>[][] field = new ArrayList[WIDTH][HEIGHT];
    private final ExecutorService service = Executors.newCachedThreadPool();


    public static ArrayList<Animal>[][] getField() {

        return field;
    }

    public static void addCreatureIntoField() {
        for (int x = 0; x < field.length; x++) {
            for (int y = 0; y < field[x].length; y++) {
                field[x][y] = new ArrayList<>();
            }
        }

        for (int i = 0; i < TYPE_OF_ANIMAL; i++) {
            int randomWidth = random.nextInt(WIDTH);
            int randomHeight = random.nextInt(HEIGHT);

            field[randomWidth][randomHeight].add(getRandomAnimal());
        }
    }

    private void printInfo() {
        String creatures = "";

        for (int x = 0; x < field.length; x++) {
            for (int y = 0; y < field[x].length; y++) {
                System.out.print("[");

                for (Animal animal : field[x][y]) {
                    creatures = creatures + animal.getName() + " ";
                }
                System.out.print(creatures.trim());
                System.out.print("]");
            }
            System.out.println();
        }
    }


    private static Animal getRandomAnimal() {

        return switch (random.nextInt(TYPE_OF_ANIMAL)) {
            case 0 -> new Plants();
            case 1 -> new Bear();
            case 2 -> new Eagle();
            case 3 -> new Fox();
            case 4 -> new Snake();
            case 5 -> new Wolf();
            case 6 -> new Buffalo();
            case 7 -> new Caterpillar();
            case 8 -> new Deer();
            case 9 -> new Duck();
            case 10 -> new Goat();
            case 11 -> new Hog();
            case 12 -> new Horse();
            case 13 -> new Mouse();
            case 14 -> new Rabbit();
            case 15 -> new Sheep();
            default -> null;
        };
    }

    public void move() {

        try {

            for (int x = 0; x < field.length; x++) {
                for (int y = 0; y < field[x].length; y++) {
                    Iterator<Animal> animalIterator = field[x][y].iterator();

                    while (animalIterator.hasNext()) {
                        Animal animal = animalIterator.next();
                        String currentPosition = animal.getPosition();

                        int positionX = Integer.parseInt(currentPosition.split(" ")[0]);
                        int positionY = Integer.parseInt(currentPosition.split(" ")[1]);

                        if (animal.getMovePerStep() > 0) {
                            switch (animal.chooseTheWay()) {
                                case LEFT -> {
                                    newPositionX = positionX - animal.getMovePerStep();
                                    Point newCoordinate = new Point(newPositionX, positionY);

                                    if (BOUNDS_OF_ISLAND.contains(newCoordinate)) {
                                        field[newPositionX][positionY].add(animal);
                                        animalIterator.remove();
                                    }
                                }
                                case RIGHT -> {
                                    newPositionX = positionX + animal.getMovePerStep();
                                    Point newCoordinate = new Point(newPositionX, positionY);

                                    if (BOUNDS_OF_ISLAND.contains(newCoordinate)) {
                                        field[newPositionX][positionY].add(animal);
                                        animalIterator.remove();
                                    }
                                }
                                case UP -> {
                                    newPositionY = positionY - animal.getMovePerStep();
                                    Point newCoordinate = new Point(newPositionX, positionY);

                                    if (BOUNDS_OF_ISLAND.contains(newCoordinate)) {
                                        field[positionX][newPositionY].add(animal);
                                        animalIterator.remove();
                                    }
                                }
                                case DOWN -> {
                                    newPositionY = positionY + animal.getMovePerStep();
                                    Point newCoordinate = new Point(newPositionX, positionY);

                                    if (BOUNDS_OF_ISLAND.contains(newCoordinate)) {
                                        field[positionX][newPositionY].add(animal);
                                        animalIterator.remove();
                                    }
                                }

                                default -> System.out.println("Direction has not been picked");
                            }
                        }
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Animal was stood on the same position");
        }
    }

    public void lifeCycle(long millis) {

        for (int i = 0; i < DAYS; i++) {
            service.submit(this::move);
            service.submit(this::doAction);

            try {
                Thread.sleep(millis);
            } catch (InterruptedException exception) {
                System.out.println("Interrupted exception has been occurred " + exception);
            }

            printInfo();
        }

    }

    private void doAction() {
        for (int i = 0; i < ACTIONS; i++) {
            checkAnimalPosition();
        }
    }

    private void checkAnimalPosition() {

        for (int i = 0; i < ACTIONS; i++) {

            for (ArrayList<Animal>[] islandLists : field) {
                for (ArrayList<Animal> animalList : islandLists) {

                    for (Animal animal : animalList) {
                        service.submit(animal::eat);
                        service.submit(animal::reproduction);
                    }
                }
            }
        }
    }

}