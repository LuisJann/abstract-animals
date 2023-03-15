package org.animal.exercize;

public class Dolphine extends Animal{
    public Dolphine(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("EEEEE eeeee!!!");
    }

    @Override
    public void eat() {
        System.out.println("caramelle dufour");
    }
}
