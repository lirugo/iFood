package ua.iFood.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "eaten_food")
@Data
public class EatenFood {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long food;
    private int weight;
    private LocalDateTime dateTime;
}
