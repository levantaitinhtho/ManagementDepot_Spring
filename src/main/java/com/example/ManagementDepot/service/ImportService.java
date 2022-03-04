package com.example.ManagementDepot.service;

import com.example.ManagementDepot.entity.Import;

import java.util.List;
import java.util.Optional;

public interface ImportService {

    Iterable<Import> findAll();

    List<Import> searchByName(String name);

    Optional<Import> findOne(Integer id);

    void save (Import impor);

    void delete(Integer id);

    List<Import> searchByID(int id);
}
