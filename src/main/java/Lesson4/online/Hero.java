package lesson4.online;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 08.02.2021
 */

public class Hero {

    private int health;
    private int speed;
    private String name;
    private Weapon weapon;
    static int countLegs = 2;

//    Hero() {
//        name = "Mario";
//        health = 259;
//        speed = 1510;
//        weapon = new Weapon();
//    }
    public Hero (int health, int speed, String name){
        this.name = name;
        this.health = health;
        this.speed = speed;
        weapon = new Weapon(150, 850);
    }
//
//    Hero(String _name) {
//        name = _name;
//    }
//
//    Hero(int _health) {
//        health = _health;
//    }

    public static class Weapon {
        public static int attack;
        int attackSpeed;

        public Weapon(int atk, int aS) {
            attack = atk;
            attackSpeed = aS;
        }
    }

    void speak(){
        System.out.println(name + " says Hello Man!!!!! My health = " + health);
    }

    void jump(){
        System.out.println(name + " has jump " + speed + " m/s");
    }

    void heal(){
        System.out.println(name + " полечился на 50 единиц");
    }

    static void voice() {
        System.out.println("КРЯ!");
    }

    //Getters
    public int getHealth(){
        return health;
    }

    //Setters
    public void setHealth(int value) {
        health = value;
    }

}
