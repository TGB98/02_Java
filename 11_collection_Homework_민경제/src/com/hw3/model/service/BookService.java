package com.hw3.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.hw3.model.dto.Book;
import com.hw3.model.dto.Book1111;
import com.hw3.model.dto.Book2222;
import com.hw3.model.dto.Book3333;
import com.hw3.model.dto.Book4444;
import com.hw3.model.dto.Book5555;

public class BookService {
	
	private Scanner sc = new Scanner(System.in);

	private List<Book> Books = new ArrayList<Book>();
	
	public BookService() {
		Books.add(new Book1111(1111,"세이노의 가르침", " 세이노", 6480, "데이원"));
		Books.add(new Book2222(2222,"문과남자의 과학공부", " 유시민", 15750, "돌베개"));
		Books.add(new Book3333(3333,"역행자", " 자청", 17550, "웅진지식하우스"));
		Books.add(new Book4444(4444,"꿀벌의 예언", " 베르나르 베르베르", 15120, "열린책들"));
		Books.add(new Book5555(5555,"도둑맞은 집중력", " 요한 하리", 16920, "어크로스"));
	}
	
	public void displayMenu() {
		Scanner sc = new Scanner(System.in);
		int menuNum = 0;
		do {
			System.out.println("===도서 목록 프로그램===");
			System.out.println();
			System.out.println("1. 도서 등록");
			System.out.println();
			System.out.println("2. 도서 조회");
			System.out.println();
			System.out.println("3. 도서 수정");
			System.out.println();
			System.out.println("4. 도서 삭제");
			System.out.println();
			System.out.println("5. 즐겨찾기 추가");
			System.out.println();
			System.out.println("6. 즐겨찾기 삭제");
			System.out.println();
			System.out.println("7. 즐겨찾기 조회");
			System.out.println();
			System.out.println("8. 추천도서 뽑기");
			System.out.println();
			System.out.println("0. 프로그램 종료");
			System.out.println();
			System.out.print("메뉴을 입력하세요 : ");
			try {
				menuNum = sc.nextInt();
				System.out.println();
				
				switch(menuNum) {
				case 1 : System.out.println( add() ); break;
				case 2 : selectAllShowInfo(); break;
				case 3 : update(); break;
				case 4 : break;
				case 5 : break;
				case 6 : break;
				case 7 : break;
				case 8 : break;
				case 0 : break;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("\nerror : 입력형식 유효하지 않음.");
				sc.nextLine();
				
				menuNum = -1;
			}
		} while(menuNum != 0);
	}
			
	
	/**
	 * 도서 등록 메서드
	 * @return
	 */
	public String add() {
		
		System.out.println("======도서 등록=======");
		
		System.out.print("도서 번호 : ");
		int number = sc.nextInt();
		
		System.out.print("도서 제목 : ");
		String title = sc.next();
		sc.nextLine();
		
		System.out.print("도서 저자 : ");
		String author = sc.nextLine();
		
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		
		System.out.print("도서 출판사 : ");
		String publisher = sc.next();
		
		if(Books.add(new Book(number, title, author, price, publisher))) {
			return "등록 완료.";
		}
		else {
			return "등록에 실패했습니다.";
		}
		
	}
	
	/**
	 * 도서 조회 메서드
	 */
	public void selectAllShowInfo() {
		if(Books.isEmpty()) {
			System.out.println("등록된 도서가 없습니다.");
			return;
		}
		for(Book book : Books) {
			System.out.println( book );
			System.out.println();
		}
	}

	
	/**
	 * 도서 정보 수정 메서드
	 * @param title 
	 * @param author 
	 * @param price 
	 * @param publisher 
	 * @return
	 */
	public void update() {
		
		int num = 0;
		System.out.println("======도서 수정=======");
		System.out.print("수정할 도서 번호 입력 : ");
		int number = sc.nextInt();
		for(Book book : Books) {
			if(book.getNumber() == number) {
				do {
			if(Books.isEmpty()) {
				System.out.println("입력된 도서 정보가 없습니다.");
			}
			else if(number < 0) {
				System.out.println("검색하려는 도서 번호를 다시 확인해주세요.");
			}
			else {
				System.out.print("1. 도서명");
				System.out.println();
				System.out.print("2. 도서 저자");
				System.out.println();
				System.out.print("3. 도서 가격");
				System.out.println();
				System.out.print("4. 도서 출판사");
				System.out.println();
				System.out.print("0. 수정 종료");
				
				System.out.println();
				System.out.println("어떤 정보를 수정하시겠습니까? : ");
				num = sc.nextInt();
				
				switch(num) {
				case 1 : System.out.print("수정할 도서명 : ");
						 String title = sc.next();
						 book.setTitle(title);
						 System.out.println();
						 System.out.println("수정이 완료되었습니다.");break;
				case 2 : System.out.print("수정할 도서 저자 : "); 
						 String author = sc.nextLine();	
						 book.setAuthor(author);
						 System.out.println();
						 System.out.println("수정이 완료되었습니다.");break;
				case 3 : System.out.print("수정할 도서 가격 : "); 
				 		 int price = sc.nextInt(); 
				 		 book.setPrice(price);
				 		 System.out.println();
						 System.out.println("수정이 완료되었습니다.");break;
				case 4 : System.out.print("수정할 도서 출판사 : "); 
						 String publisher = sc.next(); 
						 book.setPublisher(publisher);
						 System.out.println();
						 System.out.println("수정이 완료되었습니다.");break;
				case 0 : System.out.println("도서 수정 종료.");break;
				}

			}
		} while(num != 0);
			}
		
		}
		
	}
}


