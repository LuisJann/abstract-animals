package org.animal.exercize;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sleep(){
        System.out.println("ZzzzZzzzZzzZZzz...");
    }

    public abstract void sound();

    public abstract void eat();

}
