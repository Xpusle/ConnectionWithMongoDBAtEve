package com.example.ConnectionWithMongoDBAtEve.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ConnectionWithMongoDBAtEve.Service.Employeeservice;
import com.example.ConnectionWithMongoDBAtEve.model.Employee;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	
	@Autowired
	Employeeservice employeeservice;
	
	@PostMapping
	public String CreateStudentByid(@RequestBody Employee employee) {
		return employeeservice.Upsert(employee);
	}
	
	@GetMapping("/{id}")
	public Employee GetEmployeeByid(@PathVariable Integer id) {
		return employeeservice.GetEmployeeByEmployeeid(id);
	}
	
	@GetMapping("/AllEmployees")
	public List<Employee> GetAllEmployeesrecordAtOnce(){
		return employeeservice.GetAllEmployeesAtOnce();
	}
	
	@PutMapping
	public String UpdateTheRecord(@RequestBody Employee employee) {
		return employeeservice.Upsert(employee);
	}
	
	@DeleteMapping("/{id}")
	public String DeleteEmployeeRecordByid(@PathVariable Integer id) {
		return employeeservice.DeleteEmployeeById(id);
	}
}
