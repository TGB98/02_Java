package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);

	public void practice1() {
//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
//단, 입력한 수는 1보다 크거나 같아야 합니다.
//만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		System.out.print("입력할 수 : ");
		int number = sc.nextInt();
		
		if (number < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		else {
			for(int i = 1; i <= number; i++) {
				System.out.print(i);
			}
		}
	}

	public void practice2() {
//	사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
//	단, 입력한 수는 1보다 크거나 같아야 합니다.
		
		System.out.print("입력할 수 : ");
		int number = sc.nextInt();
		
		if (number < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		else {
			for(int i = number; i > 0; i--) {
				System.out.print(i);
			}
		}
	}

	public void practice3() {
//		1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.
		System.out.print("입력받을 수 : ");
		int number = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= number; i++) {
			
		sum += i;
		}
		System.out.print(sum);
	}

	public void practice4() {
//	사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
//	만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		
		System.out.print("입력할 수1 : ");
		int num1 = sc.nextInt();
		if (num1 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			return;
		}
		
		System.out.print("입력할 수2 : ");
		int num2 = sc.nextInt();
		if (num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			return;
		}
		for (int i = num1; i <= num2; i++) {
			System.out.print(i);
		}
	}

	public void practice5() {
//	사용자로부터 입력 받은 숫자의 단을 출력하세요.
		
		System.out.print("구구단 할 단 : ");
		int num = sc.nextInt();
		
		for(int i = num; i <= num; i++)
		{	
			for(int a = 1; a <= 9; a++) {
				System.out.println(i*a);
			}
		}
	}

	public void practice6() {
//	사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
//	단, 2~9를 사이가 아닌 수를 입력하면 “2~9 사이 숫자만 입력해주세요”를 출력하세요.
		
		System.out.print("단 수 : ");
		int num = sc.nextInt();
		
		if(num < 2 || num > 9) {
			System.out.println("2~9 사이 숫자만 입력하세요.");
		}
		else {
			for(int i = num; i <= 9; i++) {
				for(int a = 1; a <= 9; a++) {
					System.out.println(i*a);
				}
			}
		}
	}

	public void practice7() {
//	다음과 같은 실행 예제를 구현하세요.
//
//	ex.
//	정수 입력 : 4
//	*
//	**
//	***
//	****
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			String zero = "";
			String star = "*";
			for(int a = 1; a <= i; a++) {
				zero += star;
			}
			System.out.println(zero);
		}
	}

	public void practice8() {
//	다음과 같은 실행 예제를 구현하세요.
//
//	ex.
//	정수 입력 : 4
//	****
//	***
//	**
//	*
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for(int y = 1; y <= num; y++) {
			String zero = "";
			String star = "*";
			for(int x = y; x <= num; x++) {
				zero += star;
			}
			System.out.println(zero);
		}
	}
	
	public void practice9() {

		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int y = 1; y <= num; y++) {
			String zero = "";
			String star = "*";
			for(int x = 1; x <= y; x++) {
				zero += star;
			}
			System.out.printf("%4s\n",zero);
		}
	}
	
	public void practice10() {
//	ex.
//	정수 입력 : 3
//	*
//	**
//	***
//	**
//	*
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int y = 1; y <= num; y++) {
			String zero = "";
			String star = "*";
			for(int x = 1; x <= y; x++) {
					zero += star;
			}
			System.out.printf("%s\n",zero);
		}
		for(int y= 1; y < num; y++) {
			String zero = "";
			String star = "*";
			for(int x = y; x < num; x++) {
				zero += star;
			}
			System.out.printf("%s\n", zero);
		}
		
		
	}
	
	public void practice11() {
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
//		for(int y = 1; y <= num; y++) {
//			String zero = "";
//			String star = "*";
//
//			for(int x = 1; x <= 2*y-1; x++) {
//				
//				zero += star;
//			}
//			System.out.println(zero);
//		}

		/*
		 * 왼쪽에서부터 공백 포함.
		 *    *   input(4) + row(1) - 1 == 4 -> 한 행에 열(col)
		 *   ***  input(4) + row(2) - 1 == 5
		 *  ***** input(4) + row(3) - 1 == 6
		 * *******input(4) + row(4) - 1 == 7
		 * 
		 * " " 규칙 : input - row 값이 col 이상일 때
		 * "*" 규칙 : col이 더 클 때
		 * (1행 : 공백규칙 -> input(4) - row(1) == 3 >= col(1,2,3,4)
		 * 			col이 4일 때 false이므로 *이 찍힘
		 * 
		 * 1부터 시작해서 input 까지 1씩 증가
		 * for(int row =1; row <= input; row++) {
		 * 
		 * 	for(int col = 1; col <= input + row -1; col++) {
		 * 
		 * 		if(input-row >= col) { 
		 * 			System.out.print(" ");
		 *  }
		 *  else { System.out.print("*"); }
		 * }
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		  for(int row =1; row <= input; row++) {
		  
		  	for(int col = 1; col <= input + row -1; col++) {
		 
		  		if(input-row >= col) { 
		  			System.out.print(" ");
		   }
		  		
		   else { 
			   System.out.print("*"); 
		   }
		  		
		  		
		   }
		  	System.out.println();
		  }
	}
	
	
	public void practice12() {
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row = 1; row <= input; row++) {
			
			for(int col = 1; col <= input; col++) {
				// 첫 번째 / 마지막 행, 첫 번째 / 마지막 열 * 출력
				if(row == 1 || row == input || col == 1 || col == input) {
					System.out.print("*");
				}
				else { // 나머지는 공백 출력
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public void practice13() {
//	1부터 사용자에게 입력 받은 수까지 중에서
//	1) 2와 3의 배수를 모두 출력하고
//	2) 2와 3의 공배수의 개수를 출력하세요.
//
//	* ‘공배수’는 둘 이상의 수의 공통인 배수라는 뜻으로 어떤 수를 해당 수들로 나눴을 때
//	모두 나머지가 0이 나오는 수
//
//	ex.
//	자연수 하나를 입력하세요 : 15
//	2 3 4 6 8 9 10 12 14 15
//	count : 2
		
		System.out.print("자연수 입력 : ");
		int num = sc.nextInt();

		int count = 0; // 공배수의 개수를 출력
		
		for(int i = 1; i <= num; i++) {
			
			// 2의 배수 또는 3의 배수인 경우
			if(i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
				
				// 2와 3의 공배수 == 2로도 나누어 떨어지고 3으로도 나누어 떨어짐.
				if( i % 2 == 0 && i % 3 == 0 ) {
					// 개수 세기
					count++;
					
				}
				
			}
			
		}
		System.out.println("\ncount : " + count);
		
		
		
		
		
		
		
		
		
		
		
	}
}