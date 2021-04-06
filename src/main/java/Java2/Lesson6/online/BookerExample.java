package Java2.Lesson6.online;

import okhttp3.*;

import java.io.IOException;

public class BookerExample {
    public static void main(String[] args) throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient();

        MediaType JSON = MediaType.parse("JSON");

        String authBodyString = "{" +
                "\"username\" : \"admin\",\n" +
                "\"password\" : \"password123\"" +
                "}";
//        System.out.println(authBodyString);

        RequestBody requestBody = RequestBody.create(authBodyString, JSON);

        Request requestAuth = new Request.Builder()
                .url("https://restful-booker.herokuapp.com/auth")
                .addHeader("Content-Type", "application/json")
                .post(requestBody)
                .build();

        Response response = okHttpClient.newCall(requestAuth).execute();
        String body = response.body().string();
        System.out.println(response.code());
        System.out.println(response.headers());
        System.out.println(body);

        String token = body.split(":")[1];
        token = token.replaceAll("[\"}]", "");
        System.out.println(token);

        String requestBodyCreateBooking = "{" +
                "\"firstname\" : \"Jim\",\n" +
                "\"lastname\" : \"Brown\",\n" +
                "\"totalprice\" : 111,\n" +
                "\"depositpaid\" : true,\n" +
                "\"bookingdates\" : {\n" +
                "\"checkin\" : \"2018-01-01\",\n" +
                "\"checkout\" : \"2019-01-01\"\n" +
                "},\n" +
                "\"additionalneeds\" : \"Breakfast\"" +"}";

//        System.out.println(requestBodyCreateBooking);

        RequestBody requestBodyBooking = RequestBody.create(requestBodyCreateBooking, JSON);

        Request requestBooking = new Request.Builder()
                .url("https://restful-booker.herokuapp.com/booking")
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json")
                .addHeader("Cookie", String.format("token=%s", token))
                .post(requestBodyBooking)
                .build();

        Response responseCreateBooking = okHttpClient.newCall(requestBooking).execute();
        String bodyCreateBooking = responseCreateBooking.body().string();
        System.out.println(responseCreateBooking.code());
        System.out.println(responseCreateBooking.headers());
        System.out.println(bodyCreateBooking);


    }
}
