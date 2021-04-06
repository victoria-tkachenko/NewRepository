package Java2.Lesson6.online;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class URLExamples {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https", "geekbrains.ru",  "/");
        URL url1 = new URL("https", "geekbrains.ru", "/");
        InputStream in = url.openStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in, "UTF-8"));
        String line;
        while((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();

        URLConnection urlConnection = url.openConnection();
        InputStream inputStream = urlConnection.getInputStream();
        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        PrintWriter printWriter = new PrintWriter("geek.html");
        String currentString;
        while((currentString = bufferedReader1.readLine()) != null) {
            printWriter.println(currentString);
        }
        printWriter.close();
        bufferedReader1.close();

        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        System.out.println(httpURLConnection.getResponseCode());
        System.out.println(httpURLConnection.getRequestMethod());

        Map<String, List<String>> headers = httpURLConnection.getHeaderFields();

        for (String key : headers.keySet() ) {
            List<String> value = headers.get(key);
            System.out.println("Ключ: " + key + " Значение: " + value);

//        HashMap<String, Integer> map = new HashMap<String, Integer>();
//        map.put("Сергей", 21);
//        map.put("Николай", 25);

//        for (String key: map.keySet()) {// метод keySet возвращает множество ключей
//            Integer value = map.get(key); // переменной value присваиваем значение по ключу
//            System.out.println(key + value);



        }


    }
}
