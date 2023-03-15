package org.animal.exercize;

public class Robin extends Animal implements Fly {
    public Robin(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Cip cip";
    }

    @Override
    public String eat() {
        return "pizza";
    }

    public void fly() {
        System.out.println("Sto volando!!!");
    }
}
