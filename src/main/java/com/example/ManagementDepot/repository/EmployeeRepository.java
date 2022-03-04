package com.example.ManagementDepot.repository;

import com.example.ManagementDepot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
        List<Employee> searchByID(int id);

        List<Employee> seachByName(String name);
}
