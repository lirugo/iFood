package ua.iFood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ua.iFood.entity.Food;
import ua.iFood.exceptions.FoodNotFoundException;
import ua.iFood.repo.FoodRepo;

@Service
public class FoodServiceImpl implements FoodService{

    @Autowired
    private FoodRepo foodRepo;

    @Override
    public Page<Food> getAll(Pageable p, String search) {
        return foodRepo.findAll(search, p);
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
