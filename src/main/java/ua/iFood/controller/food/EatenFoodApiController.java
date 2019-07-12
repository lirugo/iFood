package ua.iFood.controller.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.iFood.entity.EatenFood;
import ua.iFood.entity.Food;
import ua.iFood.service.EatenFoodServiceImpl;
import ua.iFood.service.FoodServiceImpl;

import java.util.Map;

@RestController
@RequestMapping("/api/eaten-food/")
public class EatenFoodApiController {

    @Autowired
    private EatenFoodServiceImpl eatenFoodService;

    @PostMapping
    public EatenFood store(
            @RequestBody Map<String, Integer> body
    ) {
        return eatenFoodService.save(body.get("id"), body.get("weight"));
    }

}
