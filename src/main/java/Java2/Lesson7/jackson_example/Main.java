package Java2.Lesson7.jackson_example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main   {
    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        Car car = new Car("Red", "BMW");
        System.out.println(objectMapper.writeValueAsString(car));
        objectMapper.writeValue(new File("car.json"), car);

        Car carFromFile = objectMapper.readValue(new File("car.json"), Car.class);
        System.out.println(carFromFile);

        List<Car> carList1 = new ArrayList<>(Arrays.asList(new Car("White", "Mercedes"),
                new Car("Black", "Renault")));
        System.out.println("Список машин: " + carList1);
        String carsList = objectMapper.writeValueAsString(carList1);
        System.out.println("Сериализованный список машин" + carsList);

        List<Car> cars = objectMapper.readValue(carsList, new TypeReference<List<Car>>() {
        });
        System.out.println("Десериализованный список машин" + cars);



    }


}
