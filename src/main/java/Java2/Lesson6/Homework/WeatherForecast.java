package Java2.Lesson6.Homework;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherForecast {
    @JsonProperty("now_dt")
    private String currentDate;

    public WeatherForecast() {
    }

    @Override
    public String toString() {
        return "Погода на дату: " + currentDate;
    }

    public String getDate() {
        return currentDate;
    }

    public void setDate(String date) {
        this.currentDate = currentDate;
    }
}

