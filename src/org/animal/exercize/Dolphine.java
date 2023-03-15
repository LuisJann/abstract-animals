package org.animal.exercize;

public class Dolphine extends Animal implements Swim {
    public Dolphine(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Skreeeeee";
    }

    @Override
    public String eat() {
        return "caramelle dufour";
    }

    public void swim() {
        System.out.println("Sto nuotando!!!");
    }
}
