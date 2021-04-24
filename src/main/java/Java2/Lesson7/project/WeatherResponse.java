package Java2.Lesson7.project;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {
    @JsonProperty("LocalObservationDateTime")
    private String localObservationDateTime;

    public WeatherResponse() {
    }

    @JsonProperty("Temperature")
    private Metric temperature;

    public String getLocalObservationDateTime() {
        return localObservationDateTime;
    }

    public void setLocalObservationDateTime(String localObservationDateTime) {
        this.localObservationDateTime = localObservationDateTime;
    }

    public Metric getTemperature() {
        return temperature;
    }

    public void setTemperature(Metric temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Температура воздуха на дату и время " + localObservationDateTime + '\'' + temperature;
    }
}
