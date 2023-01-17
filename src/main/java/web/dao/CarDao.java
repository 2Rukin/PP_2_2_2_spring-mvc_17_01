package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDao implements CarDaoInterface {

    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("russian", "Zhiguli", 7));
        carList.add(new Car("inomarka", "Toyota", 707));
        carList.add(new Car("russian", "GAZ", 2410));
        carList.add(new Car("russian", "ZaporoZHEC", 777));
        carList.add(new Car("russian", "UAZ", 5));
        carList.add(new Car("inomarka", "Bmw", 7));
        carList.add(new Car("russian", "Mockvich", 41));
    }
    @Override
    public List<Car> getCarList() {
        return carList;
    }


}
