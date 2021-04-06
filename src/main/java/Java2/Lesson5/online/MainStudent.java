package Java2.Lesson5.online;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MainStudent {
    public static void main(String[] args) {
//        ArrayList<Student> studentArrayList = new ArrayList<>();
//        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
//            String tempStr;
//            while ((tempStr = reader.readLine()) != null) ;
//            String[] values = tempStr.split(";");
//            studentArrayList.add(new Student(values[0], values[1], values[2]));
//        } catch (FileNotFoundException fileNotFoundException) {
//            fileNotFoundException.printStackTrace();
//        } catch (IOException exception) {
//            exception.printStackTrace();
//        }

        ArrayList<Student> studentArrayList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("file1.txt"))) {
            String tempString;
            while ((tempString = bufferedReader.readLine()) != null) {
                String[] values = tempString.split(" ");
                studentArrayList.add(new Student(values[0], values[1], values[2]));
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(studentArrayList);
    }
}

