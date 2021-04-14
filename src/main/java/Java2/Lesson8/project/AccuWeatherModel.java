package Java2.Lesson8.project;

import Java2.Lesson8.project.Period;
import Java2.Lesson8.project.WeatherModel;
import Java2.Lesson8.project.entity.Weather;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import com.fasterxml.jackson.core.type.TypeReference;


import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class AccuWeatherModel implements WeatherModel {

    private static final String PROTOKOL = "http";
    private static final String API_KEY = "qxyZGUu6M73DM9nYVzxntzXmMx2AxcBd";
    private static final String BASE_HOST = "dataservice.accuweather.com";
    private static final String CURRENT_CONDITIONS_ENDPOINT = "currentconditions";
    private static final String API_V1 = "v1";
    private static final String LOCATIONS_ENDPOINT = "locations";
    private static final String CITIES_ENDPOINT = "cities";
    private static final String AUTOCOMPLETE_ENDPOINT = "autocomplete";

    private static final String FORECASTS_ENDPOINT = "forecasts";
    private static final String DAILY_ENDPOINT = "daily";
    private static final String FIVE_DAY_ENDPOINT = "5day";

    private static final OkHttpClient okHttpClient = new OkHttpClient();
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public void getWeather(Period period, String selectedCity) throws IOException {
        String cityKey = detectCityKey(selectedCity);
        if (period == Period.NOW) {
            HttpUrl httpUrl = new HttpUrl.Builder()
                    .scheme(PROTOKOL)
                    .host(BASE_HOST)
                    .addPathSegment(CURRENT_CONDITIONS_ENDPOINT)
                    .addPathSegment(API_V1)
                    .addPathSegment(cityKey)
                    .addQueryParameter("apikey", API_KEY)
                    .build();

            Request request = new Request.Builder()
                    .addHeader("accept", "application/json")
                    .url(httpUrl)
                    .build();

            Response response = okHttpClient.newCall(request).execute();
            String responseString = response.body().string();

            //TODO: Тут нужно вывести полученные данные в читабельном виде
            List<WeatherResponse> weatherResponse = objectMapper.readValue(responseString, new TypeReference<List<WeatherResponse>>() {
            });
            System.out.println(weatherResponse);

            //TODO: вызвать метод сохранения погоды в базу из DataBaseRepository, предварительно из responseString
            //достав нужные данные для создания объекта Weather

            String city = "город не указан в JSON";
            String localDateTime = objectMapper.readTree(responseString).get(0).at("/LocalObservationDateTime").asText();
            String weatherText = objectMapper.readTree(responseString).get(0).at("/WeatherText").asText();
            String temperature = objectMapper.readTree(responseString).get(0).at("/Temperature/Metric/Value").asText();
            DataBaseRepository dataBaseRepository = new DataBaseRepository();
            try {
                dataBaseRepository.saveWeatherData(new Weather(city, localDateTime, weatherText, temperature));
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        if (period == Period.FIVE_DAYS) {
            //TODO: Домашнее задание со звездочкой
            HttpUrl httpUrl = new HttpUrl.Builder()
                    .scheme(PROTOKOL)
                    .host(BASE_HOST)
                    .addPathSegment(FORECASTS_ENDPOINT)
                    .addPathSegment(API_V1)
                    .addPathSegment(DAILY_ENDPOINT)
                    .addPathSegment(FIVE_DAY_ENDPOINT)
                    .addPathSegment(cityKey)
                    .addQueryParameter("apikey", API_KEY)
                    .build();

            Request requestFiveDays = new Request.Builder()
                    .addHeader("accept", "application/json")
                    .url(httpUrl)
                    .build();

            Response response = okHttpClient.newCall(requestFiveDays).execute();
            String fiveDaysResponseString = response.body().string();
            System.out.println(fiveDaysResponseString);

            String effectiveDate = objectMapper.readTree(fiveDaysResponseString).at("/Headline/EffectiveDate").asText();
            String forecast = objectMapper.readTree(fiveDaysResponseString).at("/Headline/Text").asText();
            System.out.println("Прогноз погоды на " + effectiveDate + " - " + forecast);
        }
    }

    @Override
    public void getSavedWeatherData() {
        //TODO: Обратиться к  DataBaseRepository и вызвать метод getSavedWeatherData
        DataBaseRepository dataBaseRepository = new DataBaseRepository();
        try {
            dataBaseRepository.getSavedWeatherData();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public String detectCityKey(String selectedCity) throws IOException {
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme(PROTOKOL)
                .host(BASE_HOST)
                .addPathSegment(LOCATIONS_ENDPOINT)
                .addPathSegment(API_V1)
                .addPathSegment(CITIES_ENDPOINT)
                .addPathSegment(AUTOCOMPLETE_ENDPOINT)
                .addQueryParameter("apikey", API_KEY)
                .addQueryParameter("q", selectedCity)
                .build();

        Request request = new Request.Builder()
                .addHeader("accept", "application/json")
                .url(httpUrl)
                .build();

        Response response = okHttpClient.newCall(request).execute();
        String responseString = response.body().string();

        String cityKey = objectMapper.readTree(responseString).get(0).at("/Key").asText();

        return cityKey;
    }
}


