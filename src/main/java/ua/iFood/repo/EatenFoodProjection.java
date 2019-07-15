package ua.iFood.repo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.rest.core.config.Projection;
import ua.iFood.entity.EatenFood;
import ua.iFood.entity.Food;

import java.util.Date;

@Projection(
        name = "eatenFoodProjection",
        types = { EatenFood.class })
public interface EatenFoodProjection {
    long getId();
    int getWeight();
    Food getFood();

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm")
    Date getDate();
}
