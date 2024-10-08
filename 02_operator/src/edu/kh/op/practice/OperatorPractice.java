package edu.kh.op.practice;
import java.util.Scanner;
public class OperatorPractice {
	
	public void practice1() {
		// 모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
		// 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력.
		// 인원 수 : 29 / 사탕 개수 : 100
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int person = sc.nextInt();

		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();

		System.out.println("1인당 사탕 개수 : " + candy / person);
		System.out.println("남는 사탕 개수 : " + candy % person);
	}
	
	
	public void practice2() {
		//키보드로 입력 받은 값들을 변수에 기록하고
		// 저장된 변수 값을 화면에 출력하고 확인
		/* 이름 : 홍길동
		 * 학년(정수만) : 3
		 * 반(정수만) : 4
		 * 번호(정수만) : 15
		 * 성별(남학생/여학생) : 남학생
		 * 성적(소수점 아래 둘째 자리까지) : 85.75
		 * 
		 * 3학년 4반 15번 홍길동 남학생의 성적은 85.75이다.
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String input1 = sc.next();
		
		System.out.print("학년 : ");
		int num1 = sc.nextInt();
		
		System.out.print("반 : ");
		int num2 = sc.nextInt();
		
		System.out.print("번호 : ");
		int num3 = sc.nextInt();
		
		System.out.print("성별 : ");
		String input2 = sc.next();  // sc.nextLine()을 쓸거면 위에서 sc.nextLine()을 한 번 더 써서 개행(엔터를 쳤을때)을 비워준다.
		
		System.out.print("성적 : ");
		double num4 = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", num1, num2, num3, input1, input2, num4);
	}


	public void practice3() {
//		국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
//		세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
//
//		[실행화면]
//		국어 : 60
//		영어 : 80
//		수학 : 40
//		합계 : 180
//		평균 : 60.0
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int score1 = sc.nextInt();
		
		System.out.print("영어 : ");
		int score2 = sc.nextInt();

		System.out.print("수학 : ");
		int score3 = sc.nextInt();
		
		System.out.println("합계 : "+ (score1+score2+score3));
		System.out.println("평균 : "+ (score1+score2+score3) / 3.0);
		
	}


}
