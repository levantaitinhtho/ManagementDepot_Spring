package com.example.ManagementDepot.service;

import com.example.ManagementDepot.entity.Product;
import com.example.ManagementDepot.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProductImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findOne(Integer id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> searchByName(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public List<Product> searchByID(int id) {
        return productRepository.searchByID(id);
    }

    @Override
    public void delete(Integer id) {
        productRepository.deleteById(id);
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }
}
