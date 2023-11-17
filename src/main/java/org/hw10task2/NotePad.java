package org.hw10task2;

import java.lang.annotation.Inherited;

public class NotePad extends TextEditor {
    NotePad(String name, int yearOfCreation) {
        super(name, yearOfCreation);
    }

    @Override
    public void open() {
        super.open();
    }

    @Override
    public void close() {
        super.close();
    }

    @Override
    public TextFile createTextFile(String name) {
        return super.createTextFile(name);
    }

    @Override
    public void saveTextFileInWDFormat() {
        super.saveTextFileInWDFormat();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getYearOfCreation() {
        return super.getYearOfCreation();
    }

    @Override
    public void setYearOfCreation(int yearOfCreation) {
        super.setYearOfCreation(yearOfCreation);
    }

    @Override
    public boolean isOpened() {
        return super.isOpened();
    }

    @Override
    public void setOpened(boolean opened) {
        super.setOpened(opened);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
