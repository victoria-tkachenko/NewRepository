package Java2.Lesson7.project;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.File;
import java.io.IOException;

    public class AccuWeatherModel implements WeatherModel {
        private static final String PROTOKOL = "http";
        private static final String API_KEY = "vCxNl4tOT7A8xeqR2yC0U2cSAMkoN5DM";
        private static final String BASE_HOST = "dataservice.accuweather.com";
        private static final String CURRENT_CONDITIONS_ENDPOINT = "currentconditions";
        private static final String API_V1 = "v1";
        private static final String LOCATIONS_ENDPOINT = "locations";
        private static final String CITIES_ENDPOINT = "cities";
        private static final String AUTOCOMPLETE_ENDPOINT = "autocomplete";

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
                System.out.println(responseString);
            }

            if (period == Period.FIVE_DAYS) {
                //TODO: Домашнее задание со звездочкой
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
            //TODO: Тут нужно вывести полученные данные в читабельном виде
        }
    }

