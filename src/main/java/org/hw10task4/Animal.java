package org.hw10task4;

import java.io.Serializable;

public class Animal implements Serializable {
    final String name;
    int age;
    public String breed;
    protected String color;
    public static int countOfAnimals = 0;
    public static final boolean isCat = false;
    private static boolean afraidOfDogs;
    private static final boolean isSomeAnimal = true;

    Animal() {
        name = "Jerry";
        age = 2;
        breed = "Mouse Simplificus";
        color = "Grey";
        afraidOfDogs = false;
    }

    public Animal createAnimal() {
        if (countOfAnimals == 0) {
            countOfAnimals++;
            return new Animal();
        }  else {
            System.out.println("Mouse already exists!");
        }
        return null;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
