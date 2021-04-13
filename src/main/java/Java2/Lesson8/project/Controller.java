package Java2.Lesson8.project;

import Java2.Lesson7.project.AccuWeatherModel;
import Java2.Lesson7.project.Functionality;
import Java2.Lesson7.project.Period;
import Java2.Lesson7.project.WeatherModel;

import java.io.IOException;

public class Controller {
    WeatherModel weatherModel = new AccuWeatherModel();

    // 1 - узнать текущую погоду    2 - узнать прогноз на 5 дней
    public void getWeather(String command, String selectedCity) throws IOException {
        switch (Functionality.fromValue(command)) {
            case GET_CURRENT_WEATHER:
                weatherModel.getWeather(Period.NOW, selectedCity);
                break;
            case GET_WEATHER_IN_NEXT_FIVE_DAYS:
                //your code here
//                throw new IOException("Метод не реализован!");
                weatherModel.getWeather(Period.FIVE_DAYS, selectedCity);
                break;
            //TODO: Добавить 3 опцию из Functionality(enum)
        }
    }
}
