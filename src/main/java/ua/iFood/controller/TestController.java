package ua.iFood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.iFood.entity.Food;
import ua.iFood.repo.FoodRepo;

@Controller
@RequestMapping("/")
public class TestController {
    @Autowired
    private FoodRepo foodRepo;

    @GetMapping
    public String index(){
        Food food = new Food();
        food.setName("asd");
        foodRepo.save(food);

        return "index";
    }
}
