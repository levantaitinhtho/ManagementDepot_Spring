package com.example.ManagementDepot.entity;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "import")
@Data
@AllArgsConstructor
public class Import {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @NotEmpty
    private Integer id;

    @NotEmpty
    @Column(name = "product_id")
    private Integer product_id;

    @Column(name = "import_number")
    private Integer import_number;

    @Column(name = "import_date")
    private String import_date;

    @Column(name = "update_by")
    private Integer update_by;
     public Import() {
    }
}
