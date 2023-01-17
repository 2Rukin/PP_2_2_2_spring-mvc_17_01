package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService implements CarServiceInterface {

    private List<Car> stringList;
    private final CarDao carDao;


    public CarService(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCarList(int count) {

        return count >= 5 ? stringList =
                new ArrayList<>(carDao.getCarList()) :
                carDao.getCarList().stream().limit(count).collect(Collectors.toList());

    }

}
