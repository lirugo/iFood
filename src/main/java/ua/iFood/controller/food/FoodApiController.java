package ua.iFood.controller.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.iFood.entity.Food;
import ua.iFood.service.FoodService;

import java.util.List;

@RestController
@RequestMapping("/api/food/")
public class FoodApiController {

    @Autowired
    private FoodService foodService;

    @GetMapping
    public List<Food> all(){
        return foodService.getAll();
    }

    @GetMapping("{id}")
    public Food get(@PathVariable Long id){
        return foodService.getById(id);
    }

    @PostMapping
    public Food store(@RequestBody Food food) {
        return foodService.save(food);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        foodService.delete(id);
    }

}
