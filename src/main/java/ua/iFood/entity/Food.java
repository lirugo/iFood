package ua.iFood.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "food")
@Data
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    public String name;
    public int proteins;
    public int fat;
    public int carbohydrates;
    public int calories;
}
