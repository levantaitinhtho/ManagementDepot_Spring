package com.example.ManagementDepot.service;

import com.example.ManagementDepot.entity.Employee;
import com.example.ManagementDepot.entity.Export;
import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ExportService  {

    Iterable<Export> findAll();

    List<Export> searchByName(String name);

    Optional<Export> findOne(Integer id);

    void save(Export export);

    void delete(Integer id);

    List<Export> searchByID(int id);

}
