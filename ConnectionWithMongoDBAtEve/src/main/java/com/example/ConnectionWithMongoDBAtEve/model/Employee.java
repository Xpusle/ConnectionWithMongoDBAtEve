package com.example.ConnectionWithMongoDBAtEve.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="Employee_coolection")
public class Employee {
	
	@Id
	private Integer id;
	
	private String Employeename;
	private String Department;
	private double Salary;
	/**
	 * @return the employeeid
	 */
	public Integer getid() {
		return id;
	}
	/**
	 * @return the employeename
	 */
	public String getEmployeename() {
		return Employeename;
	}
	/**
	 * @return the department
	 */
	public String getDepartment() {
		return Department;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return Salary;
	}
	/**
	 * @param employeeid the employeeid to set
	 */
	public void setid(Integer id) {
		this.id = id;
	}
	/**
	 * @param employeename the employeename to set
	 */
	public void setEmployeename(String Employeename) {
		this.Employeename = Employeename;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(String Department) {
		this.Department = Department;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double Salary) {
		this.Salary = Salary;
	}
	
	

}
