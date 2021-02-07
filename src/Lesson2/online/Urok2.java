package Lesson2.online;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 01.02.2021
 */

//public class Urok2 {

//   public static int abc = 10;

//    public static void main(String[] args) {
//
////        System.out.println(abc);
//
//        int a = 20;
//        int b = 10;
//        int c;
//
////        if (a > b) {
////            c = a;
////        } else {
////            c = b;
////        }
//
//        c = (a > b) ? doSom() : b;
//        System.out.println("Result c = " + c);
//
//    }
//
//    public static int doSom() {
//        return 10;
//    }
//
//
//    String name = "Olga";
//
//        if(name =="Boris")
//
//    {
//        System.out.println("Send letter Boris!");
//    } else if(name =="Alex")
//
//    {
//        System.out.println("Send letter Alex!");
//    } else if(name =="Victoria")
//
//    {
//        System.out.println("Send letter Victoria!");
//    } else
//
//    {
//        System.out.println("go out office");
//    }
//
////        System.out.println("------");
//
//        switch(name)
//
//    {
//        case "Boris":
//            System.out.println("Send letter Boris!");
//            break;
//        case "Alex":
//            System.out.println("Send letter Alex!");
//            break;
//        case "Victoria":
//            System.out.println("Send letter Victoria!");
//            break;
//        default:
//            System.out.println("go out office");
//            break;
//    }
//}
//        for (int i = 1; i <= 10; i++) {
//            System.out.print(i + ", ");
//        }
//        System.out.println();
//        System.out.println("Hello");
//
//        System.out.println("Результат: " + myMath(2, 10));
//        tablePifagor(10, 10);
//        int abc1 = 10;
//
//        while(abc1 < 10) {
//            abc1++;
////            if (abc1 == 5 || abc1 == 7) continue;
//            System.out.print(abc1 + "\t");
//        }
//
//        System.out.println();
//        System.out.println("-----");
//
//        int myInt = 10;
//
//        do {
//            myInt++;
//            System.out.print(myInt + "\t");
////            if (myInt == 4) break;
//        } while (myInt < 10);
//
//        System.out.println();
//        System.out.println("Hello");
//
//        float[] myArrayInt = new float[4];
//        myArrayInt[0] = 15;
//        myArrayInt[1] = 150;
//        myArrayInt[2] = -98;
//
//        String[] myArrayString = new String[4];
//        myArrayString[2] = "Hello";
//
//        System.out.println(myArrayInt[3]);
//        System.out.println(myArrayString[0]);
//
//        String[] company = new String[50];
//
//        for (int i = 0; i < company.length; i++) {
//            company[i] = "Slave" + i;
//        }
//
//        for (int i = 0; i < company.length; i++) {
//           System.out.println(company[i]);
//        }
//
//        int[][] myArrayIntDouble = new int[5][12];
//        myArrayIntDouble[0][2] = 5;
//
//        int value = 0;
//
//        for (int y = 0; y < 5; y++) {
//            for (int x = 0; x < 12; x++) {
//                myArrayIntDouble[y][x] = value;
//                value++;
//            }
//
//        }
//
//        for (int y = 0; y < 5; y++) {
//            for (int x = 0; x < 12; x++) {
//                System.out.print(myArrayIntDouble[y][x] + "\t");
//            }
//            System.out.println();
//        }
//
//
//
//
//    }
//

//    public static int myMath(int base, int signature) {
//        int result = 1;
//        for (int i = 0; i < signature; i++) {
//            result *= base; // result = result * base;
//        }
//        return result;
//    }
//
//    public static void tablePifagor(int wight, int height) {
//
//        for (int y = 1; y < height; y++) {
//            for (int x = 1; x < wight; x++) {
//                System.out.print(x * y + "\t");
//            }
//            System.out.println();
//        }
//    }


//    public static int doSom() {
//        int abc = 10;
//        System.out.println(abc);
//        return 10;
//    }
//
//}

/*
    1 Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в
    принятом массиве 0 на 1, 1 на 0;

	2 Задать пустой целочисленный массив размером 8. Написать метод,
	который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;

	3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод,
	принимающий на вход массив и умножающий числа меньше 6 на 2;

	4 Задать одномерный массив. Написать методы поиска в нём
	минимального и максимального элемента;

	5* Создать квадратный целочисленный массив
	(количество строк и столбцов одинаковое), заполнить его диагональные
	элементы единицами, используя цикл(ы);

	6** Написать метод, которому на вход подаётся одномерный массив и
	число n (может быть положительным, или отрицательным), при этом метод
	должен циклически сместить все элементы массива на n позиций.
	[1,2,3,4,5], -2 => [3,4,5,1,2]
	[1,2,3,4,5], 2 => [4,5,1,2,3]

	7 *** Не пользоваться вспомогательным массивом при решении задачи 6.

    **/