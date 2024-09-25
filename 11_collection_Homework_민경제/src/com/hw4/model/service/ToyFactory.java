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
		// 기본 등록된 재료
		materialMap.put(1, "면직물");
		materialMap.put(2, "플라스틱");
		materialMap.put(3, "유리");
		materialMap.put(4, "고무");
		
		// 현재 제작된 장난감
		Toy toy1 = new Toy("키시미시", 15000, "분홍색", 5, "19940505", addMaterials(1,2));
		Toy toy2 = new Toy("캣냅", 27000, "보라색", 8, "19960128", addMaterials(1,2));
		Toy toy3 = new Toy("파피", 57000, "빨간색", 12, "19931225", addMaterials(1,2,4));
		Toy toy4 = new Toy("허기워기", 12000, "파란색", 5, "19940312", addMaterials(1,2));
		Toy toy5 = new Toy("마미롱레그", 36000, "분홍색", 8, "19950805", addMaterials(1,4));
		
		// 제작된 장난감 toySet 컬렉션에 추가
		toySet.add(toy1);
		toySet.add(toy2);
		toySet.add(toy3);
		toySet.add(toy4);
		toySet.add(toy5);
	}
	
	// 1. 일반 배열 사용
	// toySet.add(new Toy("마미롱레그", 36000, "분홍색", 8, "19950805", addMaterials(new int[] {1,4})));
	
	// 2. List.of() 사용
	// toySet.add(new Toy("마미롱레그", 36000, "분홍색", 8, "19950805", addMaterials(List.of(1,4)));
	
	// 3. Arrays.asList() 사용
	// toySet.add(new Toy("마미롱레그", 36000, "분홍색", 8, "19950805", addMaterials(Arrays.asList(1,4)));
	
	
	// Set<String> addMaterials(List<Integer> materials) 2번과 3번
	
	
	/**
	 * 매개변수로 전달받은 값들을
	 * 재료 저장 Map에 있는지 확인하고
	 * Set형태로 반환하는 메서드
	 * 
	 * 가변인자 작성법 : 자료형...변수명
	 * -> 매개변수의 수가 정확히 몇 개 인지 특정할 수 없을 때 사용함.
	 * @param materials
	 * @return
	 */
	public Set<String> addMaterials(Integer/*int*/...materials) { // 가변인자 사용
		
		// 매개변수로 전달받은 재료를 저장해 반환할 Set 객체 생성
		Set<String> addedmaterials = new HashSet<String>(); // [면직물, 고무]
		
		for(Integer materialKey : materials) {
//			System.out.println(mater);
			// Map에서 재료 고유 번호(key)에 대응하는 재료명(value)를 가져와서 addedmaterials에 추가
//			String materialValue = materialMap.get(materialKey);
//			
//			// map에 없는 key를 입력하여 value를 얻어오면 == null
//			
//			if(materialValue != null) { // 재료 목록에 있을 때
//				addedmaterials.add(materialValue);
//				
//			}
			
			if(materialMap.containsKey(materialKey)) {
				
				addedmaterials.add(materialMap.get(materialKey)); // 면직물
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
			case 1 : showAllToys(); break;
			case 2 : addToy(); break;
			case 3 : removeToy(); break; 
			case 4 : sortByDate(); break;
			case 5 : searchByAge(); break;
			case 6 : putMaterial(); break;
			case 7 : removeMaterialByName(); break;
			case 0 : System.out.println("종료"); break;
			}
		}
		catch(InputMismatchException e) {
			System.out.println("\nerror : 입력형식이 유효하지 않음.");
			
			sc.nextLine();
			
			menuNum = -1;
		} catch (Exception e) {
			e.printStackTrace();
		}

		} while(menuNum != 0);

	}
	
	
	/**
	 * 장난감 조회 메서드
	 */
	public void showAllToys() {
		System.out.println("=======장난감 전체 조회=======");
		
		if(toySet.isEmpty()) {
			System.out.println("등록된 장난감이 없습니다.");
			return;
		}
		int index = 1;
		for(Toy toy : toySet) {
			System.out.print((index++) + ". ");
			System.out.println(toy);
		}
	}
	
	
	/**
	 * 장난감 만들기 메서드
	 * @return 
	 * @return
	 */
	public void addToy() throws Exception{
//		int addMaterial;
		
		System.out.println("<새로운 장난감 추가>");
		
		System.out.print("장난감 이름 : ");
		String name = sc.next();
		
		for(Toy existingToy : toySet) {
			if(existingToy.getName().equals(name)) {
				System.out.println("이미 같은 이름을 가진 장난감이 존재합니다.");
				return;
			}
		}
		
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
		
		Set<String> mat = new HashSet<String>();
		
		System.out.println("사용 가능한 재료 목록 : ");
		
//		System.out.println(materialMap.entrySet());
		// [1=면직물, 2=플라스틱, 3=유리, 4=고무]
		// Set <Entry<K, V> > Map.entrySet() : key=value 한 쌍으로 이뤄진 Entry 객체를
		// Set 객체로 반환.
		
		// Entry.getKey() : Entry 객체의 key 반환.
		// Entry.getValue() : Entry 객체의 value 반환.
		
		for(Entry<Integer, String> entry : materialMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
			// 1 : 면직물
			// 2 : 플라스틱
			// 3 : 유리
			// 4 : 고무
		}
		
		while(true) {
			System.out.println("추가할 재료의 번호를 입력 ( 종료하려면 'q'를 입력 ) : ");
			
			try {
				String input = sc.next();
				if(input.equals("q")) { // 종료
					break;
				}
				
				int materialKey = Integer.parseInt(input); // String 형인 input을 int형 정수 값으로 바꿈 "1" -> 1 ( Integer Wrapper 클래스 이용 )
				String material = materialMap.get(materialKey); // 입력받은 재료 고유번호(key)로 map에 저장된 재료명(value)를 얻어옴.
				
				if(material != null) { // 재료명이 null이 아니라면
					
					// mat Set 객체에 해당 재료명이 존재하는지
					if(mat.contains(material)) {
						System.out.println("이미 추가된 재료입니다. 다른 재료를 선택하세요.");
					}
					else { // Set에 중복된 재료가 없으면 새로 추가
						mat.add(material);
						System.out.println("재료가 추가되었습니다 : " + material);
					}
					
					
				}
				else { // 재료명이 null == 없는 재료고유번호를 입력
					System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				}
				
				
			} catch(NumberFormatException e) { // 재료 번호 입력 시 숫자나 q 가 아닌 경우 예외처리 바로 함
				System.out.println("숫자를 입력하거나 q를 입력하세요");
			}
		}
		
		Toy newToy = new Toy(name, price, color, age, manufactureDate, mat); // 추가할 재료 저장된 새로운 Set 객체
		
		toySet.add(newToy);
		System.out.println("새로운 장난감이 추가되었습니다.");
//		do {
//			System.out.print("재료를 입력하세요(종료하려면 'q'를 입력) : ");
//			addMaterial = sc.nextInt();
//			if( materialMap.containsKey(addMaterial)) {
//				mat.add(materialMap.get(addMaterial));
//			}
//			
//		} while(addMaterial != 'q');
//	
//		if(toySet.add(new Toy(name,price,color,age,manufactureDate,mat))) {
//			System.out.println("새로운 장난감이 추가되었습니다.");
//		}

	}
	

	/**
	 * 장난감 제거 메서드
	 */

	public void removeToy() throws Exception {
		System.out.print("삭제할 장난감 이름 입력 : ");
		String removeToyName = sc.next();
		
		boolean flag = false;
		
		for(Toy toy : toySet) {
			if((toy.getName()).equals(removeToyName)) {
				
				System.out.println(toy);
				//Set.remove(Object o);
				toySet.remove(toy);
				flag = true;
				System.out.println("장난감이 삭제되었습니다.");
				break; // break가 없으면 java.util.ConcurrentModificationException
				// 1. 효율 향상
				// 2. 순회중인 컬렉션 객체가 수정되어 충돌한다는 예외 발생
				// -> 예외 방지 및 효율을 위해 작성
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
		
		System.out.println("<제조일 순 장난감 정렬>");
		
		Comparator<Toy> dateComparator = Comparator.comparing(Toy::getManufactureDate);
		
		List<Toy> toyList = new ArrayList<Toy>(toySet);

		Collections.sort(toyList, dateComparator);
		
		int index = 1;
		for(Toy toy : toyList) {
			System.out.println((index++) + "." + toy);
		}
	}
	
	
	/**
	 * 연령별 사용 가능한 장난감 리스트 조회
	 */
	public void searchByAge() {
		
		System.out.println("<연령별 사용 가능한 장난감>");
		
		Map<Integer, List<Toy>> toysByAge = new HashMap<Integer, List<Toy>>();
		// toysByAge 라는 이름의 새로운 Map을 생성.
		// -> 연령을 key로 지정하고, 해당 연령을 가진 장난감 List를 value로 가짐
		// { K : V, K : V, K : V, ... }
		// -> { 5 : ["키시미시", "허기워기"], 8 : ["캣냅", "마미롱레그"], 12 : ["파피"] }
		
		for(Toy toy : toySet) {
			
			int age = toy.getAge(); // 현재 toy 객체가 가진 나이 얻어오기
			
			toysByAge.putIfAbsent(age, new ArrayList<Toy>());
			// putIfAbsent() : Map에서 제공하는 메서드로,
			// 해당 키가 존재하지 않는 경우에만 전달받은 값을 추가함.
			// -> Map에 해당 연령의 리스트가 없는 경우에만 새로운 리스트를 생성해 추가.
			
			toysByAge.get(age).add(toy);
			// toysByAge.get(age) -> age(K)에 맞는 Value 반환 -> List
			// List.add(toy) -> 전달된 toy 객체를 List에 추가.
			
		}
		
		for( Entry<Integer, List<Toy>> entry : toysByAge.entrySet() ) {
			
			int age = entry.getKey(); // 해당 entry의 key(나이)를 얻어와 저장.
			List<Toy> toyList = entry.getValue();  // 해당 entry의 value를 얻어옴
			
			System.out.println("[연령 : " + age + "세]");
			
			int index = 1;
			for(Toy toy : toyList) { // 해당 연령에 대응되는 List를 순회하며 출력
				System.out.println(index + ". " + toy);
				index++;
			}
		}

//		System.out.println("[연령 5세] : ");
//		int index = 1;
//		for(Toy toy : toySet) {
//			if(toy.getAge() == 5) {
//				System.out.println(toy);
//
//			}
//		}
//		
//		System.out.println("[연령 8세] : ");
//		
//		for(Toy toy : toySet) {
//			if(toy.getAge() == 8) {
//				
//				System.out.println(toy);
//
//			}
//		}
//		
//		System.out.println("[연령 12세] : ");
//		
//		for(Toy toy : toySet) {
//			if(toy.getAge() == 12) {
//				System.out.println(toy);
//
//			}
//		}
	}


	/**
	 * 재료 추가 메서드
	 */
	public void putMaterial() throws Exception {
		
		System.out.println("<재료 추가>");
		System.out.println("=== 현재 등록된 재료===");
		
		for(Entry<Integer, String>entry : materialMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
			// getKey() : entry 객체에서 key만 얻어오기
			// getValue() : entry 객체에서 value만 얻어오기
		}
		
		System.out.println("---------------------------------------------");
		
		System.out.print("재료 고유번호(Key) 입력 : ");
		int key = sc.nextInt();
		
		System.out.print("재료명 입력 : ");
		String material = sc.next();
		
		if(materialMap.containsKey(key)) { // materialMap에 이미 존재하는 Key 인지 확인
			
			System.out.println("이미 해당 키에 재료가 등록되어 있습니다.");
			System.out.print("덮어쓰시겠습니까? (y/n) : ");
			String input = sc.next();
			
			if(input.equalsIgnoreCase("Y")) {
				// equalsIgnoreCase : 대문자인지 소문자인지 구분하지 않고, 문자열 값 자체만 비교
				materialMap.put(key, material); // 같은 key로 추가 시, value 덮어쓰기
			}
			else {
				System.out.println("재료 추가가 취소되었습니다.");
			}
		}
		else {
			materialMap.put(key, material);
			System.out.println("새로운 재료가 등록되었습니다.");
		}

	}

	/**
	 * 재료명으로 재료 삭제 메서드
	 */
	public void removeMaterialByName() throws Exception {
		
		System.out.println("<재료 삭제>");
		System.out.println("=====현재 등록된 재료=====");
		
		for(Entry<Integer, String>entry : materialMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
			// getKey() : entry 객체에서 key만 얻어오기
			// getValue() : entry 객체에서 value만 얻어오기
		}
		
		System.out.println("----------------------------------------------");
		
		System.out.print("삭제 할 재료명 입력 : ");
		String materialName = sc.next();
		
		boolean flag = false;
		
		for(Entry<Integer, String> entry : materialMap.entrySet()) {
			
			if(entry.getValue().equals(materialName)) {
				materialMap.remove(entry.getKey());
				
				System.out.println("재료 '"+ materialName + "'가 성공적으로 제거 되었습니다.");
				flag = true;
				break;
			}
			
		}
		
		if(!flag) {
			System.out.println("해당 이름의 재료가 존재하지 않습니다.");
		}
		
	}
	

	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
