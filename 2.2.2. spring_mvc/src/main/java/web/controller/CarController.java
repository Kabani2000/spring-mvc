package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class CarController {

    @GetMapping("/cars")
    public String carsTable(@RequestParam(value = "locale", required = false) String locale,
                            Model model) {

        List<String> result = new ArrayList<>();

        if (locale.equals("ru")) {
            result.add("МАШИНЫ");
        } else if (locale.equals("en")) {
            result.add("CARS");
        }
        result.addAll(CarService.getCars());
        model.addAttribute("result", result);
        return "cars";
    }
}
