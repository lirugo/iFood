package ua.iFood.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

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
    private Date date;

    public EatenFood() {
    }
}
