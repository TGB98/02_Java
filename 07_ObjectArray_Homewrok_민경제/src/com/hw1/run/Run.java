package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		// 객체 배열을 크기 3으로 할당한 뒤 3개의 생성자를 각각 이용하여 객체 생성 후 출력
		Employee[] empArr = new Employee[3];
		
		Employee emp = new Employee();
		System.out.println("emp[0]: " + emp.information());
		
		Employee emp1 = new Employee();
		emp1 = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
		System.out.println("emp[1]: " + emp1.information());
		
		Employee emp2 = new Employee();
		emp2 = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");
		
		System.out.println("emp[2]: " + emp2.information());
		
		emp.setEmpNo(0);
		emp.setEmpName("김말똥");
		emp.setDept("영업부");
		emp.setJob("팀장");
		emp.setAge(30);
		emp.setGender('M');
		emp.setSalary(3000000);
		emp.setBonusPoint(0.2);
		emp.setPhone("01055559999");
		emp.setAddress("전라도 광주");
		
		System.out.println("==========================================================");
		
		System.out.println("emp[0]: " + emp.information());
		
		emp1.setEmpNo(1);
		emp1.setEmpName("홍길동");
		emp1.setDept("기획부");
		emp1.setJob("부장");
		emp1.setAge(19);
		emp1.setGender('M');
		emp1.setSalary(4000000);
		emp1.setBonusPoint(0.3);
		emp1.setPhone("01022223333");
		emp1.setAddress("서울 잠실");
		
		System.out.println("emp[1]: " + emp1.information());
		
		System.out.println("==========================================================");
		
		int empS = (int)( emp.getSalary() + (emp.getSalary() * emp.getBonusPoint()) )*12;
		int empS1 = (int)( emp1.getSalary() + (emp1.getSalary() * emp1.getBonusPoint()) )*12;
		int empS2 = (int)( emp2.getSalary() + (emp2.getSalary() * emp2.getBonusPoint()) )*12;
		System.out.println("김말똥의 연봉 : " + empS + "원");
		System.out.println("홍길동의 연봉 : " + empS1 + "원");
		System.out.println("강말순의 연봉 : " + empS2 + "원");
		
		System.out.println("==========================================================");
		
		System.out.println("직원들의 연봉의 평균 : " + (empS + empS1 + empS2)/3 + "원");
		
		
		}

		
	
	
	}


