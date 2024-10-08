package edu.kh.variable.ex1;

public class VariableExample3 {
	public static void main(String[] args) {
		
		/* 형 변환 ( Casting ) : 값의 자료형을 변환하는 것. ( 단, boolean 은 제외 )
		 * -> 왜 필요한가?
		 * 컴퓨터는 기본적으로 같은 자료형끼리만 연산이 가능하다.
		 * 다른 자료형과 연산 시 오류가 발생할 수 있다.
		 * -> 이런 상황을 해결하기 위해 필요한 기술.
		 * 
		 * 형 변환 종류 : 자동 형 변환 / 강제 형 변환
		 * */
		
		int num1 = 10;
		double num2 = 3.5;
		
		System.out.println("자동 형 변환 결과 : " + (num1 + num2) );
		// 원래 에러가 발생해야 하지만, "자동 형 변환" 때문에 발생하지 않음.
		
		
		// int -> long 형 변환.
		
		int i2 = 2_100_000_000;
		long l2 = 10_000_000_000L;
		
		long result2 = i2 + l2; // int가 long으로 형 변환 되고 계산됨.
		
		System.out.println("result : " + result2);
		
		// char -> int 형 변환
		// char 자료형은 문자형이지만 실제 저장하는 값은
		// 0부터 65000번 사이에 있는 숫자 (정수형)
		
		char ch3 = 'V';
		int i3 = ch3;
		
		System.out.println(i3);
		
		char ch4 = '각';
		int i4 = ch4;
		
		System.out.println(i4);
	}
}
