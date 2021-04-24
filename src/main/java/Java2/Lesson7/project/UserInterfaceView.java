package Java2.Lesson7.project;

import java.io.IOException;
import java.util.Scanner;

public class UserInterfaceView {
    Controller controller = new Controller();

    public void runInterface() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите название города. Для выхода введите \"выход\".");
            String city = scanner.nextLine();

            //выход из программы
            if (city.equals("выход")) break;

            System.out.println("Введите 1 для получения текущей погоды, " +
                    "введите 2 для получения прогноза погоды на 5 дней, для выхода введите \"выход\"");

            String command = scanner.nextLine();

            //выход из программы
            if (command.equals("выход")) break;

            try {
                controller.getWeather(command, city);
            } catch (IOException e) {
                e.printStackTrace();
                continue;
            }
        }
    }

    public void checkUserInput(String userInput) {
        //TODO: задание со звездочкой - обработать ввод пользователя (выбросить эксепш и прервать выполнение, либо
        // предложить пользователю попробовать снова)
    }
}
