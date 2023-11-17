package org.hw10task5;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("src\\main\\java\\org\\hw10task5\\info.txt");
        Person person = new Person("Alex", "Programmer");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            // Серіалізуємо об'єкт Car у байт-код
            oos.writeObject(person);
            oos.flush();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            // Десеріалізуємо об'єкт Car з байт-коду
            // При десеріалізації викликається конструктор суперкласу
            Person newPersaon = (Person) ois.readObject();
            System.out.println(newPersaon);
        }
    }
}
