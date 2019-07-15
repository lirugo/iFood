package ua.iFood.controller.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.iFood.entity.EatenFood;
import ua.iFood.service.EatenFoodServiceImpl;

import java.util.Map;

@RestController
@RequestMapping("/api/eaten-foods/")
public class EatenFoodApiController {

    @Autowired
    private EatenFoodServiceImpl eatenFoodService;

    @PostMapping
    public EatenFood store(
            @RequestBody Map<String, Integer> body
    ) {
        return eatenFoodService.save(body.get("id"), body.get("weight"));
    }

}
