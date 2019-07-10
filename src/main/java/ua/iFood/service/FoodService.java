package ua.iFood.service;

import ua.iFood.entity.Food;

import java.util.List;

public interface FoodService {
    List<Food> getAll();
    Food getById(long id);
    Food save(Food food);
    void delete(long id);
}
