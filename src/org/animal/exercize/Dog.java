package org.animal.exercize;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "BAU BAU";
    }

    @Override
    public String eat() {
        return "Carne";
    }
}
