package com.javarush.darvin.module_2;

import com.javarush.darvin.module_2.herbivore.herbivoreImpl.*;
import com.javarush.darvin.module_2.predator.Predator;
import com.javarush.darvin.module_2.predator.predatorImpl.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Island {
    private static final int WIDTH = 10;
    private static final int HEIGHT = 10;
    private static final Rectangle boundsOfIsland = new Rectangle(0, 0, WIDTH, HEIGHT);

    public static final ArrayList<Animal>[][] island = new ArrayList[WIDTH][HEIGHT];
    private int newPositionX;
    private int newPositionY;
    private String CREATURES = "";
    public static Random random = new Random();

    public void addObjectsIntoFields() {
        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[i].length; j++) {
                island[i][j] = new ArrayList<>();
            }
        }

        //рандомно заполняю ячейки существами предварительно созданным методом
        for (int i = 0; i < 16; i++) {
            int randomWidth = random.nextInt(WIDTH);
            int randomHeight = random.nextInt(HEIGHT);

            island[randomWidth][randomHeight].add(getRandomAnimal());
        }
    }

    public void printInfo() {
        //вывожу всё это барахло на экран
        for (int x = 0; x < island.length; x++) {
            for (int y = 0; y < island[x].length; y++) {
                System.out.print("[");

                for (Animal animal : island[x][y]) {
                    CREATURES = CREATURES + animal.getName() + " ";
                }
                System.out.print(CREATURES.trim());
                System.out.print("]");
            }
            System.out.println();
        }
    }


    //рандомная генерация существа
    public static Animal getRandomAnimal() {

        return switch (random.nextInt(16)) {
            case 0 -> new Plants();
            case 1 -> new Eagle();
            case 2 -> new Fox();
            case 3 -> new Snake();
            case 4 -> new Wolf();
            case 5 -> new Buffalo();
            case 6 -> new Caterpillar();
            case 7 -> new Deer();
            case 8 -> new Duck();
            case 9 -> new Goat();
            case 10 -> new Hog();
            case 11 -> new Horse();
            case 12 -> new Mouse();
            case 13 -> new Rabbit();
            case 14 -> new Sheep();
            case 15 -> new Bear();
            default -> null;
        };
    }

    public void move() {

        try {

            for (int x = 0; x < island.length; x++) {
                for (int y = 0; y < island[x].length; y++) {
                    Iterator<Animal> animalIterator = island[x][y].iterator();

                    while (animalIterator.hasNext()) {
                        Animal animal = animalIterator.next();
                        System.out.println(animal.getName() + " starting to move");
                        String oldPosition = getPosition(island, animal);

                        int positionX = Integer.parseInt(oldPosition.split(" ")[0]);
                        int positionY = Integer.parseInt(oldPosition.split(" ")[1]);

                        System.out.println(animal.getName() + " is on the position " + getPosition(island, animal));

                        if (animal.getMovePerStep() > 0) {

                            for(int moves = 0; moves < 1; moves++) {
                                switch (animal.chooseTheWay()) {
                                    case LEFT -> {
                                        System.out.println(animal.getName() + " picked the direction " + Animal.Direction.LEFT.name());

                                        //движение по оси X влево
                                        newPositionX = positionX - animal.getMovePerStep();
                                        Point newCoordinate = new Point(newPositionX, positionY);

                                        if (boundsOfIsland.contains(newCoordinate)) {
                                            System.out.println("TEST: old position:" + positionX + "," + positionY + " new position:" + newPositionX + "," + positionY);
                                            island[newPositionX][positionY].add(animal);
                                            animalIterator.remove();
                                            break;
                                        }
                                    }
                                    case RIGHT -> {
                                        System.out.println(animal.getName() + " picked the direction " + Animal.Direction.RIGHT.name());

                                        //движение по оси X вправо
                                        newPositionX = positionX + animal.getMovePerStep();
                                        Point newCoordinate = new Point(newPositionX, positionY);

                                        if (boundsOfIsland.contains(newCoordinate)) {
                                            System.out.println("TEST: old position:" + positionX + "," + positionY + " new position:" + newPositionX + "," + positionY);
                                            island[newPositionX][positionY].add(animal);
                                            animalIterator.remove();
                                            break;
                                        }
                                    }
                                    case UP -> {
                                        System.out.println(animal.getName() + " picked the direction " + Animal.Direction.UP.name());

                                        //движение по оси Y вверх
                                        newPositionY = positionY - animal.getMovePerStep();
                                        Point newCoordinate = new Point(newPositionX, positionY);

                                        if (boundsOfIsland.contains(newCoordinate)) {
                                            System.out.println("TEST: old position:" + positionX + "," + positionY + " new position:" + positionX + "," + newPositionY);
                                            island[positionX][newPositionY].add(animal);
                                            animalIterator.remove();
                                            break;
                                        }
                                    }
                                    case DOWN -> {
                                        System.out.println(animal.getName() + " picked the direction " + Animal.Direction.DOWN.name());

                                        //движение по оси Y вниз
                                        newPositionY = positionY + animal.getMovePerStep();
                                        Point newCoordinate = new Point(newPositionX, positionY);

                                        if (boundsOfIsland.contains(newCoordinate)) {
                                            System.out.println("TEST: old position:" + positionX + "," + positionY + " new position:" + positionX + "," + newPositionY);
                                            island[positionX][newPositionY].add(animal);
                                            animalIterator.remove();
                                            break;
                                        }
                                    }
                                    default -> {
                                        System.out.println("Direction has not been picked");
                                    }
                                }
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

        for (int i = 0; i < DayOfWeek.values().length; i++) {
            move();
            System.out.println("Move was successful");
            getRandomAnimal().eat();

            try {
                Thread.sleep(millis);
            } catch (InterruptedException exception) {
                System.out.println("Interrupted exception has been occurred " + exception);
            }
            printInfo();
        }

    }

    public String getPosition(ArrayList<Animal>[][] animals, Animal positionOfTheAnimal) {

        for (int x = 0; x < animals.length; x++) {
            for (int y = 0; y < animals[x].length; y++) {

                for (Animal animal : animals[x][y]) {
                    if (animal == positionOfTheAnimal) {
                        return x + " " + y;
                    }
                }
            }
        }
        return "Position of the Animal has not found";
    }

}
