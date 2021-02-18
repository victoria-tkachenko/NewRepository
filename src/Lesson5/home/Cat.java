package Lesson5.home;

public class Cat extends Animals {

    public Cat (String animalType, String name, float runLength, float jumpHeight, float swimLength) {
        super(animalType, name, runLength, jumpHeight, swimLength);
    }

    @Override
    protected int swim(float distance) {
        return Animals.swimNo;
    }
}
