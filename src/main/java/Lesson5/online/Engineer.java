package Lesson5.online;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 11.02.2021
 */

public class Engineer extends Soldier {

    public Engineer(String name, int health, int age, String rank, int attack, int knowledge) {
        super(name, health, age, rank, attack, knowledge);
    }

    public void superAttack(){
        System.out.println(name + " superAttack");
    }


}
