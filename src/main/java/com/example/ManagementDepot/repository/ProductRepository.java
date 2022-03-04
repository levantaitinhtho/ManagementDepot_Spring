package com.example.ManagementDepot.repository;

import com.example.ManagementDepot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    List<Product> findByName(String name);
    List<Product> searchByID(int id);
}
