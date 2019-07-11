package ua.iFood.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.iFood.entity.EatenFood;

import java.util.List;

public interface EatenFoodRepo extends JpaRepository<EatenFood, Long> {
    List<EatenFood> findAllByOrderByIdDesc();
}
