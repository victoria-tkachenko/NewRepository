package Lesson6.home;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.io.*;
import java.util.Random;

public class Homework6 {

    private static String someText = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static Random rnd = new Random();


    private static FileInputStream fis;
    private static FileOutputStream fos;


    public static void main(String[] args) {
        // 1. Создать 2 текстовых файла, примерно по 50-100 символов в каждом (особого значения не имеет);
        createFile("text1", createString(50));
        createFile("text2", createString(50));

        // 2. Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.
        mergeFiles("text1", "text2", "text3");

        // 3. Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле.
        createSearchFile();
        try {
            System.out.println("Есть ли искомое слово в файле text4? " + searchWord("text4", "Word"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String createString(int myString) {
        StringBuilder stringBuilder = new StringBuilder(myString);
        for (int i = 0; i < myString; i++) {
            stringBuilder.append(someText.charAt(rnd.nextInt(someText.length())));
        }
        return stringBuilder.toString();
    }


    public static void createFile(String fileName, String text) {
        try {
            PrintStream printStream = new PrintStream(fileName);
            printStream.println(text);
            printStream.flush();
            printStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void mergeFiles(String file1, String file2, String file3) {
        try {
            fos = new FileOutputStream(file3);
            int outputChar;

            fis = new FileInputStream(file1);
            while ((outputChar = fis.read()) != -1)
                fos.write(outputChar);
            fis.close();

            fis = new FileInputStream(file2);
            while ((outputChar = fis.read()) != -1) {
                fos.write(outputChar);
            }
            fis.close();
            fos.flush();
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void createSearchFile() {
        try {
            fos = new FileOutputStream("text4");
            PrintStream printStream = new PrintStream(fos);
            String search = "Hello! I'm a search file. You are looking for a Word.";

            printStream.println(search);
            printStream.flush();
            printStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static boolean searchWord(String fileName, String word) throws IOException {
        fis = new FileInputStream(fileName);
        byte[] wordBytes = word.getBytes();
        int outputChar;
        int i = 0;
        while ((outputChar = fis.read()) != -1) {
            if (outputChar == wordBytes[i]) {
                i++;
            } else {
                i = 0;
                if (outputChar == wordBytes[i]) {
                    i++;
                }
            }
            if (i == wordBytes.length) {
                fis.close();
                return true;
            }
        }
        fis.close();
        return false;
    }
}


