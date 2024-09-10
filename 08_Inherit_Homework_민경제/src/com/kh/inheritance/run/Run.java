package com.kh.inheritance.run;

import com.kh.inheritance.model.dto.BasicPhone;
import com.kh.inheritance.model.dto.SmartPhone;

public class Run {

	public static void main(String[] args) {

		// SmartPhone 객체 생성
		SmartPhone smart = new SmartPhone();
		smart.setBrand("Samsung");
		smart.setModel("Galaxy S20");
		smart.setYear(2020);
		smart.setPrice(1200000);
		smart.setOperatingSystem("Android");
		smart.setStorageCapacity(128);
		
		smart.printInfo();
		
		// BasicPhone 객체 생성
		BasicPhone basic = new BasicPhone();
		basic.checkKeyboard();
		
//		basic.printInfo();
		// 실행 결과 화면
		// Brand : Samsung
		// Model : Galaxy S20
		// Year : 2020
		// Price : 1200000원
		// Operating System : Android
		// Storage Capacity : 128GB
		// =================================
		// Brand : Nokia
		// Model : 3310
		// Year : 2000
		// Price : 100000원
		// 이 휴대폰은 물리적 키보드가 있습니다.
	}

}
