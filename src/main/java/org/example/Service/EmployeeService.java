package org.example.Service;

import org.example.model.Employee;

import java.util.List;

public interface  EmployeeService {

    List<Employee> getAll();
    Employee getOne(String type);
    void updateEmployee(Long id, double salary);
}
