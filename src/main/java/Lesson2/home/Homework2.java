package Lesson2.home;

import java.util.Arrays;

    public class Homework2 {

        public static void main(String[] args) {

            //Задание 1. Задать целочисленный массив, состоящий из элементов 0 и 1.  Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
            // Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;

            int[] myArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            System.out.println("1. Array original " + Arrays.toString(myArray));
            inverse(myArray);
            System.out.println("1. Array inversed " + Arrays.toString(myArray));

            // Задание 2.   Заадать пустой целочисленный массив размером 8. Написать метод, который c помощью цикла заполнит
            // его значениями 1 4 7 10 13 16 19 22;

            int[] emptyArray = new int[8];
            array(emptyArray);
            System.out.println("2. Filled array 8 " + Arrays.toString(emptyArray));


            // Задание 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод,принимающий на вход массив
            // и умножающий числа меньше 6 на 2;

            int[] mass = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
            System.out.println("3. Array original " + Arrays.toString(mass));
            multiplyArray(mass);
            System.out.println("3. Numbers less than 6 multiplied by 2 " + Arrays.toString(mass));

            // Задание 4. Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;

            int[] arrayNew = {1, 8, 6, 3, 5, 8, 2, 7};
            System.out.println("4. Minimum: " + findMin(arrayNew));
            System.out.println("4. Maximum: " + findMax(arrayNew));

            // Задание 5*. Создать квадратный целочисленный массив (количество строк и столбцов одинаковое), заполнить его
            // диагональные элементы единицами, используя цикл(ы);

            int side = 6;
            int[][] dArray = new int[side][side];
            diagonalFill(dArray);
            System.out.println("5. Filled array:\n");
            printArray(dArray);

            //Написать метод, которому на вход подаётся одномерный массив и число n (может быть положительным, или
            // отрицательным), при этом метод должен циклически сместить все элементы массива на n позиций.
            //[1,2,3,4,5], -2 => [3,4,5,1,2]
            //[1,2,3,4,5], 2 => [4,5,1,2,3]

            int[] arrayShift = {1,2,3,4,5};
            System.out.println("6. Original array: " + Arrays.toString(arrayShift));
            shift(arrayShift, 2);
            System.out.println("6. Shifted by 2: " + Arrays.toString(arrayShift));
            shift(arrayShift, -2);
            System.out.println("6. Shifted by -2: " + Arrays.toString(arrayShift));



        }

        public static void printArray (int[][] inputArray) {
            for(int i = 0; i < inputArray.length; i++) {
                for (int j = 0; j < inputArray[i].length; j++) {
                    System.out.print(inputArray[i][j] + " ");
                }
                System.out.println();
            }

        }

        public static void inverse(int[] myArray) {
            for (int i = 0; i < myArray.length; i++) {
//           Вариант 1
                if (myArray[i] == 1) {
                    myArray[i] = 0;
                } else {
                    myArray[i] = 1;
                }
//            Вариант 2
//            myArray[i] = myArray[i] == 1 ? 0 : 1;
            }
        }

        public static void array(int[] emptyArray) {
            for (int i = 0; i < emptyArray.length; i++) {
                emptyArray[i] = i * 3 + 1;
            }
        }


        public static void multiplyArray(int[] mass) {
            for (int i = 0; i < mass.length; i++) {
                if (mass[i] < 6) {
                    mass[i] *= 2;
                    // вопрос: почему mass[i] = i * 2 дает другой результат?

                }

            }
        }

        public static int findMin(int[] arrayNew) {
            int min = arrayNew[0];
            for(int i =0; i < arrayNew.length; i++) {
                if (arrayNew[i] < min)
                    min = arrayNew[i];
            }
            return min;
        }

        public static int findMax(int[] arrayNew) {
            int max = arrayNew[0];
            for(int i = 0; i < arrayNew.length; i++) {
                if (arrayNew[i] > max)
                    max = arrayNew[i];
            }
            return max;
        }

        public  static void diagonalFill(int[][] arr) {
            for(int i = 0; i < arr.length; i++) {
                arr[i][i] = 1;
                arr[i][arr.length - 1 - i] = 1;
            }
        }

        public static void shift (int[] array, int value) {
            boolean direction;
            if (value < 0) {
                direction = true;
                value = -value;
            } else {
                direction = false;
            }
            value %= array.length;
            int indexLast = array.length - 1;
            for (int i = 0; i < value; i++) {
                int start = (direction) ? array[0] : array[indexLast];
                for(int j = 0; j < indexLast; j++) {
                    if(direction)
                        array[j] = array[j + 1];
                    else
                        array[indexLast - j] = array[indexLast - j - 1];
                }
                if(direction)
                    array[indexLast] = start;
                else
                    array[0] = start;
            }

        }
    }










