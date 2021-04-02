package Java2.Lesson4.Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class PhoneBook {

    private HashMap<String, List<String>> phonebook;

    public PhoneBook() {
        this.phonebook = new HashMap<>();
    }

    public void add(String surname, String number) {
        if (phonebook.containsKey(surname)) {
            List<String> numbers = phonebook.get(surname);
            if (!numbers.contains(number)) {
                numbers.add(number);
                System.out.println(String.format("Для фамилии %s добавлен телефон %s", surname, number));
            } else {
                System.out.println(String.format("Номер %s уже существует для фамилии %s", number, surname));
            }
        } else {
            phonebook.put(surname, new ArrayList<>(Arrays.asList(number)));
            System.out.println(String.format("Для фамилии %s добавлен телефон %s", surname, number));
        }
    }

    public List<String> get(String surname) {
        if (phonebook.containsKey(surname)) {
            return phonebook.get(surname);
        } else {
            System.out.println(String.format("В справочнике нет записи для фамилии %s", surname));
            return new ArrayList<>();
        }
    }

}
