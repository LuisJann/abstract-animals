package org.animal.exercize;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quanti animali vuoi vedere?");

        Animal[] zoo = new Animal[Integer.parseInt(scan.next())];

        for (int i = 0; i < zoo.length; i++) {
            System.out.println("Che animale vuoi vedere ? D (dog) - R (robin) - Do (dolphine) - E (eagle)");
            String userChoice = scan.next();

            switch (userChoice){
                case "D" ->{
                    System.out.println("Che nome vuoi dare: ");
                    Dog dog = new Dog(scan.next());
                    System.out.println(dog.getName() + " Ti saluta");
                    System.out.println(dog.sound());
                    System.out.println("A lui piace molto mangiare: " + dog.eat());
                    zoo[i] = dog;
                } case "R"->{
                    System.out.println("Che nome vuoi dare: ");
                    Robin robin = new Robin(scan.next());
                    System.out.println(robin.getName() + " Ti saluta");
                    System.out.println(robin.sound());
                    System.out.println("A lui piace molto mangiare: " + robin.eat());
                    zoo[i] = robin;
                } case "Do"->{
                    System.out.println("Che nome vuoi dare: ");
                    Dolphine dolphine = new Dolphine(scan.next());
                    System.out.println(dolphine.getName() + " Ti saluta");
                    System.out.println(dolphine.sound());
                    System.out.println("A lui piace molto mangiare: " + dolphine.eat());
                    zoo[i] = dolphine;
                } case "E"->{
                    System.out.println("Che nome vuoi dare: ");
                    Eagle eagle = new Eagle(scan.next());
                    System.out.println(eagle.getName() + " Ti saluta");
                    System.out.println(eagle.sound());
                    System.out.println("A lui piace mangiare: " + eagle.eat());
                    zoo[i] = eagle;

                }

            }
        }
        for (Animal animal: zoo){
            if (animal instanceof Fly){
                DoFly((Fly) animal);
            }else{
                DoSwim((Swim) animal);
            }
        }

    }
    public static void DoFly(Fly flyer){
        flyer.fly();
    }
    public static void DoSwim(Swim swimmer){
        swimmer.swim();
    }
}