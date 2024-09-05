package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Book;

public class BookService {

	public void practice() {
		
		Book book1 = new Book(); // 기본 생성자

		Book book2 = new Book("자바의 정석", 30000, 0.2, "남궁성"); // 매개변수 생성자
		
		System.out.println(book1.toString()); // 기본 생성자 출력
		System.out.println(book2.toString()); // 매개변수 생성자 출력
		
		System.out.println("=======================================");
		
		System.out.println("수정된 결과 확인");
		
		book1.setTitle("C언어");
		book1.setPrice(30000);
		book1.setDiscountRate(0.1);
		book1.setAuthor("홍길동");
		System.out.println(book1.toString());
		
		System.out.println("=======================================");
		
		System.out.printf("도서명 = %s", book1.getTitle());
		System.out.println("\n할인된 가격 = " + (int)(book1.getPrice()-book1.getPrice()*book1.getDiscountRate())+"원");
		
		System.out.printf("도서명 = %s", book2.getTitle());
		System.out.println("\n할인된 가격 = " + (int)(book2.getPrice()-book2.getPrice()*book2.getDiscountRate())+"원");
	}
	
	
}
