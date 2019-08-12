package ua.iFood.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "usr")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    public String name;
    public String email;
    public String password;
}
