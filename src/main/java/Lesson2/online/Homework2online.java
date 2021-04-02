package lesson2.home;

import java.util.Arrays;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date of creation: 03.02.2021
 */

public class Homework2online {
    public static void main(String[] args) {
        /*
         * 1.   Создать массив, состоящий из элементов 0 и 1,
         * например, [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла
         * и условия заменить 0 на 1, 1 на 0;
         */
//        int[] array1 = {1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0};
//        System.out.println("1. Before:\t" + Arrays.toString(array1));
//
//        change(array1);
//        System.out.println("1. After:\t" + Arrays.toString(array1));

        /*
         * 2.   Создать пустой целочисленный массив размером 8.
         * С помощью цикла заполнить его значениями
         * 1, 4, 7, 10, 13, 16, 19, 22;
         */
//        int[] arrInt = new int[8];
//        fillIn(arrInt);
//        System.out.println("2. Filled with cycle:\t" + Arrays.toString(arrInt));

        /*
         * 3.   Задать массив int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
         * пройти по нему циклом, и числа, которые меньше 6, умножить на 2.
         */
//        int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        System.out.println("3. Before:\t" + Arrays.toString(mas));
//        doubling(mas);
//        System.out.println("3. After:\t" + Arrays.toString(mas));

        /*
         * 4.   Создать квадратный двумерный целочисленный
         * массив (количество строк и столбцов одинаковое),
         * и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
         */
        int side = 3;
        int[][] dArr = new int[side][side];
        crossFill2(dArr);
        printArraySize2(dArr);
    }

        /*
         * 5.	* Задать одномерный массив и найти в нем
         * минимальный и максимальный элементы;
         */
//        System.out.println("5. Maximum: " + findMax(mas));
//        System.out.println("5. Minimum: " + findMin(mas));

        /*
         * 6.    *** Написать метод, которму на вход подаётся одномерный
         * массив и число n (может быть положительным, или отрицательным),
         * при этом метод должен сместить все элементы массива на n позиций.
         *
         * **** Для усложнения задачи нельзя пользоваться вспомогательными массивами
         */
//        int[] shiftArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        System.out.println("6. " + Arrays.toString(shiftArray));
//        shifter(shiftArray, -3);
//        System.out.println("-3 " + Arrays.toString(shiftArray));
//        shifter(shiftArray, 6);
//        System.out.println("+6 " + Arrays.toString(shiftArray));
//    }

        private static void printArraySize2 ( int[][] inputArray){
            for (int i = 0; i < inputArray.length; i++) {
                for (int j = 0; j < inputArray[i].length; j++) {
                    System.out.print(inputArray[i][j] + " ");
                }
                System.out.println();
            }
        }
//
//    private static void change(int[] array) {
//        for (int i = 0; i < array.length; i++)
//            if (array[i] == 1) {
//                array[i] = 0;
//            } else {
//                array[i] = 1;
//            }
//            array[i] = (array[i] == 1) ? 0 : 1;
//        array[i] = 1 - array[i];
//
//    }
//
//    private static void fillIn(int[] array) {
//        for (int i = 0; i < array.length; i++)
//            array[i] = i * 3 + 1;
//    }
//
//    private static void doubling(int[] array) {
//        for (int i = 0; i < array.length; i++)
//            if (array[i] < 6) {
//                array[i] *= 2;
//            }
//    }
//
//    private static int findMax(int[] array) {
//        Arrays.sort(array);
//        return array[array.length - 1];
//    }
//
//    private static int findMin(int[] array) {
//        int min = array[0];
////        for (int index : array)
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < min)
//                min = array[i];
//        }
//
//        return min;
//    }

        private static void crossFill ( int[][] array){
            int strght, bckwd;
            for (strght = 0, bckwd = array.length - 1; strght < array.length; strght++, bckwd--) {
                array[strght][bckwd] = 1;
                array[strght][strght] = 1;
            }
        }

        private static void crossFill2 ( int[][] arr){
            for (int i = 0; i < arr.length; i++) {
                arr[i][i] = 1;
                arr[i][arr.length - 1 - i] = 1;
            }
        }

//    private static void shifter(int[] array, int value) {
//        boolean direction;
//        if (value < 0) {
//            direction = true;
//            value = -value;
//        } else {
//            direction = false;
//        }
//        value %= array.length;
//        int lastIndex = array.length - 1;
//        for (int i = 0; i < value; i++) {
//            int temp = (direction) ? array[0] : array[lastIndex];
//            for (int j = 0; j < lastIndex; j++) {
//                if (direction)
//                    array[j] = array[j + 1];
//                else
//                    array[lastIndex - j] = array[lastIndex - j - 1];
//            }
//            if (direction)
//                array[lastIndex] = temp;
//            else
//                array[0] = temp;
//        }
//    }
    }

