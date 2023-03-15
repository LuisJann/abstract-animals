package org.animal.exercize;

public class Dog extends Animal implements Swim {
    public Dog(String name) {
        super(name);
    }

    public void swim() {
        System.out.println("Sto nuotando!!!");
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
