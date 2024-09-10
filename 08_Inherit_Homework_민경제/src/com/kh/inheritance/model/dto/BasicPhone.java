package com.kh.inheritance.model.dto;

public class BasicPhone extends Phone{

	private boolean hasPhysicalKeyboard; // 물리적키보드유무	
	
	public BasicPhone() {}
	
	public BasicPhone(String brand, String model, int year, int price, boolean hasPhysicalKeyboard) {
		super(brand, model, year, price);
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}

	public void checkKeyboard() {
		System.out.println("=================================");

		Phone p = new Phone();

		p.setBrand("Nokia");
		p.setModel("3310");
		p.setYear(2000);
		p.setPrice(100000);
		p.printInfo();
		System.out.println("이 휴대폰은 물리적 키보드가 있습니다.");
		
	}

	public boolean isHasPhysicalKeyboard() {
		return hasPhysicalKeyboard;
	}

	public void setHasPhysicalKeyboard(boolean hasPhysicalKeyboard) {
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}
	
	
	
}
