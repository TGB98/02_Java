package com.hw5.model.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.hw5.model.dto.Chocolate;

public class Charlie_Factory {

	private Scanner sc = new Scanner(System.in);
	
	private Set<Chocolate> chocoSet = new HashSet<Chocolate>();
	
	private Map<Integer, String> matMap = new HashMap<Integer, String>();
	
	
	public Charlie_Factory() {
		
		// 기본 등록 재료
		matMap.put(1, "카카오");
		matMap.put(2, "우유");
		matMap.put(3, "설탕");
		
		// 현재 생산된 초콜릿 제품
		Chocolate darkChoco = new Chocolate("다크초콜릿", 1500, "20240918", addMat(1));
		Chocolate milkChoco = new Chocolate("밀크초콜릿", 2000, "20240917", addMat(1,2,3));
		
		// 컬렉션에 추가
		chocoSet.add(milkChoco);
		chocoSet.add(darkChoco);
	}
	
	/**
	 * 매개변수로 전달받은 값들을
	 * 재료를 저장해둔 matMap에 있는지 확인하고
	 * Set 형태로 반환하는 메서드.
	 * 
	 * 가변인자 작성법 : 자료형... 변수명
	 * -> 매개변수의 수가 정확히 몇 개 인지 특정할 수 없을 때 사용.
	 * @param materials
	 * @return
	 */
	public Set<String> addMat(Integer ... materials) {
		
		Set<String> saveMats = new HashSet<String>(); // 매개변수로 전달받은 재료를 저장하는 Set 객체
		
		for(Integer matKey : materials) {
			
			if(matMap.containsKey(matKey)) {
				
				saveMats.add(matMap.get(matKey));
				// matMap 에서 고유번호(key)에 대응하는 재료(value)를 얻어오고 saveMats에 저장.
			}
			
		}
		return saveMats;
	}
	
	public void factoryOpen() {
		
		int menuNum = 0;
		do {
			System.out.println("<찰리의 초콜릿 공장>");
			System.out.println("1. 새로운 초콜릿 만들기");
			System.out.println("2. 생산된 초콜릿 제품 조회");
			System.out.println("3. 초콜릿 제품 삭제");
			System.out.println("4. 초콜릿 제품 정보 수정");
			System.out.println("5. 초콜릿 제품 제조일 순으로 조회");
			System.out.println("6. 초콜릿 재료 추가");
			System.out.println("7. 초콜릿 재료 삭제");
			System.out.println("0. 초콜릿 공장 닫기");
			
			System.out.println("실행할 번호 입력 : ");
			
			try {
				menuNum = sc.nextInt();
				System.out.println();
				
				switch(menuNum) {
				case 1 : createNew(); break;
				case 2 : readProduct(); break;
				case 3 : deleteProduct(); break;
				case 4 : break;
				case 5 : break;
				case 6 : break;
				case 7 : break;
				case 0 : System.out.println("초콜릿 공장 가동 종료"); break;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("\nerror : 위의 리스트 숫자만 입력.");
				
				sc.nextLine();
				
				menuNum = -1;
				
			}
			catch(Exception e) {
				System.out.println("\nerror : 오류");
				e.printStackTrace();
			}
		}
		while(menuNum != 0);
		
	}
	
	/**
	 * 새로운 초콜릿제품 만들기
	 */
	public void createNew() {
		System.out.println("<새 초콜릿 만들기>");
		System.out.println("초콜릿 제품명 : ");
		String name = sc.nextLine();
		
		for(Chocolate existingChoco : chocoSet) { // 같은 제품명을 가진 객체가 있으면 추가 x
			if(existingChoco.getName().equals(name)) {
				System.out.println("이미 같은 제품명을 가진 제품이 존재합니다.");
				return;
			}
		}
		
		System.out.println("초콜릿 가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.println("초콜릿 제조일 : ");
		String date = sc.next();
		
		Set<String> mat = new HashSet<String>();
		
		System.out.println("현재 사용 가능한 재료 목록");
		for(Entry<Integer, String> entry : matMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		while(true) {
			System.out.println("추가 할 재료 번호 입력( 재료추가 종료는 'Q' 입력 ) : ");
			
			try {
				String input = sc.next();
				if(input.equalsIgnoreCase("q")) {
					break;
				}
				
				int matKey = Integer.parseInt(input); // String 형인 input을 int 형 정수 값으로 바꿈.
				String material = matMap.get(matKey);
				
				if(material != null) { // 재료명이 null 이 아니라면
					// 위의 mat Set 객체에 같은 재료명이 존재하는지 확인
					if(mat.contains(material)) {
						System.out.println("이미 같은 이름으로 추가된 재료");
					}
					else { // matSet에 중복된 재료가 없으면 새로 추가
						mat.add(material);
						System.out.println(material + "가 추가되었습니다.");
					}
					
				}
				else { // 재료명이 null == 없는 재료 고유번호를 입력했을 경우
					System.out.println("없는 재료 번호입니다. 다시 확인");
				}
				
			
			
			}
			catch(NumberFormatException e) { // 재료 번호 입력 시 숫자나 q가 아닌 경우 예외처리
				System.out.println("재료 번호 숫자를 입력하거나 q를 입력.");
			}
		}
		
		Chocolate newChoco = new Chocolate(name, price, date, mat);
		
		chocoSet.add(newChoco);
		System.out.println("새로운 초콜릿 제품이 추가되었습니다. : " + newChoco);
		
	}
	
	/**
	 * 생산된 초콜릿 제품 조회
	 */
	public void readProduct() {
		System.out.println("<초콜릿 제품 조회>");
		if(chocoSet.isEmpty()) {
			System.out.println("생산된 초콜릿 제품이 없습니다.");
			return;
		}
		
		int index = 1;
		for(Chocolate choco : chocoSet) {
			System.out.println((index++) + ". " + choco);
		}
	}
	
	/**
	 * 초콜릿 제품 삭제
	 */
	public void deleteProduct() {
		System.out.println("<초콜릿 제품 정보 삭제>");
		String delProductName = sc.next();
		
		boolean flag = false;
		
		for(Chocolate choco : chocoSet) {
			if(choco.getName().equals(delProductName)) {
				
				System.out.println(delProductName + "을 삭제합니다.");
				chocoSet.remove(choco);
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("해당하는 이름의 초콜릿 제품명이 없습니다.");
		}
	}
	
	/**
	 * 초콜릿 제품 정보 수정
	 */
	public void updateProduct() {
		
		System.out.println("<제품 정보 수정>");
		System.out.println("수정할 제품 이름 : ");
		String name = sc.nextLine();
		
		for(Chocolate choco : chocoSet) {
			if(!choco.getName().equals(name)) {
				System.out.println("입력한 제품명과 일치하는 제품이 없습니다.");
			}
			else {
				System.out.println("제품명 수정 : ");
				String productName = sc.nextLine();
				choco.setName(productName);
				
				System.out.println("제품 가격 수정 : ");
				int productPrice = sc.nextInt();
				sc.nextLine();
				choco.setPrice(productPrice);
				
				System.out.println("제품 제조일 수정 : ");
				String productDate = sc.nextLine();
				choco.setDate(productDate);
			}
		}
		
	}
	
}
