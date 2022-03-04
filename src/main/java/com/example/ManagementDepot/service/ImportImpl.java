package com.example.ManagementDepot.service;

import com.example.ManagementDepot.entity.Import;
import com.example.ManagementDepot.repository.ImportRepository;

import java.util.List;
import java.util.Optional;

public class ImportImpl implements ImportService{
    private ImportRepository importRepository;

    public ImportImpl(ImportRepository importRepository) {
        this.importRepository = importRepository;
    }

    @Override
    public Iterable<Import> findAll() {
        return importRepository.findAll();
    }

    @Override
    public List<Import> searchByName(String name) {
        return importRepository.searchByName(name);
    }

    @Override
    public Optional<Import> findOne(Integer id) {
        return importRepository.findById(id);
    }

    @Override
    public void save(Import impor) {
        importRepository.save(impor);
    }

    @Override
    public void delete(Integer id) {
        importRepository.deleteById(id);
    }

    @Override
    public List<Import> searchByID(int id) {
        return importRepository.searchByID(id);
    }
}
