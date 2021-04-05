package Java2.Lesson5.online.Homework;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void dataWriter(AppData appData, File file) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            //записываем заголовок
            String[] header = appData.getHeader();
            for (String value : header) {
                writer.write(value + ";");
            }
            writer.write("\n");

            //записываем  данные
            int[][] data = appData.getData();
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    writer.write(data[i][j] + ";");
                }
                writer.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void dataReader(File file) {

        ArrayList<int[]> dataList = new ArrayList<int[]>();
        AppData appData = new AppData(new String[1], new int[10][3]);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            //читаем заголовок
            String[] header = reader.readLine().split(";");
            appData.setHeader(header);

            //читаем данные
            // не разобралась как правильно написать , чтобы считать данные
            String temStr;
            while ((temStr = reader.readLine()) != null) ;
            String[] values = temStr.split(";");

            int[] intLine = new int[values.length];
            for (int i = 0; i < values.length; i++) {
                intLine[i] = Integer.parseInt(values[i]);
                dataList.add(intLine);
            }
            int[][] data = new int[dataList.size()][];
            for (int i = 0; i < dataList.size(); i++) {
                data[i] = dataList.get(i);
            }

            appData.setData(data);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
    public static void main(String[] args) {

        File file = new File("file.csv");

        String[] header = {"Value1", "Value2", "Value3"};

        int[][] data = {
                {100, 200, 300},
                {400, 500, 600}
        };

        AppData appData = new AppData(header, data);
        dataWriter(appData, file);
        dataReader(file);

    }
}

