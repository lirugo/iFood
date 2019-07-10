package ua.iFood.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.iFood.entity.Food;

public interface FoodRepo extends JpaRepository<Food, Long> {
}
