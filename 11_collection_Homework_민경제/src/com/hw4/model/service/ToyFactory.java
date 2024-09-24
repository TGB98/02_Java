package com.hw4.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.hw4.model.dto.Toy;

public class ToyFactory {

//	1. 장난감의 정보를 효과적으로 관리하고 출력할 수 있는 클래스를 구현.
	
//	2. 사용자로부터 입력을 받고, 입력에 따라 적절한 동작을 수행하는 메서드를
//	   작성
	
//	3. 컬렉션을 활용하여 장난감 정보를 저장하고 관리
	
//	4. 장난감의 제조일에 따라 정렬하고, 연령별로 사용 가능한 장난감을 출력하는
//	   기능을 구현
	
	private Scanner sc = new Scanner(System.in);
	
	private Set<Toy> toySet = new HashSet<Toy>(); // 중복된 Toy 객체가 없도록 저장할 컬렉션 Set
	
	private Map<Integer, String> materialMap = new HashMap<Integer, String>(); // 재료가 저장되어있는 map
	
	public ToyFactory() {
		materialMap.put(1, "면직물");
		materialMap.put(2, "플라스틱");
		materialMap.put(3, "유리");
		materialMap.put(4, "고무");
		
		Toy toy1 = new Toy("키시미시", 15000, "분홍색", 5, "19940505", addMaterials(1,2));
		Toy toy2 = new Toy("캣냅", 27000, "보라색", 8, "19960128", addMaterials(1,2));
		Toy toy3 = new Toy("파피", 57000, "빨간색", 12, "19931225", addMaterials(1,2,4));
		Toy toy4 = new Toy("허기워기", 12000, "파란색", 5, "19940312", addMaterials(1,2));
		Toy toy5 = new Toy("마미롱레그", 36000, "분홍색", 8, "19950805", addMaterials(1,4));
		
		toySet.add(toy1);
		toySet.add(toy2);
		toySet.add(toy3);
		toySet.add(toy4);
		toySet.add(toy5);
	}
	
	public Set<String> addMaterials(int...materials) {
		
		Set<String> addedmaterials = new HashSet<String>(); // [면직물, 고무]
		
		for(int mater : materials) {
//			System.out.println(mater);
			
			if(materialMap.containsKey(mater)) {
				
				addedmaterials.add(materialMap.get(mater)); // 면직물
			}
			
		}
		//System.out.println(addedmaterials);
		return addedmaterials;
	}
	
	public void displayMenu() {
		
		int menuNum = 0;
		do {
			System.out.println("<<플레이타임 공장>>");
			System.out.println("1. 전체 장난감 조회하기");
			System.out.println("2. 새로운 장난감 만들기");
			System.out.println("3. 장난감 삭제하기");
			System.out.println("4. 장난감 제조일 순으로 조회하기");
			System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
			System.out.println("6. 재료 추가");
			System.out.println("7. 재료 제거");
			
			System.out.print("선택 : ");
		
		try {
			menuNum = sc.nextInt();
			System.out.println();
			
			switch(menuNum) {
			case 1 : allShowToys(); break;
			case 2 : addToy(); break;
			case 3 : removeToy(); break; 
			case 4 : sortByDate(); break;
			case 5 : searchByAge(); break;
			case 6 : putMaterial(); break;
			case 7 : break;
			case 0 : System.out.println("종료"); break;
			}
		}
		catch(InputMismatchException e) {
			System.out.println("\nerror : 입력형식이 유효하지 않음.");
			
			sc.nextLine();
			
			menuNum = -1;
		}

		} while(menuNum != 0);

	}
	
	
	/**
	 * 장난감 조회 메서드
	 */
	public void allShowToys() {
		System.out.println("=======장난감 전체 조회=======");
		
		if(toySet.isEmpty()) {
			System.out.println("등록된 장난감이 없습니다.");
			return;
		}
		int index = 1;
		for(Toy toy : toySet) {
			System.out.print((index++) + "번 : ");
			System.out.println(toy);
		}
	}
	
	
	/**
	 * 장난감 만들기 메서드
	 * @return 
	 * @return
	 */
	public void addToy() {
		int addMaterial;
		
		System.out.println("<새로운 장난감 추가>");
		
		System.out.print("장난감 이름 : ");
		String name = sc.next();
		
		System.out.print("사용 가능 연령 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("색상 : ");
		String color = sc.next();

		System.out.print("제조일(YYYYMMDD 형식 입력 : ");
		String manufactureDate = sc.next();
		
		System.out.println("사용 가능한 재료 목록 : ");
		System.out.println(materialMap);
		
		Set<String> mat = new HashSet<String>();
		do {
			System.out.print("재료를 입력하세요(종료하려면 'q'를 입력) : ");
			addMaterial = sc.nextInt();
			if( materialMap.containsKey(addMaterial)) {
				mat.add(materialMap.get(addMaterial));
			}
			
		} while(addMaterial != 'q');
	
		if(toySet.add(new Toy(name,price,color,age,manufactureDate,mat))) {
			System.out.println("새로운 장난감이 추가되었습니다.");
		}

	}
	

	/**
	 * 장난감 제거 메서드
	 */

	public void removeToy() {
		System.out.print("삭제할 장난감 이름 입력 : ");
		String removeToyName = sc.next();
		
		boolean flag = false;
		
		for(Toy toy : toySet) {
			if((toy.getName()).equals(removeToyName)) {
				
				System.out.println(toy);
				//toySet.remove(toy);
				toySet.remove(toy);
				flag = true;
				System.out.println("장난감이 삭제되었습니다.");
				break; // break가 없으면 java.util.ConcurrentModificationException
			}
//			else {
//				System.out.println("장난감이 없습니다.");
//			}
			
		}
		
		if(!flag) {
			System.out.println("장난감이 없습니다.");
		}
	}

	
	
	/**
	 * 장난감 제조일 순 정렬
	 */
	public void sortByDate() {
		
		Comparator<Toy> dateComparator = Comparator.comparing(Toy::getManufactureDate);
		
		List<Toy> toyList = new ArrayList<Toy>(toySet);

		Collections.sort(toyList, dateComparator);
		
		for(Toy toy : toyList) {
			System.out.println(toy);
		}
	}
	
	
	/**
	 * 연령별 사용 가능한 장난감 리스트 조회
	 */
	public void searchByAge() {
		
		System.out.println("<연령별 사용 가능한 장난감>");

		System.out.println("[연령 5세] : ");
		for(Toy toy : toySet) {
			if(toy.getAge() == 5) {
				System.out.println(toy);
			}
		}
		System.out.println("[연령 8세] : ");
		for(Toy toy : toySet) {
			if(toy.getAge() == 8) {
				System.out.println(toy);
			}
		}
		System.out.println("[연령 12세] : ");
		for(Toy toy : toySet) {
			if(toy.getAge() == 12) {
				System.out.println(toy);
			}
		}
	}


	/**
	 * 재료 추가 메서드
	 */
	public void putMaterial() {
		
		System.out.println("<재료 추가>");
		System.out.println("=== 현재 등록된 재료===");
		
		for(Entry<Integer, String>entry : materialMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
			// getKey() : entry 객체에서 key만 얻어오기
			// getValue() : entry 객체에서 value만 얻어오기
			
			
		}
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
