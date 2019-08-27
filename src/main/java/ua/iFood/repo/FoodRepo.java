package ua.iFood.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import ua.iFood.entity.Food;

import java.util.List;

public interface FoodRepo extends JpaRepository<Food, Long> {
    List<Food> findAllByOrderByIdDesc();

    @Query("SELECT f FROM Food f WHERE name like %?1%")
    Page<Food> findAll(String search, Pageable p);
}
