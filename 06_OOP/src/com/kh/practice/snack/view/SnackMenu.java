package com.kh.practice.snack.view;

// view : 사용자에게 보여줄 응답화면 관련된 코드가 모인 패키지.

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	
	private Scanner sc = new Scanner(System.in);
	
	private SnackController scr = new SnackController();
	
	public void menu() {
		// 사용자가 Snack 객체에 데이터를 저장할 수 있도록 값을 받고 저장한 값을 출력하는 메서드.
		
		System.out.println("스낵류를 입력하세요.");
		
		System.out.print("종류 : ");
		String kind = sc.next();
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("맛 : ");
		String flavor = sc.next();
		
		System.out.print("개수 : ");
		int numOf = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		System.out.print( scr.saveData(kind, name, flavor, numOf, price) );
		
		String result = sc.next(); // y or n
		
		if(result.equals("y")) {
			// 저장된 데이터 출력
			System.out.println( scr.confirmData() );
		}
		
	}
	
}
