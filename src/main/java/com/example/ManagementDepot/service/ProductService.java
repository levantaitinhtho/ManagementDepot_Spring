package com.example.ManagementDepot.service;

import com.example.ManagementDepot.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Iterable<Product> findAll();

    Optional<Product> findOne(Integer id);

    List<Product> searchByName(String name);

    List<Product> searchByID(int ID);

    void delete(Integer id);

    void save (Product product);
}
