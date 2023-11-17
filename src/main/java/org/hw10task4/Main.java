package org.hw10task4;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Animal mouse = new Animal();
        File info = new File("src\\main\\java\\org\\hw10task4\\info.txt");

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(info))) {
            oos.writeObject(mouse);
            oos.flush();
        }
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(info))) {
            Animal newAnimal = (Animal) ois.readObject();
            System.out.println(newAnimal);
        }
    }
}
