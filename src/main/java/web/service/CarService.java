package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private List<Car> cars = new ArrayList<>();

    public List<Car> getAllCars(){
        cars.add(new Car("Tahoe Chevrolet", "White", 171));
        cars.add(new Car("Porsche Cayenne", "Black", 777));
        cars.add(new Car("Ferrari", "Red", 295));
        cars.add(new Car("Lamborghini Diablo", "Metallic", 497));
        cars.add(new Car("Aston Martin", "Blue", 538));
        return  cars;
    }
}
