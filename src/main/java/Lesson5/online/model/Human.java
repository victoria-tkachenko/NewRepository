package lesson5.online.model;

import java.util.Scanner;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 11.02.2021
 */

public abstract class Human {

    protected String name;
    protected int health;
    protected int age;
    protected int attack;
    protected String rank;

    public Human(String name, int health, int age, String rank, int attack) {
        this.name = name;
        this.health = health;
        this.age = age;
        this.rank = rank;
        this.attack = attack;
    }

    public abstract void write();

    public void speak() {
        System.out.println(name + " says something");
    }

    public void run() {
        System.out.println(name + " is running");
    }

    public void attack() {
        System.out.println(name + " is attack " + attack);
    }

    public void heal(int value) {
        this.health += value;
        System.out.println(name + " heal self " + value);
    }


}
