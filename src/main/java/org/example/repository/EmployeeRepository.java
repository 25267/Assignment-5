package org.example.repository;

import org.example.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {



    //select * from user where name=?
//    List<Employee> findByName(String name);


    @Query(value = "SELECT * FROM Employee e WHERE e.type=?1", nativeQuery = true)
    Employee findEmployeeByHisName(String type);


    //select * from user where name=? and age >= ?
//    List<Employee> findByNameAndAgeGreaterThanEqual(String name, Integer age);
}
