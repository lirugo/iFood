package ua.iFood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.iFood.entity.EatenFood;
import ua.iFood.entity.Food;
import ua.iFood.repo.EatenFoodRepo;

import java.time.LocalDateTime;

@Service
public class EatenFoodServiceImpl implements EatenFoodService{

    @Autowired
    private EatenFoodRepo eatenFoodRepo;

    @Override
    public EatenFood save(Food food, int weight) {
        EatenFood eatenFood = new EatenFood();
        eatenFood.setFood(food.getId());
        eatenFood.setWeight(weight);

        LocalDateTime now = LocalDateTime.now();
        eatenFood.setDateTime(now);

        eatenFoodRepo.save(eatenFood);
        return eatenFood;
    }
}
