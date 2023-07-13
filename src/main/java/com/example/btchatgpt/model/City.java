package com.example.btchatgpt.model;

import javax.persistence.*;

@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double area; //khu vuc
    private Long population; //dan so
    private Double gdp;
    private String introduce; // gioi thieu
    @ManyToOne
    private Country country;
}
