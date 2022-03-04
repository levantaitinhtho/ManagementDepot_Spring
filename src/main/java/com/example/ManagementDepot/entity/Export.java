package com.example.ManagementDepot.entity;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "export")
@Data
@AllArgsConstructor
public class Export {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @NotEmpty
    private Integer id;


    @Column(name = "product_id")
    private Integer product_id;

    @Column(name = "export_number")
    private Integer export_number;

    @Column(name = "export_date")
    private String export_date;

    @Column(name = "update_by")
    private Integer update_by;

    @Column(name = "price")
    private Integer price;


    public Export() {
    }
}
