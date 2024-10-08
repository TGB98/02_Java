package edu.kh.basic;

// 한 줄 주석
/* 검성 고길동 범위 주석*/

// class : 자바 코드가 작성되는 영역.
public class JavaBasic {
	
	public static void main(String[] args) {
		// main method(메서드) : 자바 애플리케이션[프로그램]을 실행하기 위해 반드시 필요한 메서드.
		// main ctrl+space 를 치면 자동완성으로 메인메서드가 뜸.
		
		// 콘솔창에 출력하는 메서드
		System.out.println("Hello, World!!");
		System.out.println("검성 고길동");
		System.out.println("소드마스터 고길동");
		System.out.println("둘리");
		// System.out.println(); syso ctrl+space 를 치면 자동완성으로 뜬다.
		// 한 줄 복사는 커서를 두고 ctrl+alt+방향키(위/아래)
		
		// 실행 단축키 : ctrl + F11 / Run 아이콘
		
		System.out.println("-------------------------------");
		
		// 숫자 연산
		System.out.println("1 + 2"); // 1 + 2
		System.out.println(1 + 2); // 3
		
		// " " 안에 작성된 코드는 단순 문자열로 인식.
		// " " 안에 작성되지 않은 코드는 숫자, 변수로 인식.
		
		System.out.println(50 - 23);
		System.out.println(12 * 13);
		System.out.println(327 / 3);
		System.out.println(12 % 2);
		
		// " "(문자열) + 숫자 함께 작성.
		System.out.println("14 * 19 = "+ 14 * 19);
		System.out.println("14 * 19 = "+ 266 );
		
		System.out.println("90 + 70 + 65 = "+ (90+70+65));
		// 자바는 사칙연산의 우선 순위를 그대로 따른다.
		// -> 우선 계산을 원하면 () 소괄호 사용.
		
		// + 기호의 역할.
		// -> 숫자 + 숫자 = 덧셈 연산 결과.
		// -> 문자열 + 숫자 or 문자열 + 문자열 = 이어쓰기
	}
}
