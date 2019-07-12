package ua.iFood.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "eaten_food")
@Data
public class EatenFood implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Food food;
    private int weight;
    private LocalDateTime dateTime;

    public EatenFood() {
    }
}
