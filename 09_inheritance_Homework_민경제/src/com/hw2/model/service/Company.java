package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements ManagementSystem{

	private Employee[] employees = new Employee[];
	
	private int employeeCount;
	
	public Company(int size) {
		Employee[] employees = new Employee[size];
		employeeCount = 0;
	}

	@Override
	public void addPerson(Person person) {
		
		employees[0] = new Employee("EMP001", "유재석", "기획팀");
		employees[1] = new Employee("EMP002", "정형돈", "개발팀");
		
		for(int i = 0; i < employees.length; i++) {
			if(employees[i] != null) {
				System.out.println("전체 직원 명단 : ");
				System.out.println();
				employees[i].getInfo();
			}
			else {
				return;
			}
		}
		return;
		
	}

	@Override
	public void removePerson(String id) {
		if(id.equals(id)) {
			System.out.println("직원이 삭제되었습니다 - ID : " + id + ", 이름 : " + );
		}
	}

	@Override
	public void displayAllPersons() {
		
	}

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}
	
	
	
	
	
	
}
