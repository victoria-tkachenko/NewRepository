package Java2.Lesson8.project;

import Java2.Lesson8.project.Period;

import java.io.IOException;

public interface WeatherModel {
    void getWeather(Period period, String selectedCity) throws IOException;

    void getSavedWeatherData();
}
