package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

public class CarsController {
    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int allCars, Model model) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("Tahoe Chevrolet", "White", 171));
        list.add(new Car("Porsche Cayenne", "Black", 777));
        list.add(new Car("Ferrari", "Red", 295));
        list.add(new Car("Lamborghini Diablo", "Metallic", 497));
        list.add(new Car("Aston Martin", "Blue", 538));
        list = CarService.carsCount(list, allCars);
        model.addAttribute("list", list);
        return "cars";
    }
}





