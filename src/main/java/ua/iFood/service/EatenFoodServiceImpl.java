package ua.iFood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.iFood.entity.EatenFood;
import ua.iFood.entity.Food;
import ua.iFood.repo.EatenFoodRepo;

import java.util.Date;
import java.util.List;

@Service
public class EatenFoodServiceImpl implements EatenFoodService{

    @Autowired
    private EatenFoodRepo eatenFoodRepo;

    @Autowired
    private FoodServiceImpl foodService;

    @Override
    public List<EatenFood> getAll() {
        return eatenFoodRepo.findAllByOrderByIdDesc();
    }

    @Override
    public EatenFood save(long foodId, int weight) {
        Food food = foodService.getById(foodId);

        EatenFood eatenFood = new EatenFood();
        eatenFood.setFood(food);
        eatenFood.setWeight(weight);

        eatenFood.setDate(new Date());

        eatenFoodRepo.save(eatenFood);
        return eatenFood;
    }
}
