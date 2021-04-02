package Lesson4.home;

public class Employee {

    //1 Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;

    private String name;
    private String position;
    private String phone;
    private int salary;
    private int age;
    private int eid;

    // 7** При создании экземпляра класса Сотрудник присваивать ему уникальный порядковый номер.

    private static int id = 0;

    // 2 Конструктор класса должен заполнять эти поля при создании объекта;

    public Employee(String name, String position, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
        this.eid = ++id;

    }

    // 3 Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;


    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public  int getSalary() {
        return salary;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public String getInfo() {
        return this.eid + " " + this.name + ", должность: " +
                this.position + ", зарплата: " +
                this.salary + ", телефон: " +
                this.phone + ", возраст: " +
                this.age;
    }

    public  void setSalary(int difference) {
        this.salary = this.salary + difference;}

    }


    

 /**1 Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
         * 2 Конструктор класса должен заполнять эти поля при создании объекта;
         * 3 Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
         * 4 Вывести при помощи методов из пункта 3 ФИО и должность.
         * 5 Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
         * 6* Создать метод, повышающий зарплату всем сотрудникам старше 35 лет на 10000;
         * 7** При создании экземпляра класса Сотрудник присваивать ему уникальный порядковый номер.
         */
