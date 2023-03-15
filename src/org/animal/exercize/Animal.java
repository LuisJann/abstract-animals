package org.animal.exercize;

public abstract class Animal {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sleep(){
        System.out.println("ZzzzZzzzZzzZZzz...");
    }

    public abstract String sound();

    public abstract String eat();

}
