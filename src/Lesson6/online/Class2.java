package lesson6.online;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 15.02.2021
 */

public class Class2 {

    public static void main(String[] args) {
        Class1 class1 = new Class1(10);
        class1.getTempArray()[0] = 15;

        for (int i = 0; i < class1.getTempArray().length; i++) {
            class1.getTempArray()[i] = i * 10;
        }

        for (int i = 0; i < class1.getTempArray().length; i++) {
            System.out.print(class1.getTempArray()[i] + " | ");
        }
    }

}
