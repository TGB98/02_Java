package edu.kh.oop.practice.model.vo;

public class Book {

	private String title; // 도서명
	private int price; // 가격
	private double discountRate; // 할인율
	private String author; // 저자
	
	public Book() {} // 기본 생성자 ( ctrl + space 한 후 맨 위가 기본생성자 )

	// 매개변수 생성자
	// alt shift s -> constructor using fields
	public Book(String title, int price, double discountRate, String author) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}

	
	// 메서드
	// getter / setter
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	// @ <- 어노테이션 : 컴파일러용 주석
	// Overriding : 재정의(메서드)
	@Override
	public String toString() {
		return title + " / " + price + " / " + discountRate + " / " + author;
	}
	
	
	
	
}


// 현실 객체 : 독립적으로 존재하며 어떠한 특징과 기능을 하는 것.

// 객체 지향 언어 : 현실에서 발생하는 이벤트는 각각의 객체 간 상호작용으로 일어나는 것이다.
				// 이 객체간의 상호작용을 코드로 옮긴것이다. 

// 자바 객체 : 클래스에 정의된 내용대로 new 연산자를 통해 메모리 영역에 생성된 것.
// class : 객체를 만들기 위해 필요하며 객체의 속성과 기능을 정의함. 추상화, 캡슐화가 적용 되어야한다.
// new 연산자 : 새로운 객체를 메모리의 영역 중 Heap 영역에 만들어냄.
// 추상화 : 객체의 공통적인 속성(멤버변수)을 추려낸 것. 디테일한 것은 빼냄.
// 캡슐화 : 속성과 기능을 모아두고 속성의 직접적인 접근을 막고 잘못된 값이 입력됨을 방지.
// 캡슐화 원칙 : 멤버 변수에 대한 접근제한자는 private이다. 멤버 메서드는 그 클래스 내부에 작성하고,
//				 멤버 메서드는 다른 클래스(외부)에서도 접근 가능하도록 접근제한자를 public으로 작성한다.
// 메서드/기능의 '정의'란 : 그 메서드가 수행 할 일을 { } 안에 코드로 적는 일. 결과값을 도출하거나 값을 반환시키는 것.
// 메서드의 '호출' 이란 : 정의가 된 메서드를 불러와 코드를 읽고 컴퓨터가 그 코드의 실행을 하게 하는 것.
// return : 메서드를 종료시키고 반환할 값이 있다면 호출된 곳으로 값을 반환해 줌. 값이 없다면 메서드만 종료함.
//
// public String ex1() {
//    return "Hi";
// }
//
// 위 메서드 상세히 해석 : 외부(다른 클래스)로부터 접근이 가능한 자료형이 String인 메서드 ex1이 하는 기능은
// 						   "Hi"라는 문자열을 호출한 곳으로 반환시킴.































