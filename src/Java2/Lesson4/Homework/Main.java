package Java2.Lesson4.Homework;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

//        1 Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список
//        уникальных слов, из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается каждое
//        слово.

        String[] strings = {"cow", "cat", "dog", "goose", "cat", "dog", "goat", "horse", "horse", "hen", "dog"};

        HashMap<String, Integer> uniqueStrings = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            if (uniqueStrings.containsKey(strings[i])) {
                uniqueStrings.put(strings[i], uniqueStrings.get(strings[i]) + 1);
            } else {
                uniqueStrings.put(strings[i], 1);
            }
        }
        System.out.println(uniqueStrings);


//        2 Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
//        В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать
//        номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае
//        однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны. Желательно не добавлять лишний
//        функционал (дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем через консоль и т.д).
//        Консоль использовать только для вывода результатов проверки телефонного справочника.

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Сидоров", "12345");
        phoneBook.add("Иванов", "12346");
        phoneBook.add("Петров", "12347");
        phoneBook.add("Петров", "12348");

        System.out.println(phoneBook.get("Сидоров"));
        System.out.println(phoneBook.get("Иванов"));
        System.out.println(phoneBook.get("Петров"));

        phoneBook.add("Крылов", "34567");
        System.out.println(phoneBook.get("Крылов"));


    }
}
