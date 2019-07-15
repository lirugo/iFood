package ua.iFood.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ua.iFood.entity.EatenFood;

import java.util.List;

@RepositoryRestResource(
        path = "eaten-foods",
        excerptProjection = EatenFoodProjection.class)
public interface EatenFoodRepo extends PagingAndSortingRepository<EatenFood, Long> {
    List<EatenFood> findAllByOrderByIdDesc();
}
