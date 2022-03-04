package com.example.ManagementDepot.entity;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
@AllArgsConstructor
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;


    @NotEmpty
    @Column(name = "name_product")
    private String name;

    @Column(name = "producer")
    private String producer;

    @Column(name = "number")
    private int number_product;


    public Product() {

    }
}
