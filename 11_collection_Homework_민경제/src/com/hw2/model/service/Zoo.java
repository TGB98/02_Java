package com.hw2.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Animal;
import com.hw2.model.dto.Monkey;
import com.hw2.model.dto.Tiger;

public class Zoo{

	private List<Animal> animals = new ArrayList<Animal>();
	
	public Zoo() {}
	
	public void addAnimal(Animal animal) {
		animals.add(new Tiger("호랑이"));
		animals.add(new Monkey("원숭이"));
	}
	
	public void showAnimals() {}
	
	public void displayMenu() {
		Scanner sc = new Scanner(System.in);
		int menuNum = 0;
		do {
			System.out.println("******KH 동물원******");
			System.out.print("원하는 작업을 선택하세요 : ");
			System.out.println();
			System.out.println("1. 동물들의 울음소리 듣기");
			System.out.println("2. 종료");
			System.out.print("선택 : ");
			try {
				menuNum = sc.nextInt();
				System.out.println();
				
				switch(menuNum) {
				case 1 : sound();
						animals.get(0).sound();
						animals.get(1).sound(); break;
				case 2 : System.out.println("프로그램을 종료합니다."); break;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("\nerror : 입력형식 유효하지 않음.");
				sc.nextLine();
				
				menuNum = -1;
			}
		} while(menuNum != 2);
	}

	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}

	public void sound() {
		System.out.println("동물들의 울음소리를 들어보세요:");
	}
	
}
