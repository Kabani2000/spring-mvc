package web.service;

import web.model.Car;

import java.util.Arrays;
import java.util.List;

public class CarService {

    public static List<String> getCars() {
        return Arrays.asList(new Car("Гибддец", 1000, 3).toString(),
                new Car("Тапки Гулливера", 123, 3145).toString(),
                new Car("Адский Каток", 666, 666).toString());
    }
}
