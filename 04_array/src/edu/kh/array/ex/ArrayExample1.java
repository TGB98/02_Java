package edu.kh.array.ex;

import java.util.Arrays;

public class ArrayExample1 {

	/*
	 * 배열(Array)
	 * - 같은 자료형의 변수를 하나의 묶음으로 다루는 것.
	 * - 묶여진 변수들은 하나의 배열명으로 불러지고
	 * 	 구분은 index를 이용함. ( index는 0부터 시작하는 정수 )
	 * */
	
	public void ex1() {
		
		// 변수 vs 배열
		// 변수 선언
		int num;
		// stack 영역에 int 자료형을 저장할 수 있는 공간 4byte를 할당하고
		// 그 공간에 num 이라는 이름을 부여.
		
		// 변수 대입
		num = 10;
		// 생성된 num 이라는 변수 공간에 10 이라는 값을 대입.
		
		// 변수 사용
		System.out.println("num에 저장된 값 : "+ num);
		// num 이 작성된 자리에 num 에 저장된 값을 읽어와 출력.
		
		
		// ------------------------------------------------------------------
		
		// 배열 선언
		int arr[]; 
		// Stack 영역에 int[] 자료형 공간을 4byte 할당하고
		// 그 공간에 arr 이라는 이름을 부여.
		// ** 해당 변수는 참조형으로 주소값만을 저장할 수 있다. **
		
		// 배열 할당
		arr = new int[3];
		
		// new : "new 연산자". 
		// 		Heap 메모리 영역에 새로운 공간(배열, 객체)을 할당.
		
		// int[3] : int 자료형 변수 3개를 하나의 묶음으로 나타내는 배열.
		
		// new int[3] : Heap 영역에 int 3칸짜리 int[]을 생성(할당).
		
		// arr = new int[3];
		// int[]   int[]    -> 같은 자료형. == 연산 가능
		
		// Heap 영역에 생성된 공간은 절대 비어있을 수 없다
		// -> JVM 이 기본값을 넣는다.
		// boolean : false
		// 나머지 : 0
		// 참조형 : null
		// 이 기본값으로 들어간다.
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		
		// 배열 요소 값 대입
		arr[0] = 10;
		arr[1] = 100;
		arr[2] = 1000;
		
		System.out.println("arr : "+ arr); // [I@68fb2c38
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		
		// [ 10, 100, 1000 ] 실제로 arr 배열이 가진 모든 요소의 값을 한 번에 출력
		System.out.println( Arrays.toString(arr) );
		// Arrays.tostring(배열 선언명)
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
