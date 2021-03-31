package Java2.Lesson3.Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        //1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
        System.out.println("Задание 1");

        Integer[] arr1 = {1, 2, 3, 4};
        GenClass<Integer> intArray = new GenClass<>(arr1);
        System.out.println("Начальный массив int: " + Arrays.toString(arr1));
        intArray.swap(arr1, 0, 1);
        System.out.println("Обработанный массив int: " + Arrays.toString(arr1));

        String[] arr2 = {"one", "two", "three", "four"};
        GenClass<String> stringArray = new GenClass<>(arr2);
        System.out.println("Начальный массив String: " + Arrays.toString(arr2));
        stringArray.swap(arr2, 0, 1);
        System.out.println("Обработанный массив String: " + Arrays.toString(arr2));


        //2. Задача:
//    a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
//    b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну
//    коробку нельзя сложить и яблоки, и апельсины;
//    c. Для хранения фруктов внутри коробки можно использовать ArrayList;
//    d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока
//    – 1.0f, апельсина – 1.5f (единицы измерения не важны);
//    e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут
//    в compare() в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать
//    коробки с яблоками и апельсинами;
//    f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов:
//    нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую
//    перекидываются объекты, которые были в первой;
//    g. Не забываем про метод добавления фрукта в коробку.

        System.out.println("\nЗадание 2");

        Orange orange = new Orange();

        ArrayList <Orange> orangeArrayList1 = new ArrayList<Orange>();
        Box <Orange> orangeBox1 = new Box<Orange>(orangeArrayList1);

        orangeBox1.addFruit(orange);
        orangeBox1.addFruit(orange);
        orangeBox1.addFruit(orange);

        ArrayList <Orange> orangeArrayList2 = new ArrayList<Orange>();
        Box <Orange> orangeBox2 = new Box<Orange>(orangeArrayList2);
        orangeBox2.addFruit(orange);
        orangeBox2.addFruit(orange);
        orangeBox2.addFruit(orange);
        orangeBox2.addFruit(orange);

        System.out.println("Вес коробки 1 с апельсинами: " + orangeBox1.getBoxWeight());
        System.out.println("Вес коробки 2 с апельсинами: " + orangeBox2.getBoxWeight());

        System.out.println("Сравнение веса коробки 1 и 2: " + orangeBox1.compareBoxes(orangeBox2));

        orangeBox1.moveToAnotherBox(orangeBox2);
        System.out.println("Вес коробки 2 с апельсинами: " + orangeBox2.getBoxWeight());
        //при вызове метода getWeight можно добавить чтобы словить IndexOutOfBound Exception












    }

}
