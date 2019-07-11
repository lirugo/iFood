package ua.iFood.service;

import ua.iFood.entity.EatenFood;
import ua.iFood.entity.Food;

import java.util.List;

public interface EatenFoodService {
    EatenFood save(Food food, int weight);
}
