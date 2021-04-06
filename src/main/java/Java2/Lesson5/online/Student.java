package Java2.Lesson5.online;

import java.io.Serializable;

public class Student implements Serializable {

        private String name;
        private String surName;
        private String age;

        public Student(String name, String surName, String age) {
            this.name = name;
            this.surName = surName;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " " + surName + " " + age;
        }
}
