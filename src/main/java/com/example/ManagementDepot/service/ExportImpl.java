package com.example.ManagementDepot.service;

import com.example.ManagementDepot.entity.Export;
import com.example.ManagementDepot.repository.ExportRepository;

import java.util.List;
import java.util.Optional;

public class ExportImpl implements ExportService{

    private ExportRepository exportRepository;


    public ExportImpl(ExportRepository exportRepository) {
        this.exportRepository = exportRepository;
    }

    @Override
    public Iterable<Export> findAll() {
        return exportRepository.findAll();
    }

    @Override
    public List<Export> searchByName(String name) {
        return exportRepository.searchByName(name);
    }

    @Override
    public Optional<Export> findOne(Integer id) {
        return exportRepository.findById(id);
    }

    @Override
    public void save(Export export) {
        exportRepository.save(export);
    }

    @Override
    public void delete(Integer id) {
        exportRepository.deleteById(id);
    }

    @Override
    public List<Export> searchByID(int id) {
        return exportRepository.searchByID(id);
    }
}
