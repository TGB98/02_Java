package edu.kh.poly.ex2.model.dto;

public class Person extends Animal{
	// Animal의 추상 메서드를 오버라이딩 하지 않으면 에러 발생 -> 오버라이딩 강제화
	
	private String name;
	
	public Person() {}
	
	public Person(String type, String eatType, String name) {
		super(type, eatType);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void eat() {
		System.out.println("도구를 이용해서 먹음.");
	}

	@Override
	public void breath() {
		System.out.println("코와 입으로 숨을 쉰다.");
	}

	@Override
	public void move() {
		System.out.println("두 발로 걷는다.");
	}

	@Override
	public String toString() {
		return "Person : " + super.toString() + " / " + name;
	}
	
}
