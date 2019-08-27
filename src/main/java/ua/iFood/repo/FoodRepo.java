package ua.iFood.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import ua.iFood.entity.Food;

import java.util.List;

public interface FoodRepo extends PagingAndSortingRepository<Food, Long> {
    List<Food> findAllByOrderByIdDesc();
}
