package ua.iFood.controller.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import ua.iFood.entity.Food;
import ua.iFood.service.FoodService;

import java.util.Optional;

@RestController
@RequestMapping("/api/food")
public class FoodApiController {

    @Autowired
    private FoodService foodService;

    @GetMapping
    public Page<Food> all(Pageable p, @RequestParam Optional<String> search){
        return foodService.getAll(p, search.orElse("_"));
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
