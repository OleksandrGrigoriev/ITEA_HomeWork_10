package org.hw10task2;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;

@Editor
public abstract class TextEditor {
    private String name;
    private int yearOfCreation;
    boolean opened;

    TextEditor(String name, int yearOfCreation) {
        this.name = name;
        this.yearOfCreation = yearOfCreation;
        opened = false;
    }

    public TextFile createTextFile(String name) {
        return new TextFile(name);
    }

    public void open() {
        if (!opened) {
            opened = true;
            System.out.println(this.name + "is opened.");
        }
    }

    public void close() {
        if (opened) {
            opened = false;
            System.out.println(this.name + "is closed.");
        }
    }

    @SuppressWarnings(value = "deprecation")
    @Deprecated
    public void saveTextFileInWDFormat() {
        System.out.println("File saved in WD format.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(int yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    public boolean isOpened() {
        return opened;
    }

    public void setOpened(boolean opened) {
        this.opened = opened;
    }

    @Override
    public String toString() {
        return "TextEditor{" +
                "name='" + name + '\'' +
                ", yearOfCreation=" + yearOfCreation +
                ", opened=" + opened +
                '}';
    }
}
