package org.animal.exercize;

public class Robin extends Animal{
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
}
