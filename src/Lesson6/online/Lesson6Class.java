package lesson6.online;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 15.02.2021
 */

public class Lesson6Class extends Object {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        String s0 = "Hello_world";
//        String s1 = "Hello";
//        s1 += "_world";
//        String s2 = scanner.nextLine();
//        String s3 = "Hello_world";
//
//        System.out.println(s0 == s1);
//        System.out.println(s0 == s2);
//        System.out.println(s0 == s3);
//
//        System.out.println(s0.equals(s1));
//        System.out.println(s0.equals(s2));
//        System.out.println(s0.equals(s3));

//        String example1 = "Example"; // String example1 = new String("Example");
//
//        long startTime = System.nanoTime();
//
//        for (int i = 0; i < 50000; i++) {
//            example1 += i;
//        }
//
//        float deltaTime = System.nanoTime() - startTime;
//        System.out.println(example1);
//        System.out.println("DeltaTime string = " + deltaTime * 0.0000001f + " millisec.");
//
//        StringBuilder stringBuilder = new StringBuilder("Example");
//
//        StringBuffer stringBuffer = new StringBuffer("Example");
//
//        startTime = System.nanoTime();
//
//        for (int i = 0; i < 50000; i++) {
//            stringBuilder.append(i);
//        }
//
//        deltaTime = System.nanoTime() - startTime;
//
//        System.out.println(stringBuilder.toString());
//        System.out.println("DeltaTime stringBuilder = " + deltaTime * 0.0000001f + " millisec.");
//        System.out.println(example1.equals(stringBuilder.toString()));

        System.out.println("Start program");

        InputStream io; //read
        OutputStream out; //write

//        try {
//            System.out.println(myMath(10, 0));
//        } catch (ArithmeticException exception) {
//            System.out.println("Cause error = " + exception.getMessage());
//        }


//        try {
//            myExceptionMethod();
//        }catch (IOException exception) {
//            System.out.println(exception.getMessage());
//        }
        System.out.println("End program");

//        try {
//            FileOutputStream fos = new FileOutputStream("testWrite.txt");
////            byte[] str = "Hi! I'm byte array!".getBytes();
////            fos.write(str);
////            fos.flush();
////            fos.close();
//            PrintStream printStream = new PrintStream(fos);
//            String outSMS = "Hi! I'm string!";
//
//            printStream.println(outSMS);
//            printStream.flush();
//            printStream.close();
//
//            System.out.println("Hello java!");
////            fos.write(72);
////            fos.write(68);
////            fos.write(45);
////            fos.write(72);
////            fos.write(79);
//
//        } catch (FileNotFoundException e) {
//            System.out.println("Error to write file! File not found! Cause: " + e.getMessage());
//        } catch (IOException exception) {
//            System.out.println("Error to write file! Cause: " + exception.getMessage());
//        }

        try {
            FileInputStream fis = new FileInputStream("testWrite.txt");
            int outputChar;
            while ((outputChar = fis.read()) != -1) {
                System.out.print((char) outputChar);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }


//    private static void myExceptionMethod() throws IOException {
//        ///...
//        throw new IOException("This method = IOException");
//    }
//
//    private static int myMath(int value1, int value2) {
//        return value1 / value2;
//    }
}

/*
1.	Создать 2 текстовых файла, примерно по 50-100 символов в каждом (особого значения не имеет);
2.	Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.
3.	* Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле.
4.  ** Написать метод, проверяющий, есть ли указанное слово в папке
*/