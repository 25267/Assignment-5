//package org.example.Dao;
//
//import org.example.model.Employee;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Component
//public class EmployeeDao {
//
//    @Value("${dataConnection.URL}")
//    private    String URL;
//    @Value("${dataConnection.USERNAME}")
//    private   String USERNAME;
//    @Value("${dataConnection.PASSWORD}")
//    private    String PASSWORD;
//
//    private Connection connection;
//    private List<Employee> employeeList = new ArrayList<>();
//
//
//
//    @PostConstruct
//    private void getInit() throws SQLException {
//
//        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//        PreparedStatement preparedStatement;
//
//        preparedStatement = connection.prepareStatement("SELECT * FROM Employee");
//        ResultSet resultSet = preparedStatement.executeQuery();
//
//       while (resultSet.next()) {
//
//
//           Employee employee = new Employee();
//
//           employee.setId(resultSet.getInt("id"));
//           employee.setSalary(resultSet.getDouble("salary"));
//           employee.setType(resultSet.getString("type"));
//
//           employeeList.add(employee);
//
//       }
//
//
//
//    }
//
//
//
//    public Employee show(String type) throws SQLException {
//        Employee employee = null;
//
//        PreparedStatement preparedStatement =
//                connection.prepareStatement("SELECT * FROM Employee WHERE type=?");
//
//        preparedStatement.setString(1, type);
//
//        ResultSet resultSet = preparedStatement.executeQuery();
//
//        resultSet.next();
//
//        employee = new Employee();
//
//
//        employee.setType(resultSet.getString("type"));
//        employee.setSalary(resultSet.getDouble("salary"));
//        employee.setId(resultSet.getInt("id"));
//
//        return employee;
//    }
//
//    public List<Employee> getEmployeeList() {
//        return employeeList;
//    }
//
//
//
//    public void updateEmployee(int id, double salary) throws SQLException {
//
//        PreparedStatement preparedStatement =
//                connection.prepareStatement("UPDATE Employee SET salary=? WHERE id=?");
//
//        preparedStatement.setDouble(1,salary);
//        preparedStatement.setDouble(2,id);
//
//        preparedStatement.executeUpdate();
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
