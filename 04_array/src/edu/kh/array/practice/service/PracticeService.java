package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	
	public void practice1() {
	//길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
	//순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
	//짝수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)	
		
	//	[실행 화면]
	//	1 2 3 4 5 6 7 8 9
	//	짝수 번째 인덱스 합 : 25
		
		int arr[] = new int[9];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			
			if(i % 2 == 0) {
				sum += arr[i];
			}
		}
		
		System.out.print(Arrays.toString(arr));
		System.out.println("\n짝수 번째 인덱스 합 : " + sum);
	}

	
	public void practice2() {
		
//	길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
//	순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
//	홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
//
//	[실행 화면]
//	9 8 7 6 5 4 3 2 1
//	홀수 번째 인덱스 합 : 20
		
		int arr[] = new int[9];
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = 9-i;
			
			if(i % 2 == 0) {
				
			}
			else {
				sum += arr[i];
			}
		}
		
		System.out.print(Arrays.toString(arr));
		System.out.println("\n홀수 번째 인덱스 합 :" + sum);
	}


	public void practice3() {
		
//	사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
//	1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력할 양의 정수 : ");
		int number = sc.nextInt();
		
		int arr[] = new int[number];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		System.out.print(Arrays.toString(arr));
	}


	public void practice4() {
		
//	정수 5개를 입력 받아 배열을 초기화 하고
//	검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
//	배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 0 : ");
		int num0 = sc.nextInt();
		System.out.print("입력 1 : ");
		int num1 = sc.nextInt();
		System.out.print("입력 2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력 3 : ");
		int num3 = sc.nextInt();
		System.out.print("입력 4 : ");
		int num4 = sc.nextInt();
		
		int arr[] = {num0, num1, num2, num3, num4};
		
		System.out.print("검색할 값 : ");
		int input = sc.nextInt();
		
		boolean flag = false;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == input) {
				System.out.println("인덱스 : " + i);
				flag = true;
			}
		}
		
		if(!flag) {
			System.out.println("일치하는 값 존재하지 않음");
		}
}


	public void practice5() {
//	문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//	개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : " );
		String input = sc.next();
		
		char arr[] = new char[input.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
		}
		
		System.out.print("검색할 문자 : ");
		char ch = sc.next().charAt(0);
		
		int count = 0;
		
		String result = "";
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ch) {
				result += i + " ";
				count++;
			}
		}
		
		System.out.printf("\n%s에 %s가 존재하는 위치(인덱스) : %s", input, ch, result);
		if(count > 0) {
			System.out.printf("\n%s 개수 : %d", ch, count);
		}
		
	}

	
	public void practice6() {
//	사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
//	배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
//	그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.	
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 길이 입력 : ");
		int length = sc.nextInt();
		
		int sum = 0;
		
		int arr[] = new int[length];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("배열"+ " " + i + "번째 인덱스에 넣을 값 : ");
			int number = sc.nextInt();
			
			arr[i] = number;
			
			sum += arr[i];
			
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("총 합 : " + sum);
		
	}


	public void practice7() {
		
//	주민등록번호 번호를 입력 받아
//	성별을 나타내는 숫자 이후부터 *로 가리고 출력하세요.
//  앞자리 6, 뒷자리 7 123456-1****** 8~13까지 *
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호 : ");
		String numbers = sc.nextLine();
		
		char arr[] = new char[numbers.length()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = numbers.charAt(i);

			
			if(i >= 8 && i <= 13) {
				System.out.print("*");
			
			}
			
		}
		System.out.print(arr);
		
		
		
	}


	public void practice8() {
//	3이상인 홀수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
//	중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
//	단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
//	다시 정수를 받도록 하세요.	
		
		Scanner sc = new Scanner(System.in);
		System.out.print("3이상 홀수 입력 : ");
		int num = sc.nextInt();
		
		if( num % 2 == 0 || num < 3) {
			System.out.print("다시 입력하세요");
		}
		else {
			int arr[] = new int[num];
			
			for(int i = 0; i < num-2; i++) {
				arr[i] = i+1;
				
				
			}
			for(int i = 3; i >= num; i--) {
				arr[i] = i-1;
				System.out.print(arr[i]);
			}
			
			
			
		}
		
	}

}