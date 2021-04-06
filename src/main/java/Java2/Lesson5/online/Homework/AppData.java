package Java2.Lesson5.online.Homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

        public String[] getHeader () {
            return header;
        }

        public int[][] getData () {
            return data;
        }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public String toString() {
        return Arrays.deepToString(header) + Arrays.deepToString(data);
    }
}


