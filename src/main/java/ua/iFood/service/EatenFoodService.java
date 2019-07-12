package ua.iFood.service;

import ua.iFood.entity.EatenFood;

import java.util.List;

public interface EatenFoodService {
    List<EatenFood> getAll();
    EatenFood save(long foodId, int weight);
}
