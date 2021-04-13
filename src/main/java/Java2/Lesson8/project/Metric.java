package Java2.Lesson8.project;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Metric {
    @JsonProperty("Metric")
    private Value metric;

    public Value getMetric() {
        return metric;
    }

    public void setMetric(Value metric) {
        this.metric = metric;
    }

    public Metric() {
    }

    @Override
    public String toString() {
        return ": " + metric + " C";
    }
}