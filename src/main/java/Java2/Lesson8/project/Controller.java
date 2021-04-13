package Java2.Lesson8.project;

import java.io.IOException;

public class Controller {
    WeatherModel weatherModel = new AccuWeatherModel();

    public void getWeather(String command, String selectedCity) throws IOException {
        switch (Functionality.fromValue(command)) {
            case GET_CURRENT_WEATHER:
                weatherModel.getWeather(Period.NOW, selectedCity);
                break;
            case GET_WEATHER_IN_NEXT_FIVE_DAYS:
                //your code here
                throw new IOException("Метод не реализован!");
                //TODO: Добавить 3 опцию из Functionality(enum)
        }
    }
}
