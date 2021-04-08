package Java2.Lesson6.Homework;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.File;
import java.io.IOException;

public class YandexWeather {
    private static final String API_KEY = "77fe0b5d-a40d-4b1e-8dc8-b8cb22da49df";
    private static final String PROTOCOL = "https";
    private static final String BASE_HOST = "api.weather.yandex.ru";
    private static final String API_V2 = "v2";
    private static final String FORECAST_ENDPOINT = "forecast";
    private static final String LAT = "59.9386";
    private static final String LON = "30.3141";
    private static final String LAN = "ru_RU";
    private static final String LIMIT = "5";
    private static final String HOURS = "false";
    private static final String EXTRA = "false";


    public static void main(String[] args) throws IOException {

        OkHttpClient okHttpClient = new OkHttpClient();
        ObjectMapper objectMapper = new ObjectMapper();

        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme(PROTOCOL)
                .host(BASE_HOST)
                .addPathSegment(API_V2)
                .addPathSegment(FORECAST_ENDPOINT)
                .addQueryParameter("lat", LAT)
                .addQueryParameter("lon", LON)
                .addQueryParameter("lon", LON)
                .addQueryParameter("lang", LAN)
                .addQueryParameter("limit", LIMIT)
                .addQueryParameter("hours", HOURS)
                .addQueryParameter("extra", EXTRA)
                .build();

//        System.out.println(httpUrl);

        Request request = new Request.Builder()
                .url(httpUrl)
                .addHeader("X-Yandex-API-Key", API_KEY)
                .build();

        Response response = okHttpClient.newCall(request).execute();
        String body = response.body().string();
//        System.out.println(response.code());
//        System.out.println(response.headers());

        // вывод JSON с прогнозом погоды
        System.out.println(body);

        // записать JSON в файл
//        objectMapper.writeValue(new File("Weather.txt"), body);

        //создаю объект для чтения
        WeatherForecast weatherForecast = objectMapper.readValue(body, WeatherForecast.class);

        //JSON большой, непонятно как добраться до подполей, поэтому вывела только текущую дату
        System.out.println(weatherForecast);
    }
}
