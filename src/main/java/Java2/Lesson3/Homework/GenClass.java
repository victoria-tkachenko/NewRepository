package Java2.Lesson3.Homework;

import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;
import com.sun.tools.javac.jvm.Gen;

import java.util.Arrays;

public class GenClass<T> {

    private T[] objArray;

    public GenClass(T... objArray) {
        this.objArray = objArray;
    }

    public T[] getObjArray() {
        return objArray;
    }

    public void setObjArray(T[] objArray) {
        this.objArray = objArray;
    }

    public void swap(T array[], int i, int j) {
        T tempElement = array[i];
        array[i] = array[j];
        array[j] = tempElement;
    }

}


