package Java2.Lesson3.Homework;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fruitList = new ArrayList<>();

    private double totalWeight;

    public Box(ArrayList<T> fruitList) {
        this.fruitList = fruitList;
    }

    public ArrayList<T> getFruitList() {
        return fruitList;
    }

    public void setFruitList(ArrayList<T> fruitList) {
        this.fruitList = fruitList;
    }

    public float getBoxWeight() {
        return fruitList.size() * fruitList.get(0).getWeight();
    }

    public boolean compareBoxes(Box<?> box) {
        return this.getBoxWeight() == box.getBoxWeight();
    }

    public void moveToAnotherBox(Box<T> box) {
        fruitList.addAll(fruitList);// тут видимо что-то не совсем так, потому что вес коробки в итоге не меняется.
        fruitList.clear();
    }

    public void addFruit(T fruit) {
        fruitList.add(fruit);
        totalWeight = totalWeight + fruit.getWeight();
    }

    public double getTotalWeight() {
        return totalWeight;
    }
}
