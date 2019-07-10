package ua.iFood.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.iFood.entity.Food;

import java.util.List;

public interface FoodRepo extends JpaRepository<Food, Long> {
    List<Food> findAllByOrderByIdDesc();
}
