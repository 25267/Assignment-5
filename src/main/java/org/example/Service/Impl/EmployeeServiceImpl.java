package org.example.Service.Impl;

import org.example.Service.EmployeeService;
import org.example.model.Employee;
import org.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAll() {
        List<Employee>  employees= new ArrayList<>();

        employeeRepository.findAll()
                .forEach(employees::add);

        return employees;

    }

    @Override
    public Employee getOne(String type) {
        return employeeRepository.findEmployeeByHisName(type);
    }

    @Override
    public void updateEmployee(Long id, double salary) {
        Optional<Employee> employeeOptional = employeeRepository.findById(id);

        if(employeeOptional.isPresent()){
            Employee employee = employeeOptional.get();
            employee.setSalary(salary);

            employeeRepository.save(employee);
        }
    }
}
