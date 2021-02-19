package lesson6.online;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 15.02.2021
 */

public class Class1 {

    private int[] tempArray;

    Class1(int valueForArray){
        tempArray = new int[valueForArray];
    }

    public int[] getTempArray() {
        return tempArray;
    }
}
