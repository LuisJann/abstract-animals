package org.animal.exercize;

public class Eagle extends Animal implements Fly{
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

    public void fly() {
        System.out.println("Sto volando!!!");
    }
}
