package Java2.Lesson7.project;

import java.io.IOException;

public interface WeatherModel {
    void getWeather(Period period, String selectedCity) throws IOException;
}
