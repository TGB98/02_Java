package com.kh.practice.snack.controller;

// controller : 사용자의 요청을 받아 처리하고, 그 입력에 따라
// Model(데이터처리, 비즈니스 로직)과 View(응답화면 출력)를 연결해주는 역할.

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	
	private Snack s = new Snack();

	public SnackController() {} // 기본생성자
	
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		// 데이터를 setter를 이용해 저장하고 저장완료 되었다는 결과를 반환하는 메서드.
				s.setKind(kind);
				s.setName(name);
				s.setFlavor(flavor);
				s.setNumOf(numOf);
				s.setPrice(price);
		return "저장 완료되었습니다." + "\n저장한 정보를 확인하시겠습니까?(y/n) : ";
		
		
	}
	
	public String confirmData() {
		// 저장된 데이터를 반환하는 메서드.
		
		return s.information();
		
		
	}
	
	
	
	
}
