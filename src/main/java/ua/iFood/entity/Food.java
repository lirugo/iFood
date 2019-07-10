package ua.iFood.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "food")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    public String name;
    public int proteins;
    public int fat;
    public int carbohydrate;
    public int calories;
}
