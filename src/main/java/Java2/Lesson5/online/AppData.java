package Java2.Lesson5.online;

import java.io.Serializable;
import java.util.Arrays;

public class AppData implements Serializable {
    private String[] header;
    private int[][] data;

    public AppData(String fileName) {
        this.appDataReader(fileName);
    }

    private void appDataReader (String fileName) {

    }


}

