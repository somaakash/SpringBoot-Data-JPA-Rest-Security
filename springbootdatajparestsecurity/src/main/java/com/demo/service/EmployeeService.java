package com.demo.service;

import com.demo.model.Employee;

import java.util.List;

public interface EmployeeService {

    String addEmployee(Employee emp);

    String updateEmployee(Long empId, Employee updatedEmp);

    String deleteEmployee(Long empId);

    Employee getEmployeeById(Long id);

    List<Employee> findAllEmp();
}
