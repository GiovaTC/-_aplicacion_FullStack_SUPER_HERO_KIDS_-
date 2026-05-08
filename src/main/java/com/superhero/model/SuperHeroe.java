package com.superhero.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "SUPER_HEROES")
@Data
public class SuperHeroe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nombre;
    private String poder;
    private Integer nivel;
    private String universo;
}
