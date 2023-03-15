package org.animal.exercize;

public class Eagle extends Animal{
    public Eagle(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("skreeee");
    }

    @Override
    public void eat() {
        System.out.println("Carne");
    }
}
