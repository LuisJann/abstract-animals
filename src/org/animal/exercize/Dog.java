package org.animal.exercize;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Bau bau");
    }

    @Override
    public void eat() {
        System.out.println("Carne");
    }
}
