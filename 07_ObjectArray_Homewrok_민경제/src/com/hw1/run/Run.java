package com.hw1.run;

import java.util.Arrays;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		// 객체 배열을 크기 3으로 할당한 뒤 3개의 생성자를 각각 이용하여 객체 생성 후 출력
		Employee[] empArr = new Employee[3];
		
		Employee emp = new Employee();
		empArr[0] = new Employee();
		empArr[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
		empArr[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");
		}
		System.out.println(Arrays.deepToString(empArr));
		System.out.println(empArr[1]);
		System.out.println(empArr[2]);
	}

}
