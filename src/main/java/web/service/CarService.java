package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    private List<Car> cars = new ArrayList<Car>() {{
        add(new Car("Tahoe Chevrolet", "White", 171));
        add(new Car("Porsche Cayenne", "Black", 777));
        add(new Car("Ferrari", "Red", 295));
        add(new Car("Lamborghini Diablo", "Metallic", 497));
        add(new Car("Aston Martin", "Blue", 538));
    }};

    public List<Car> getCars(int number) {
        return cars.stream().limit(number).toList();
    }
}
