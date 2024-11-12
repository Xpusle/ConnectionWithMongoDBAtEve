package com.example.ConnectionWithMongoDBAtEve.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ConnectionWithMongoDBAtEve.Repository.EmployeeRepository;
import com.example.ConnectionWithMongoDBAtEve.model.Employee;

@Service
public class Employeeservice {
	
	@Autowired
	EmployeeRepository employeerepo;
	
	public String Upsert(Employee employee) {
		employeerepo.save(employee);
		return "200OK";
	}
	
	public Employee GetEmployeeByEmployeeid(Integer id) {
		java.util.Optional<Employee>em=employeerepo.findById(id);
		if(em.isPresent()) {
			return em.get();
		}
		return null;
	}
	
	public List<Employee> GetAllEmployeesAtOnce(){
		return employeerepo.findAll();
	}
	
	public String DeleteEmployeeById(Integer Employeeid) {
		employeerepo.deleteById(Employeeid);
		return "200Ok";
	}
	

}
