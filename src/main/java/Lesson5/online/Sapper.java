package Lesson5.online;

import lesson5.online.model.Human;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 11.02.2021
 */

public class Sapper extends Human {

    public Sapper(String name, int health, int age, String rank, int attack) {
        super(name, health, age, rank, attack);
    }

    @Override
    public void write(){
        System.out.println("i Can Write-Write");
    }
}
