package ua.iFood.config;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import ua.iFood.entity.Food;
import ua.iFood.repo.FoodRepo;

import java.util.Random;

@Component
public class Seeder implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private FoodRepo foodRepo;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
//        foodSeed();
    }

    private void foodSeed() {
        System.out.println("Seeding...");
        for(int i=0; i<100000; i++){
            Faker faker = new Faker();
            Food f = new Food();
            f.setName(faker.name().firstName());
            f.setCalories(new Random().nextInt(100)+1);
            f.setCarbohydrates(new Random().nextInt(100)+1);
            f.setFat(new Random().nextInt(100)+1);
            f.setProteins(new Random().nextInt(100)+1);

            foodRepo.save(f);
            if(i%1000== 0)
                System.out.print(i + "... ");
        }
        System.out.println();
        System.out.println("Seeding finished");
    }
}
