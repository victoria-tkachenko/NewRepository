package Lesson5.home;

public class Animals {

    static int swimFail = 0;
    static int swimCan = 1;
    static int swimNo = -1;

    private String animalType;
    private String name;
    private float runLength;
    private float jumpHeight;
    private float swimLength;

    public Animals(String animalType, String name, float runLength, float jumpHeight, float swimLength) {
        this.animalType = animalType;
        this.name = name;
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
        this.swimLength = swimLength;
    }

    String getAnimalType() {
        return this.animalType;
    }

    String getName() {
        return this.name;
    }

    float getRunLength() {
        return this.runLength;
    }

    float getJumpHeight() {
        return this.jumpHeight;
    }

    float getSwimLength() {
        return this.swimLength;
    }

    protected boolean run(float distance) {
        return (distance <= runLength);
    }

    protected boolean jump(float height) {
        return (height <= jumpHeight);
    }

    protected int swim(float distance) {
        return (distance <= swimLength) ? swimCan : swimFail;
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