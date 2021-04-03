package Java2.Lesson5.online;

import java.io.*;
import java.util.Arrays;

public class Test {
    private static class Cat implements Serializable {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Кот " + name;
        }
    }

    public static void main(String[] args) {
//        byte[] byteCat = null;
//
//        try (ByteArrayOutputStream barrOut = new ByteArrayOutputStream();
//            ObjectOutputStream objOut = new ObjectOutputStream(barrOut)) {
//            Cat catOut = new Cat("Барсик");
//            objOut.writeObject(catOut);
//            byteCat = barrOut.toByteArray();
//            System.out.println("Кот до сериализации: " + catOut);
////            System.out.println("Кот в байтовом представлении: "  + Arrays.toString(byteCat));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try (ByteArrayInputStream barrIn = new ByteArrayInputStream(byteCat);
//             ObjectInputStream objIn = new ObjectInputStream(barrIn)) {
//            Cat catIn = (Cat) objIn.readObject();
//            System.out.println(catIn);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("demo.txt"))) {
//            for (int i = 0; i < 20; i++) {
            writer.write("Java\n");
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("demo.txt"))) {
            String str;
            while ((str = reader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

