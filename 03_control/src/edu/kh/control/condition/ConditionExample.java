package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample { // 기능 제공용 클래스
	
	// import 자동 단축키 : ctrl + shift + o
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		// if 문
		// 조건식이 true 일 때만 내부 코드 실행.
		
		// 입력받은 정수가 양수인지 검사
		// 양수라면 "양수입니다" 출력
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input > 0) {
			System.out.println("양수입니다.");
		}
		if(input <= 0) {
			System.out.println("양수가 아닙니다.");
		}
	}
	
	
	public void ex2() {
	// if - else 문
	// 조건식 결과가 true 면 if 문,
	// 결과가 false 면 else 구문이 실행된다.
	
		
	// 홀,짝 검사
	// 입력받은 정수 값이
	// 홀수이면 "홀수입니다" 출력
	// 0 이면 "0 입니다" 출력
	// 짝수면 "짝수입니다" 출력
	// else if 사용 x, 중첩 if문 사용하기
		
	System.out.print("정수 입력 : ");
	int input = sc.nextInt();
	
	if (input % 2 != 0) {
		System.out.println("홀수입니다");
	}
	
	else {	// 짝수 또는 0 입력 시 실행
		// 중첩 if 문
		if (input == 0) {
			System.out.println("0입니다");
		}
		else {
			System.out.println("짝수입니다");
		}
	}
	}


	public void ex3() {
		
		// if(조건식) - else if(조건식) - else
		
		// 양수, 음수 , 0 판별
		System.out.print(" 정수 입력3 : " );
		int input3 = sc.nextInt();
		
		if (input3 > 0 ) {
			System.out.println("양수 입니다.");
		}
		else if ( input3 < 0) {
			System.out.println("음수 입니다.");
		}
		else {
				System.out.println("0 입니다.");
			}
		}


	public void ex4() {
		
		// 달( month )을 입력 받아, 해당 달에 맞는 계절 출력.
		// 12,1,2 : 겨울 (-15도 이하 : "한파 경보" / -12도 이하 : "한파 주의보")
		// 3,4,5 : 봄
		// 6,7,8 : 여름 (35도 이상 : "폭염 경보" / 33도 이상 "폭염 주의보")
		// 9,10,11 : 가을
		
		// 1~12 사이가 아닌 다른 수를 입력 했을 때 : " 해당하는 계절이 없다" 출력
		
		System.out.print("달 입력 : ");
		int month = sc.nextInt();
		
		String season; // 아래 조건문 실행 결과를 저장할 변수 선언.
		
		if(month == 1 || month == 2 || month == 12) {
			season = "겨울";
			
			System.out.print("온도 입력 : ");
			int temp = sc.nextInt();
			
			if(temp <= -15) {
				season += " 한파 경보 ";
			}
			else if (temp <= -12) {
				season += " 한파 주의보 ";
			}
			
		}
		else if (month >= 3 && month <= 5) {
			season = "봄";
		}
		else if (month >= 6 && month <= 8) {
			season = "여름";
			
			System.out.print("온도 입력 : ");
			int temp = sc.nextInt();
			
			if(temp >= 35) {
				season += " 폭염 경보 ";
			}
			else if (temp >= 33) {
				season += " 폭염 주의보 ";
			}
			
		}
		else if (month >= 9 && month <= 11) {
			season = "가을";
		}
		else {
			season = "해당하는 계절이 없다";
		}
		System.out.println(season);
	}


	public void ex5() {
	// 나이를 입력 받아
	// 13세 이하면 "어린이 입니다."
	// 13세 초과 19세 이하면 : "청소년 입니다."
	// 19세 초과 시 : "성인 입니다". 출력
		System.out.print("나이를 입력 : ");
		int age = sc.nextInt();
		
		if (age <= 13) {
			System.out.println("어린이 입니다.");
		}
		else if (age > 13 && age <= 19) {
			System.out.println("청소년 입니다.");
		}
		else if (age > 19) {
			System.out.println("성인 입니다.");
		}
		
	}

	
	public void ex6() {
		
	// 점수(100점 만점)를 입력 받아
	// 90점 이상 : A
	// 80점 이상 90점 미만 : B
	// 70점 이상 80점 미만 : C
	// 60점 이상 70점 미만 : D
	// 60점 미만 : F
	// 0점 미만, 100 초과 : "잘못 입력하셨습니다"
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		String hakzum;
		
		if (score < 0 || score > 100) {
			hakzum = "잘못 입력했음.";
			System.out.println(hakzum);
		}
		else if (score >= 90) {
			hakzum = "A";
			System.out.println(hakzum);
		}
		else if (score >= 80 && score < 90) {
			hakzum = "B";
			System.out.println(hakzum);
		}
		else if (score >= 70 && score < 80) {
			hakzum = "C";
			System.out.println(hakzum);
		}
		else if (score >= 60 && score < 70) {
			hakzum = "D";
			System.out.println(hakzum);
		}
		else if (score < 60) {
			hakzum = "F";
			System.out.println(hakzum);
		}
		
	}


	public void ex7() {
	// 놀이기구 탑승 제한 검사
	// 나이가 12세 이상, 키 140.0cm 이상 일 경우에만 "탑승 가능"
	// 나이가 12미만인 경우 : "적정 연령이 아닙니다."
	// 키가 140.0cm 미만 : "적정 키가 아닙니다."
	// 나이를 0세 미만, 100세 초과 시 : "잘못 입력 하셨습니다."
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		System.out.print("키를 입력 : ");
		double height = sc.nextDouble();
		
		if 	(age < 0 || age > 100) {
			System.out.println("다시 확인해 봐라.");
		}
		else if (age >= 12 && height >= 140.0) {
			System.out.println("넌 탈 수 있다.");
		}
		else if (age < 12) {
			System.out.println("넌 더 나이 먹고 와라.");
		}
		else if (height < 140.0) {
			System.out.println("넌 키 좀 더 크고 와라.");
		}
	}


	public void ex8() {
	// 놀이기구 탑승 제한 검사 프로그램
	// 조건 - 나이 : 12세 이상
	// - 키 : 140.0cm 이상
	// 나이를 0~100세 사이로 입력하지 않은 경우 : "나이를 잘못 입력 하셨습니다."
	// 키를 0~250.0cm 사이로 입력하지 않은 경우 : "키를 잘못 입력 하셨습니다."
	// -> 입력이 되자 마자 검사를 진행하여 잘못된 경우 프로그램 종료
	// 나이 O , 키 X : "나이는 적절하나, 키가 적절치 않음";
	// 나이 X , 키 O : "키는 적절하나, 나이는 적절치 않음";
	// 나이 X , 키 X : "나이와 키 모두 적절치 않음";
	// 나이 O , 키 O : "탑승 가능"
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		if(age < 0 || age > 100) {
			System.out.println("나이를 잘못 입력했습니다.");
			return;
		}
		
		System.out.print("키를 입력 : ");
		double height = sc.nextDouble();
		
		if(height < 0 || height > 250.0) {
			System.out.println("키를 잘못 입력했습니다.");
			return;
		}
		
		if (age >= 12 && height >= 140.0) {
			System.out.println("탑승 가능한 개체.");
		}
		else if (age >= 12 && height < 140.0) { // 나이O , 키X
			System.out.println("나이는 적절하나, 키가 안 됨.");
		}
		else if (age < 12 && height >= 140.0) { // 나이X, 키O
			System.out.println("키는 적절하나, 나이가 안 됨.");
		}
		else if (age < 12 && height < 140.0){ // 나이X, 키X
			System.out.println("나이와 키 모두 적절치 않음.");
		}
	}

}
