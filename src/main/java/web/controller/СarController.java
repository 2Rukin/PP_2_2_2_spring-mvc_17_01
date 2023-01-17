package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class СarController {

    private final CarService carService;

    public СarController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping(value = "/car")
    public String getList(@RequestParam(value = "count", required = false, defaultValue = "5") Integer count, Model model) {

        model.addAttribute("cars", carService.getCarList(count.intValue()));

        return "car";
    }

}
