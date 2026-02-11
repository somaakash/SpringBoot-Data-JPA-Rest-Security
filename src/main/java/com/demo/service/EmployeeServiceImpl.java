package com.demo.service;

import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao employeeDao;

    @Override
    public String addEmployee(Employee emp) {
        employeeDao.save(emp);
        return emp.getEmpName() + " Saved Successfully";
    }

    @Override
    public String updateEmployee(Long empId, Employee updatedEmp) {

        Employee emp = getEmployeeById(empId);

        emp.setEmpName(updatedEmp.getEmpName());
        emp.setEmpSAlary(updatedEmp.getEmpSAlary());

        return emp.getId() + " Updated Successfully";
    }

    @Override
    public String deleteEmployee(Long empId) {
        employeeDao.deleteById(empId);

        return "Deleted Successfully";
    }

    @Override
    public Employee getEmployeeById(Long id) {
        Employee emp = employeeDao.findById(id).get();
        return emp;
    }

    @Override
    public List<Employee> findAllEmp() {
        return employeeDao.findAll();
    }
}
