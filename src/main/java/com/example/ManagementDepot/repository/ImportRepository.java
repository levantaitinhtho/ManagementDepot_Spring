package com.example.ManagementDepot.repository;

import com.example.ManagementDepot.entity.Employee;
import com.example.ManagementDepot.entity.Import;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImportRepository extends JpaRepository<Import,Integer> {
    List<Import> searchByID(int id);

    List<Import> searchByName(String name);
}
