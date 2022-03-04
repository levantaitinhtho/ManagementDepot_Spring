package com.example.ManagementDepot.service;

import com.example.ManagementDepot.entity.Employee;
import com.example.ManagementDepot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public List<Employee> searchByName(String name) {
        return employeeRepository.seachByName(name);
    }

    @Override
    public Optional<Employee> findOne(Integer id) {
         return employeeRepository.findById(id);
    }

    @Override
    public void save(Employee employee) {
         employeeRepository.save(employee);
    }

    @Override
    public void delete(Integer id) {
         employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> searchByID(int id) {
        return employeeRepository.searchByID(id);
    }

}
