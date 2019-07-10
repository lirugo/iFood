package ua.iFood.controller.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.iFood.entity.Food;
import ua.iFood.exceptions.FoodNotFoundException;
import ua.iFood.repo.FoodRepo;

import java.util.List;

@RestController
@RequestMapping("/api/food/")
public class FoodApiController {

    @Autowired
    private FoodRepo foodRepo;

    @GetMapping
    public List<Food> all(){
        return foodRepo.findAll();
    }

    @GetMapping("{id}")
    public Food get(@PathVariable Long id){
        return foodRepo.findById(id)
                .orElseThrow(() -> new FoodNotFoundException(id));
    }

    @PutMapping("{id}")
    public Food update(@RequestBody Food newFood, @PathVariable Long id) {

        return foodRepo.findById(id)
                .map(food -> {
                    return foodRepo.save(newFood);
                })
                .orElseGet(() -> {
                    return foodRepo.save(newFood);
                });
    }

    @PostMapping
    public Food store(@RequestBody Food food) {
        return foodRepo.save(food);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        foodRepo.deleteById(id);
    }

}
