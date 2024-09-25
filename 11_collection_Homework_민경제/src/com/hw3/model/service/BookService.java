package com.hw3.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.hw3.model.dto.Book;

public class BookService {
	
	private Scanner sc = new Scanner(System.in);

	private List<Book> Books = new ArrayList<Book>();
	
	// 즐겨찾기 도서 리스트
	private List<Book> favoriteBooks = new ArrayList<Book>();
	
	public BookService() {
		Books.add(new Book(1111,"세이노의 가르침", " 세이노", 6480, "데이원"));
		Books.add(new Book(2222,"문과남자의 과학공부", " 유시민", 15750, "돌베개"));
		Books.add(new Book(3333,"역행자", " 자청", 17550, "웅진지식하우스"));
		Books.add(new Book(4444,"꿀벌의 예언", " 베르나르 베르베르", 15120, "열린책들"));
		Books.add(new Book(5555,"도둑맞은 집중력", " 요한 하리", 16920, "어크로스"));
	}
	
	public void displayMenu() {
		try {
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
				
				menuNum = sc.nextInt();
				System.out.println();
					
				switch(menuNum) {
				case 1 : System.out.println( add() ); break;
				case 2 : selectAllShowInfo(Books); break;
				case 3 : update(); break;
				case 4 : delete(Books); break;
				case 5 : favoriteBookAdd(); break;
				case 6 : favoriteBookRemove(); break;
				case 7 : favoriteBookSearch(); break;
				case 8 : randomBook(); break;
				case 0 : System.out.println("프로그램 종료."); break;
				}
			} while(menuNum != 0);
		}
		catch (Exception e) {
			System.out.println("오류");
			e.printStackTrace();
		}

}
			
	
	/**
	 * 도서 등록 메서드
	 * @return
	 */
	public String add() {
		
		System.out.println("======도서 등록=======");
		
		System.out.print("도서 번호 : ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("도서 제목 : ");
		String title = sc.nextLine();
		
		System.out.print("도서 저자 : ");
		String author = sc.nextLine();
		
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("도서 출판사 : ");
		String publisher = sc.nextLine();
		
		if(Books.add(new Book(number, title, author, price, publisher))) {
			return "등록 완료.";
		}
		else {
			return "등록에 실패했습니다.";
		}
		
	}
	
	/**
	 * 도서 조회 메서드
	 * @param List<Book>
	 * 
	 */
	public void selectAllShowInfo(List<Book> list) {
		if(list.isEmpty()) {
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
				System.out.print("어떤 정보를 수정하시겠습니까? : ");
				num = sc.nextInt();
				sc.nextLine();
				
				switch(num) {
				case 1 : System.out.print("수정할 도서명 : ");
						 String title = sc.nextLine();
						 book.setTitle(title);
						 System.out.println("수정이 완료되었습니다."); break;
						 
				case 2 : System.out.print("수정할 도서 저자 : "); 
						 String author = sc.nextLine();	
						 book.setAuthor(author);
						 System.out.println("수정이 완료되었습니다."); break;
						 
				case 3 : System.out.print("수정할 도서 가격 : "); 
				 		 int price = sc.nextInt(); 
				 		 book.setPrice(price);
						 System.out.println("수정이 완료되었습니다."); break;
						 
				case 4 : System.out.print("수정할 도서 출판사 : "); 
						 String publisher = sc.nextLine(); 
						 book.setPublisher(publisher);
						 System.out.println("수정이 완료되었습니다."); break;
						 
				case 0 : System.out.println("도서 수정 종료."); break;
				default : System.out.println("메뉴에 있는 번호만 선택하세요."); break;
				}

			}
		} while(num != 0);
			}
		
		}
		
	}
	
	
	/**
	 * 도서 정보 삭제 메서드
	 */
	public void delete(List<Book> list) {
		System.out.println("=====도서 삭제=====");
		for(Book book : Books) {
			System.out.println(book);
		}
		System.out.print("삭제할 도서 번호 입력 : ");
		int delNum = sc.nextInt();

		for(Book book : Books) {
			if(book.getNumber() == delNum) {
				
				System.out.println("삭제하려는 도서 : " + book.getTitle());
				
				System.out.print("정말 삭제하시겠습니까?(y/n) : ");
				char ch = sc.next().toUpperCase().charAt(0);
				
				if(ch == 'Y') {
					Books.remove(book);
					break;
				}
				else {
					System.out.println("도서 정보 삭제를 취소");
				}
			}
		}
		System.out.println("삭제 끝");
		
//		for(Book temp : Books) {
//			if(temp.getNumber() == delNum) {
//				int index = Books.indexOf(temp);
//				// int List.indexOf(Object) : List에 일치하는 객체가 있으면 
//				// 그 객체가 있는 index 번호 반환.
//				
//				System.out.println("index 번호 : " + index);
//				
//				System.out.println("정말 삭제하시겠습니까?(Y/N) : ");
//				
//				char answer = sc.next().toUpperCase().charAt(0);
//				
//				if(answer == 'Y') {
//					Books.remove(index);
//					break;
//				}
//				else {
//					System.out.println("삭제를 진행하지 않습니다.");
//				}
//			}
//		}
		
	}

	
	/**
	 * 즐겨찾기 추가 메서드
	 */
	public void favoriteBookAdd() {
		
		System.out.println("====즐겨찾기 등록====");
		System.out.print("등록할 도서 번호 입력 : ");
		int bookNum = sc.nextInt();
		
		boolean flag = false;
		
		for(Book book : Books) {
			if((book.getNumber()) == bookNum) {
				System.out.println(book);
				
				favoriteBooks.add(book);
				flag = true;
				System.out.println("즐겨찾기 등록 됨.");
				break;
			}
		}
		
		if(!flag) {
			System.out.println("도서가 없습니다.");
		}
		
		
	}
	
	/**
	 * 즐겨찾기 삭제 메서드
	 */
	public void favoriteBookRemove() {
		
		System.out.println("====즐겨찾기 삭제====");
		System.out.print("삭제할 도서 번호 입력 : ");
		int bookNum = sc.nextInt();
		
		boolean flag = false;
		
		for(Book book : favoriteBooks) {
			if(book.getNumber() == bookNum) {
				System.out.println(book);
				
				favoriteBooks.remove(book);
				flag = true;
				System.out.println("즐겨찾기 도서 삭제 됨.");
				break;
			}
		}
		
		if(!flag) {
			System.out.println("해당하는 번호의 도서가 없음.");
		}
		
	}
	
	
	/**
	 * 즐겨찾기 목록 조회 메서드
	 */
	public void favoriteBookSearch() {
		
		System.out.println("====즐겨찾기 도서 조회====");
		
		if(favoriteBooks.isEmpty()) {
			System.out.println("즐겨찾기 등록된 도서가 없습니다. 등록을 먼저 해주세요.");
			return;
		}
		int index = 1;
		for(Book book : favoriteBooks) {
			System.out.print((index++) + ". ");
			System.out.println(book);
		}

	}
	
	
	/**
	 * 추천 도서 뽑기 메서드
	 */
	public void randomBook() {
		
		int max = Books.size();
		
		int random = (int)(Math.random() * max); // 0 ~ 리스트의 마지막 인덱스 번호
		
		System.out.println(Books.get(random));
		
	}
}


