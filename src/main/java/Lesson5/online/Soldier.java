package Lesson5.online;

import lesson5.online.model.Human;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 11.02.2021
 */

public class Soldier extends Human {

    int knowledge;

    public Soldier(String name, int health, int age, String rank, int attack) {
        super(name, health, age, rank, attack);
        this.knowledge = 0;
    }

    public Soldier(String name, int health, int age, String rank, int attack, int knowledge) {
        super(name, health, age, rank, attack);
        this.knowledge = knowledge;

    }

    @Override
    public void write(){
        System.out.println("i Can Write");
    }



}
