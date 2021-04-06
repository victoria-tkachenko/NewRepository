package Java2.Lesson6.online;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class OkHttpExample {
    public static void main(String[] args) throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient()
                .newBuilder()
                .readTimeout(10, TimeUnit.SECONDS)
                .build();

        //можно собрать  url отдельно
        HttpUrl url = new HttpUrl.Builder()
                .scheme("https")
                .host("geekbarins")
                .addPathSegment("/courses")
                .build();

        Request request = new Request.Builder()
                .url("https://geekbrains.ru")
                .build();

        Response response = okHttpClient.newCall(request).execute();

        System.out.println(response.code());
        System.out.println(response.headers());
        String responseBody = response.body().string();
    }
}
