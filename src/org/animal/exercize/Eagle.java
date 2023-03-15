package org.animal.exercize;

public class Eagle extends Animal{
    public Eagle(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "EEEEEEEeeeee";
    }

    @Override
    public String eat() {
        return "Carne";
    }
}
