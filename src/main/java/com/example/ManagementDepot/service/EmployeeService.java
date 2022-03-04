package com.example.ManagementDepot.service;

import com.example.ManagementDepot.entity.Employee;

import java.util.List;
import java.util.Optional;


public interface EmployeeService {

    Iterable<Employee> findAll();

    List<Employee> searchByName(String name);

    Optional<Employee> findOne(Integer id);

    void save(Employee employee);

    void delete(Integer id);

    List<Employee> searchByID(int id);

}
