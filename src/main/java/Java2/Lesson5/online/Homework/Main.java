package Java2.Lesson5.online.Homework;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

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

        AppData appData = new AppData(new String[1], new int[10][3]);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            //читаем заголовок
            String[] header = reader.readLine().split(";");
            appData.setHeader(header);

            //читаем данные
            String temStr;
            int[][] data = new int[3][header.length];
            int j = 0;
            while ((temStr = reader.readLine()) != null) {
                String[] values = temStr.split(";");
                for (int i = 0; i < values.length; i++) {
                    data[j][i] = Integer.parseInt(values[i]);
                }
                j++;
            }
            appData.setData(data);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(appData.toString());

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

