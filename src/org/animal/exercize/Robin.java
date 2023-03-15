package org.animal.exercize;

public class Robin extends Animal{
    public Robin(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Cip cip cip");
    }

    @Override
    public void eat() {
        System.out.println("Pizza");
    }
}
