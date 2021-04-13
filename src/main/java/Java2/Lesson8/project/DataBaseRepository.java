package Java2.Lesson8.project;

import Java2.Lesson8.project.entity.Weather;

import java.sql.*;

public class DataBaseRepository {

    private static final String DB_NAME = "geekbrains.db";
    String insertWeather = "insert into weather (city, localdate, weather_text, temperature) values (?, ?, ?, ?)";


    static {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //create table weather(id integer primary key autoincrement, city text, localdate text, weather_text text, temperature real)
    public boolean saveWeatherData(Weather weather) throws SQLException {
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:geekbrains.db")) {
            PreparedStatement saveWeather = connection.prepareStatement(insertWeather);
            saveWeather.setString(1, weather.getCity());
            saveWeather.setString(2, weather.getLocaldate());
            saveWeather.setString(3, weather.getWeatherText());
            saveWeather.setDouble(4, weather.getTemperature());
            return saveWeather.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        throw new SQLException("Сохранение погоды в базу данных не выполнено!");
    }

    //TODO: Реализовать метод для считывания данных о погоде
    //public List<Weather> getSavedWeatherData() {
    //    //statement.executeQuery(select.....)
    //}

    public static void main(String[] args) throws SQLException {
        DataBaseRepository dataBaseRepository = new DataBaseRepository();
        dataBaseRepository.saveWeatherData(new Weather("Moscow", "12.04.2021","Хорошая", 13.5));
    }
}
