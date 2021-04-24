package Java2.Lesson8.project;

import Java2.Lesson8.project.Controller;

import java.io.IOException;
import java.util.Scanner;

public class UserInterfaceView {
Controller controller = new Controller();

    public void runInterface() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите название города. Для выхода введите \"выход\".");
            String city = scanner.nextLine();

            System.out.println("Введите 1 для получения текущей погоды, " +
                    "введите 2 для получения прогноза погоды на 5 дней, "  + "введите 3 для вывода погоды из базы, для выхода введите \"выход\"");

            //TODO: поддержать 3 пункт меню (вывод из базы) в интерфейсе

            String command = scanner.nextLine();

            //выход из программы
            if (city.equals("выход")) break;

            try {
                controller.getWeather(command, city);

            } catch (IOException e) {
                e.printStackTrace();
                continue;
            }
        }
    }

    public void checkUserInput(String userInput) {
        //TODO: задание со звездочкой - обработать ввод пользователя (выбросить эксепш и прервать выполнение, либо предложить
        // пользователю попробовать снова)
    }
}
