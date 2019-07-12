package ua.iFood.service;

import ua.iFood.entity.EatenFood;
import ua.iFood.entity.Food;

import java.util.List;

public interface EatenFoodService {
    EatenFood save(long foodId, int weight);
}
