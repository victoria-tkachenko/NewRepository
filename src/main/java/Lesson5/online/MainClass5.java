package Lesson5.online;

import lesson5.online.model.Human;

import javax.jws.Oneway;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 11.02.2021
 */

public class MainClass5 {

    public static void main(String[] args) {

//        int i = 100;
//        System.out.println(i);
//        byte b = (byte) i; //-128..127
//        System.out.println(b);
//
//        byte myByte = 120;
//        int myInt = myByte;
//        System.out.println(myInt);
//
//        System.out.println(i++);
//        System.out.println(--i);
//        System.out.println(i);
        Soldier soldier = new Soldier("Soldier", 100, 25, "Capitan", 50);
        Sapper sapper = new Sapper("Sapper", 80, 26, "Colonel", 10);
        Sniper sniper = new Sniper("Sniper", 50, 28, "Admiral", 150);
        Soldier soldierUp = new Soldier("SoldierUP", 150, 29, "General", 75, 50);
        Engineer engineer = new Engineer("Engineer", 80, 32, "Colonel", 10, 100);

//        Human human = new Human("Human", 100, 25, "Capitan", 50);

        engineer.write();

        Human[] army = {soldier, sapper, sniper, soldierUp, engineer};

        for (int i = 0; i < army.length; i++) {
            army[i].attack();
            army[i].speak();
            if (army[i] instanceof Engineer) {
//                Engineer engineerTmp = (Engineer) army[i];
//                engineerTmp.superAttack();
                ((Engineer) army[i]).superAttack();
            }
        }

        String myString = "Hello_world";
        int myInt = 500;
        Human testSoldier = new Soldier("SoldierUP", 150, 29, "General", 75);
        boolean myBoolean = true;

        Object[] arrayMyObjs = new Object[4];
        arrayMyObjs[0] = myString;
        arrayMyObjs[1] = myInt;
        arrayMyObjs[2] = testSoldier;
        arrayMyObjs[3] = myBoolean;

        for (int i = 0; i < arrayMyObjs.length; i++) {
            if (arrayMyObjs[i] instanceof Human) {
                Soldier tmp = (Soldier) arrayMyObjs[i];
                tmp.attack();
//                ((Soldier) arrayMyObjs[i]).attack();
            }

            if (arrayMyObjs[i] instanceof String) {
                String tmp = (String) arrayMyObjs[i];
                System.out.println(tmp.length());
//                System.out.println(((String) arrayMyObjs[i]).length());
            }
        }


//        System.out.println(engineer.toString());
//        System.out.println(soldier.equals(soldier));
//        soldier.attack();
//        soldier.speak();
//        soldier.run();
//
//        soldier.speak();
//        sapper.speak();
//        engineer.speak();
//        sniper.speak();
//
//        engineer.speak();
//        engineer.attack();
//        engineer.run();
//        engineer.heal(150);
//        engineer.superAttack();
//
//        soldierUp.attack();
//        soldier.speak();
//        soldier.run();
//
//        engineer.attack();
//        engineer.speak();
//        engineer.run();
//
//        sapper.speak();
//        sniper.run();


    }

}

/**
 1. Создать классы Собака, Лошадь, Птица и Кот с наследованием от класса Животное.

 2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
 В качестве параметра каждому методу передается величина, означающая или длину
 препятствия (для бега и плавания), или высоту (для прыжков).

 3. У каждого животного есть ограничения на действия
 (бег: кот 200 м., собака 500 м., Лошадь 1500 м., Птица 5 м.,;
 прыжок: кот 2 м., собака 0.5 м., Лошадь 3 м., Птица 0.2 м. ;
 плавание: кот и птица не умеет плавать, собака 10 м., лошадь 100 м.).

 4. При попытке животного выполнить одно из этих действий,
 оно должно сообщить результат.
 (Например, dog1.run(150); -> результат: 'Пёсик пробежал!')

 5. * Добавить животным разброс в ограничениях.
 То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.

 **/
