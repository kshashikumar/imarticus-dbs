package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping(value="/employee")
	public ResponseEntity<List<Employee>> getEmployee() {
	   List<Employee> employees=employeeService.findAll();
	   return new ResponseEntity<List<Employee>>(employees,HttpStatus.OK);
	}
	
	@GetMapping(value="/employee/{id}")
	public ResponseEntity<Employee> getOneEmployee(@PathVariable int id) {
		Employee employee= employeeService.findById(id);
		return  new ResponseEntity<Employee>(employee,HttpStatus.OK);
	}

	@PostMapping(value="/employee")
	public ResponseEntity<Employee> postEmployee(@RequestBody Employee employee) {
		Employee res= employeeService.addEmployee(employee);
		return new ResponseEntity<Employee>(res,HttpStatus.OK);
	}
	
	@PutMapping(value="/employee/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable int id,@RequestBody Employee employee) {
		Employee res= employeeService.updateEmployee(id, employee);
		return new ResponseEntity<Employee>(res,HttpStatus.OK);
	}
	
	@DeleteMapping(value="/employee/{id}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable int id) {
		Employee res= employeeService.deleteEmployee(id);
		return new ResponseEntity<Employee>(res,HttpStatus.OK);
	}
	
}
