package Java2.Lesson9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

//    Написать функцию, принимающую список Student и возвращающую список уникальных курсов, на которые подписаны студенты.
//
//Написать функцию, принимающую на вход список Student и возвращающую список из трех самых любознательных (любознательность определяется количеством курсов).
//
//Написать функцию, принимающую на вход список Student и экземпляр Course, возвращающую список студентов, которые посещают этот курс.
    public static void functionUniqueCourses (List<Student> students) {
        System.out.println(students.stream()
            .map(s -> s.getCourses())
            .flatMap(c -> c.stream())
            .distinct()
            .collect(Collectors.toList()));
}

    public static  void functionThreeMostCurious (List<Student> students) {
        System.out.println(students.stream()
                .sorted((s1, s2) -> s2.getCourses().size() - s1.getCourses().size())
                .limit(3)
                .map(s -> s.getName())
                .collect(Collectors.toList()));
    }

    public static void functionGetStudentsForCourse (List<Student> students, Course course) {
        System.out.println(students.stream()
                .filter(s -> s.getCourses().contains(course))
                .collect(Collectors.toList()));
    }


    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Nikita", Arrays.asList(new Course("Bio"), new Course("Math"))),
                new Student("Anna", Arrays.asList(new Course("Testing"), new Course("English"), new Course("Science"))),
                new Student("Oleg", Arrays.asList(new Course("Physics"), new Course("Math"), new Course("Testing"))),
                new Student("Petr", Arrays.asList(new Course("Bio"), new Course("Culture"), new Course("Physics"), new Course("English")))
        ));

        Course course = new Course("Testing");




        System.out.println("Задание 1");
        functionUniqueCourses(students);

        System.out.println("Задание 2");
        functionThreeMostCurious(students);

        System.out.println("Задание 3");
        functionGetStudentsForCourse(students, course);

    }


}
