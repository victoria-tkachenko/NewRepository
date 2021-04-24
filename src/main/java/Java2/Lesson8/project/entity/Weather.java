package Java2.Lesson8.project.entity;

public class Weather {
    //create table weather(id integer primary key autoincrement, city text, localdate text, weather_text text, temperature real)
    private String city;
    private String localdate;
    private String temperature;
    private String weatherText;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLocaldate() {
        return localdate;
    }

    public void setLocaldate(String localdate) {
        this.localdate = localdate;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getWeatherText() {
        return weatherText;
    }

    public void setWeatherText(String weatherText) {
        this.weatherText = weatherText;
    }

    public Weather(String city, String localdate, String weatherText, String temperature) {
        this.city = city;
        this.localdate = localdate;
        this.weatherText = weatherText;
        this.temperature = temperature;
    }
}
