package com.demo.controller;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class EmployeeController {

    private EmployeeService employeeService;

    @PostMapping("/add")
    public ResponseEntity<String> addEmp(@RequestBody Employee emp) {

        return ResponseEntity.ok(employeeService.addEmployee(emp));
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateEmp(@RequestParam Long empId, @RequestBody Employee updatedEmp) {

        return ResponseEntity.ok(employeeService.updateEmployee(empId, updatedEmp));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteEmp(@RequestParam Long empId) {

        return ResponseEntity.ok(employeeService.deleteEmployee(empId));
    }

    @GetMapping("/get")
    public ResponseEntity<Employee> getEmpById(@RequestParam Long empId) {

        return ResponseEntity.ok(employeeService.getEmployeeById(empId));
    }

    @GetMapping("/getall")
    public ResponseEntity<List<Employee>> getALlEMployees() {

        return ResponseEntity.ok(employeeService.findAllEmp());
    }

}
