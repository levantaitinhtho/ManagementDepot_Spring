package com.example.ManagementDepot.repository;

import com.example.ManagementDepot.entity.Employee;
import com.example.ManagementDepot.entity.Export;
import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExportRepository extends JpaRepository<Export,Integer> {
    List<Export> searchByID(int id);

    List<Export> searchByName(String name);
}
