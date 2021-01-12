package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String carBase(@RequestParam(value = "count", required = false) Integer count, Model model) {
        model.addAttribute("cars", new CarService().getCars(count));
        return "cars";
    }
}
