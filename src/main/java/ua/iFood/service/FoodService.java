package ua.iFood.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ua.iFood.entity.Food;

public interface FoodService {
    Page<Food> getAll(Pageable p);
    Food getById(long id);
    Food save(Food food);
    void delete(long id);
}
