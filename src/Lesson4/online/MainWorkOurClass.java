package lesson4.online;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 08.02.2021
 */

public class MainWorkOurClass {

    public static void main(String[] args) {

        Hero hero1 = new Hero(150, 159, "Mario");
        Hero hero2 = new Hero(10, 500, "Сантехник Василий");

//        Hero hero3 = new Hero("Vasilii");
//
//        Hero hero4 = new Hero(357);
//
//        System.out.println("Нашего героя зовут: " + hero4.name);
//        System.out.println("Сколько здоровья у героя: " + hero4.health);
//        System.out.println("У героя " + hero4.name + " скорость " + hero4.speed);



//        hero1.health = 100;
//        hero1.speed = 25;
//        hero1.name = "Mario";
//
//        hero2.health = 250;
//        hero2.speed = 350;
//        hero2.name = "Сантехник Василий";

//        System.out.println("Нашего героя зовут: " + hero1.name);
//        System.out.println("Сколько здоровья у героя: " + hero1.health);
//        System.out.println("У героя " + hero1.name + " скорость " + hero1.speed);
//        System.out.println(hero1.weapon.attack);
        System.out.println(hero1.getHealth());
//        hero1.setHealth(280);
//        System.out.println(hero1.getHealth());
//
//        hero1.speak();
//        hero2.speak();
//
//        hero1.jump();
//        hero2.jump();

//        Hero.voice();
//        System.out.println(Hero.countLegs);
//
//        System.out.println(Math.log10(100));

//        Hero.Weapon.attack = 951;
//        System.out.println("Static field ATTACK in static class WEAPON = " + Hero.Weapon.attack);
//        Hero.Weapon weapon = new Hero.Weapon(159, 753);
//        System.out.println(weapon.attack);
    }

//    public static int doSomething(int value) {
//        int tmp = 35;
//        return (value * tmp + 50) / 4;
//    }

}

/**
 * 1 Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
 * 2 Конструктор класса должен заполнять эти поля при создании объекта;
 * 3 Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
 * 4 Вывести при помощи методов из пункта 3 ФИО и должность.
 * 5 Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
 * 6* Создать метод, повышающий зарплату всем сотрудникам старше 35 лет на 10000;
 * 7** При создании экземпляра класса Сотрудник присваивать ему уникальный порядковый номер.
 */
