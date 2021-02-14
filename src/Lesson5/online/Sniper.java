package Lesson5.online;

import lesson5.online.model.Human;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 11.02.2021
 */

public class Sniper extends Human {

    public Sniper(String name, int health, int age, String rank, int attack) {
        super(name, health, age, rank, attack);
    }

    @Override
    public void speak() {
        System.out.println("213213213213132131");
    }

    @Override
    public void heal(int value) {
        this.health += value * 2;
        System.out.println(name + " good heal self " + value);
    }

    @Override
    public void write(){
        System.out.println("i Can Write-Write-Write");
    }

}
