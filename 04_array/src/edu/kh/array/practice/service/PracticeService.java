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
		
//		int arr[] = new int[5];
//		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.printf("입력 %d : ", i);
//			arr[i] = sc.nextInt();
//		}
//		
//		System.out.print("검색할 값 : ");
//		int search = sc.nextInt();
//		
//		boolean flag = true;
//		
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] == search) {
//				System.out.println("인덱스 : " + i);
//				flag = false; // 찾았다면 flag를 false로 변경
//				break;
//			}
//		}
//		
//		if(flag) {
//			System.out.println("일치하는 값이 존재하지 않음.");
//		}
		
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

			if(i <= 7) { // 7번 인덱스 이하 ( 생년월일, -, 성별 )
				arr[i] = numbers.charAt(i);
			}
			else { // 8번 인덱스 이상부터는 *
				arr[i] = '*';
			}
			
			System.out.print(arr[i]);
		}
		
	}


	public void practice8() {
//	3이상인 홀수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
//	중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
//	단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
//	다시 정수를 받도록 하세요.	
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			// 3 이상의 수가 입력 될 떄 까지 무한 반복.
			// -> 3 이상 홀수가 입력되면 원하는 코드 수행 후 break문으로 종료 예정.
			
			System.out.print("정수 : ");
			int input = sc.nextInt();
			
			if( input < 3 || input % 2 == 0) { // 3미만 또는 짝수인 경우 -> 반복.
				System.out.println("다시 입력하세요");
			}
			else {
				// 입력받은 정수 만큼의 크기를 가지는 배열 생성.
				int arr[] = new int[input];
				
				int num = 0; // arr 배열에 대입될 값
				
				for(int i = 0; i < arr.length; i++) {
					
					// 요소에 값 대입하기
					if(i <= arr.length / 2) { // 중간 이전까지 -> 증가
						arr[i] = ++num;
					}
					else { // 중간 이후 -> 감소			
						arr[i] = --num;
					}
					
					// 각 요소에 대입된 값 출력하기
					// 출력 시 , 추가 (단, 마지막 제외)
					if(i == arr.length - 1) { // 마지막 바퀴.
						System.out.print(arr[i]);
					}
					else {
						System.out.print(arr[i] + ", ");
					}
					
				}
				
				break; // while의 반복 멈춤
				
			}
			
		}
		
			
			
			
	}

	
	public void practice9() {
//	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
//	1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.	
		
		int arr[] = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = (int)(Math.random() * 10 + 1); // 1 <= x < 11
			
		}
		
		System.out.print("발생한 난수 : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}


	public void practice10() {
//	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
//	1~10 사이의 난수를 발생시켜 배열에 초기화 후
//	배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.	
		
		int arr[] = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			System.out.print(arr[i] + " ");
		}
		System.out.println(); // 줄 바꿈
		
		int max = 1; // 최대값을 담아줄 변수
		int min = 10; // 최소값을 담아줄 변수
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) { // 해당 인덱스 값이 max보다 큰 경우, 해당 값을 max 변수에 담아줌.
				max = arr[i];
			}
			
			if(arr[i] < min) { // 해당 인덱스 값이 min보다 작은 경우, 해당 값을 min 변수에 담아줌.
				min = arr[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}


	public void practice11() {
//	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//	1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.	
		
		int arr[] = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = (int)(Math.random() * 10 + 1);
			
			for(int j = 0; j < i; j++) { // 중복 제거용 for문
				if(arr[i] == arr[j]) { // 앞쪽 요소에 대입된 값을 현재 요소에 대입된 값과 비교.
					i--;
					break;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}


	public void practice12() {
		
	}

	
	public void practice13() {
//	문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
//	문자의 개수와 함께 출력하세요.	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char arr[] = new char[str.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		// char 배열에서 중복값 존재할 경우 출력 x
		// 문자 개수 카운트
		
		int count = 0;
		System.out.print("문자열에 있는 문자 : ");
		
		for(int i = 0; i < arr.length; i++) {
			
			boolean flag = true; // 중복 체크용 flag
			
			// for문
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					flag = false; // 중복 발생 했을 때
					break;
				}
			}
			
			
			if(flag) { // 중복 발생하지 않았을 경우.
				// if문
				if(i == 0) {
					System.out.print(arr[i]);
				}
				else {
					System.out.print(", " + arr[i]);
				}
				
				// 중복 아닐 때만 count 갯수 늘리기.
				count++;
			}
		}
		
		System.out.println();
		System.out.println("문자 개수 : " + count);
		
	}


	public void practice14() {
//	사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
//	배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
//	단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
//	늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
//	사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		sc.nextLine(); // 입력 버퍼에 남은 개행문자 제거.
		
		String arr[] = new String[size];
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print((i+1) + "번째 문자열 : ");
			arr[i] = sc.nextLine();
			
		}
		
		// 반복이 시작되는 구간부터 무한반복하는 while 작성하여 내부에 종료조건 만들어서 break 해줌.
		while(true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.next().charAt(0);
			
			// y를 입력해 값을 더 입력하겠다 한 경우
			if(ch == 'y' || ch == 'Y') {
				// 더 입력받을 개수 입력 받기
				System.out.print("더 입력 하고 싶은 개수 : ");
				int addSize = sc.nextInt();
				sc.nextLine(); // 입력버퍼에 남은 개행문자 제거
				
				// 새로 값을 입력받을 배열 생성 -> 기존 배열 크기 + 추가 입력 개수
				String newArr[] = new String[arr.length + addSize];
				
				// 배열 복사 + 새로운 문자열 입력받기
				for(int i = 0; i < newArr.length; i++) {
					
					if(i < arr.length ) { // 인덱스의 크기가 기존배열보다 작을 경우
						newArr[i] = arr[i]; // 기존 배열 요소 값 복사
					}
					else { // 인덱스의 크기가 기존 배열보다 클 경우 새로운 입력 받기
						System.out.print( (i+1) + "번째 문자열 : ");
						newArr[i] = sc.nextLine();
					}
					
					
				}
				// 기존 배열 공간을 참조하던 변수 arr에 새로운 배열 공간의 주소 newArr 대입
				arr = newArr;
				
				
			}
			else if(ch == 'n' || ch == 'N') { // 값을 더 입력하지 않는 경우
				break; // while 반복문 종료
			}
			else { // 잘못 입력한 경우
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			
			
		}
		
		// 배열값 모두 출력
		System.out.println(Arrays.toString(arr));
		
	}
}

