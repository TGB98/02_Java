package edu.kh.collection.pack1.model.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.pack1.model.dto.Student;

public class StudentService2 {

	private Scanner sc = new Scanner(System.in);
	
	private List<Student> studentList = new LinkedList<Student>();
	
	public StudentService2() {
		
		studentList.add(new Student("유재석", 33, "서울시 신사동", 'M', 90));
		studentList.add(new Student("박명수", 40, "서울시 신사동", 'M', 100));
		studentList.add(new Student("정준하", 39, "서울시 신사동", 'M', 95));
		studentList.add(new Student("정형돈", 31, "서울시 신사동", 'M', 98));
		studentList.add(new Student("노홍철", 32, "서울시 신사동", 'M', 89));
		studentList.add(new Student("길", 30, "서울시 신사동", 'M', 87));
		studentList.add(new Student("신형만", 31, "서울시 신사동", 'M', 88));
		studentList.add(new Student("신짱구", 5, "서울시 신사동", 'M', 60));
		
	}
	
	public void displayMenu() {
		
		int menuNum = 0;
		
		do {
			System.out.println("\n============학생관리 프로그램===========\n");
			System.out.println("1. 학생 정보 추가"); // c
			System.out.println("2. 학생 정보 전체 조회"); // r
			System.out.println("3. 학생 정보 수정"); // u
			System.out.println("4. 학생 정보 제거"); // d
			System.out.println("5. 이름으로 검색(일치)");
			System.out.println("6. 이름으로 검색(포함)");
			System.out.println("7. 나이순으로 정렬"); 
			System.out.println("8. 이름순으로 정렬"); 
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 번호 선택 : ");
			
			try {
				menuNum = sc.nextInt();
				System.out.println();
				
				switch(menuNum) {
				case 1 : System.out.println( add() ); break;
				case 2 : selectAllShowInfo(); break;
				case 3 : System.out.println( update() ); break;
				case 4 : System.out.println( remove() ); break;
				case 5 : searchName1(); break;
				case 6 : searchName2(); break;
				case 7 : sortByAge(); break;
				case 8 : sortByScore(); break;
				case 0 : System.out.println("프로그램 종료."); break;
				default : System.out.println("메뉴에 작성된 번호만 입력.");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("\nerror : 입력형식이 유효하지 않습니다. 다시 시도해주세요.");
				
				sc.nextLine();
				
				menuNum = -1;
			}
		}
		while(menuNum != 0);
	}
	
	/**
	 * List에 객체 추가하는 메서드
	 * @return
	 * @throws InputMismatchException
	 */
	public String add() throws InputMismatchException {
		System.out.println("==========학생 정보 추가==========");
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine(); // 입력 버퍼 개행문자 제거용
		
		System.out.print("사는 곳 : ");
		String region = sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		if(studentList.add(new Student(name, age, region, gender, score))) {
			return "추가 되었습니다.";
		}
		else {
			return "추가에 실패했습니다.";
		}
	}
	
	/**
	 * List 전체 출력(조회) 메서드
	 */
	public void selectAllShowInfo() {
		System.out.println("===========학생 전체 조회===========");
		
		if(studentList.isEmpty()) {
			System.out.println("등록된 정보가 없습니다.");
			return;
		}
		int index = 0;
		for(Student std : studentList) {
			System.out.print((index++) + "번 : ");
			System.out.println( std );
		}
	}
	
	
	/**
	 * List 객체 중 하나를 골라 정보를 수정하는 메서드
	 * @return
	 * @throws InputMismatchException
	 */
	public String update() throws InputMismatchException {
		
		System.out.println("============학생 정보 수정============");
		
		System.out.println("인덱스 번호 입력 : ");
		int index = sc.nextInt();
		
		if(studentList.isEmpty()) {
			return "입력된 학생 정보가 없습니다";
		}
		else if(index < 0) {
			return "음수로 된 인덱스 번호는 없습니다.";
		}
		else if(index >= studentList.size()) {
			return "학생 리스트의 최대길이를 넘을 수 없습니다.";
		}
		else {
			System.out.println(index + "번 째에 저장된 학생 정보");
			System.out.println(studentList.get(index));
			
			System.out.print("수정할 이름 : ");
			String name = sc.next();
			
			System.out.print("수정할 나이 : ");
			int age = sc.nextInt();
			sc.nextLine(); // 입력 버퍼 개행문자 제거용
			
			System.out.print("수정할 사는 곳 : ");
			String region = sc.nextLine();
			
			System.out.print("수정할 성별(M/F) : ");
			char gender = sc.next().charAt(0);
			
			System.out.print("수정할 점수 : ");
			int score = sc.nextInt();
			
			Student temp = studentList.set(index, new Student(name, age, region, gender, score));
			
			return temp.getName() + "의 정보가 변경되었습니다.";
		}
		
	}



	/**
	 * List 객체 중 하나를 골라 정보를 삭제하는 메서드
	 * @return
	 * @throws InputMismatchException
	 */
	public String remove() throws InputMismatchException {
		
		System.out.print("정보를 삭제 할 학생의 번호 : ");
		int index = sc.nextInt();
		
		if(studentList.isEmpty()) {
			return "입력된 학생 정보가 없습니다.";
		}
		else if(index < 0) {
			return "음수 번호는 없습니다.";
		}
		else if(index >= studentList.size()) {
			return "범위를 벗어난 값 입력할 수 없습니다.";
		}
		else {
			System.out.println(index + "번 째에 저장된 학생 정보입니다.");
			System.out.println(studentList.get(index));
			
			System.out.println(studentList.get(index) + "의 정보를 삭제하시겠습니까? (Y/N)");
			char ch = sc.next().toUpperCase().charAt(0);
			
			if(ch == 'Y') {
				Student temp = studentList.remove(index);
				return temp.getName() + "의 정보가 삭제 되었습니다.";
			}
			else {
				return "정보 삭제를 취소했습니다.";
			}
		}
	}

	
	/**
	 * 이름 검색하기 (이름이 일치해야함) 메서드
	 * @throws InputMismatchException
	 */
	public void searchName1() throws InputMismatchException {
		
		System.out.print("검색 할 이름 : ");
		String name = sc.next();
		
		boolean flag = true;
		
		for(Student std : studentList) {
			
			if(std.getName().equals(name)) {
				System.out.println(std);
				flag = false;
			}

		}
		if(flag) {
			System.out.println("검색하려는 이름을 정확히 기입해주세요.");
		}
	}


	/**
	 * 이름 검색하기 (이름 포함) 메서드
	 * @throws InputMismatchException
	 */
	public void searchName2() throws InputMismatchException {
		
		System.out.print("검색 할 이름 : ");
		String name = sc.next();
		
		boolean flag = true;
		
		for(Student std : studentList) {
			if(std.getName().contains(name)) {
				System.out.println(std);
				flag = false;
			}
		}
		if(flag) {
			System.out.println("검색하려는 이름을 다시 확인해주세요.");
		}
		
	}


	/**
	 * 나이 순 정렬 메서드
	 */
	public void sortByAge() {
		Collections.sort(studentList);
		
		for(Student std : studentList) {
			System.out.println(std);
		}
	}

	/**
	 * 이름에 따라 정렬하는 Comparator 객체 생성 메서드
	 */
	public void sortByName() {
		Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
		
		Collections.sort(studentList, nameComparator);
		
		for(Student std : studentList) {
			System.out.println(std);
		}
	}

	public void sortByScore() {
		Comparator<Student> scoreComparator = Comparator.comparing(Student::getScore).reversed();
		
		Collections.sort(studentList, scoreComparator);
		for(Student std : studentList) {
			System.out.println(std);

		}
	}








}
