package edu.kh.op.ex;

public class OpExample { // 예제 코드 작성할 클래스

	// ex1() method : 객체 지향 프로그래밍에서 OpExample 객체와 관련된 함수
	// -> OpExample이 가지고 있는 기능 중 ex1() 이라는 기능.
	public void ex1() {
		// 증감(증가, 감소) 연산자 : ++ , --
		
		int iNum1 = 10;
		int iNum2 = 10;
		
		iNum1++;
		iNum2--;
		
		System.out.println("iNum1 : " + iNum1); // 11
		System.out.println("iNum2 : " + iNum2); // 9
		
		// 전위 연산
		int temp1 = 5;
		
		System.out.println(++temp1 + 5); // 11
		
		// 후위 연산
		int temp2 = 3;
		
		System.out.println(temp2-- + 2); // 5
		//					3 + 2 -> 5
		// 					3-- -> 2
		System.out.println(temp2);
		
		
		int a = 3;
		int b = 5;
		int c = a++ + --b;
		
		// 최종적으로 a,b,c는 각각 얼마?
		
		System.out.printf("%d / %d / %d\n", a, b, c);
		// 					4 / 4  / 7
		
		
		
		
		
		
		
	}
	
	
	public void ex2() {
		// 비교 연산자 : > , < , >= , <= , == , !=
		// 비교 연산자의 결과는 항상 논리값 ( true / false )
		
		int a = 10;
		int b = 20;
		
		System.out.println( ( a == b ) == false ); // true
		
		int c = 4;
		int d = 5;
		System.out.println( ( ++c != d ) == ( --c != d) ); // false
	}
	
}
