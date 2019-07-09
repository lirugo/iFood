package ua.iFood.repo;

import org.springframework.data.repository.CrudRepository;
import ua.iFood.entity.Food;

public interface FoodRepo extends CrudRepository<Food, Long> {
}
