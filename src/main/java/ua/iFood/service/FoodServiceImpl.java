package ua.iFood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.iFood.entity.Food;
import ua.iFood.exceptions.FoodNotFoundException;
import ua.iFood.repo.FoodRepo;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService{

    @Autowired
    private FoodRepo foodRepo;

    @Override
    public List<Food> getAll() {
        return foodRepo.findAllByOrderByIdDesc();
    }

    @Override
    public Food getById(long id) {
        return foodRepo.findById(id)
                .orElseThrow(() -> new FoodNotFoundException(id));
    }

    @Override
    public Food save(Food food) {
        return foodRepo.save(food);
    }

    @Override
    public void delete(long id) {
        foodRepo.deleteById(id);
    }
}
