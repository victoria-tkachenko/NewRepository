package Lesson4.home;

import javax.sound.midi.Soundbank;
import java.awt.event.WindowFocusListener;

public class MainWorkEmployee {

    public static void main(String[] args) {

        // 4 Вывести при помощи методов из пункта 3 ФИО и должность.

        System.out.println("Задание 1-4.");

        Employee employee1 = new Employee("Иванов Иван Иванович", "специалист", "89299999999",
                100000, 30);

        System.out.println(employee1.getName() + ", " + employee1.getPosition());
        System.out.println(" ");


        //  5 Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;

        System.out.println("Задание 5.");

        Employee[] empArray = new Employee[5];
        empArray[0] = employee1;
        empArray[1] = new Employee("Петров Петр Петрович", "руководитель", "89299999966", 300000, 45);
        empArray[2] = new Employee("Сидоров Иван Перович", "водитель", "89299999911", 50000, 20);
        empArray[3] = new Employee("Васильев Василий Васильевич", "инженер", "89299999900", 100000, 41);
        empArray[4] = new Employee("Комаров Иван Васильевич", "разработчик", "89299999933", 200000, 33);

        for (int i = 0; i < empArray.length; i++)
            if (empArray[i].getAge() > 40) {
                System.out.println((empArray[i].getInfo()));
            } else {
                System.out.println("Сотруднику меньше 40 лет");
            }
        System.out.println(" ");

        System.out.println("Задание 6.");
        System.out.println("Зарплата до повышения");

            // Вывод информации о всех сотрудниках

        for (int i = 0; i < empArray.length; i++)
            System.out.println(empArray[i].getInfo());


        // Повышение зарплаты

        increaseSalary(empArray, 35, 10000);

        System.out.println(" ");

        System.out.println("Зарплата после повышения");

        // Вывод новой информации о сотрудниках

        for (int i = 0; i < empArray.length; i++)
        System.out.println(empArray[i].getInfo());
    }
    // 6* Создать метод, повышающий зарплату всем сотрудникам старше 35 лет на 10000;

    public  static void increaseSalary(Employee[] empArray, int age, int increase) {
        for (int i = 0; i < empArray.length; i++) {
            if(empArray[i].getAge() > age) {
                empArray[i].setSalary(increase);
            }
        }
    }
}


