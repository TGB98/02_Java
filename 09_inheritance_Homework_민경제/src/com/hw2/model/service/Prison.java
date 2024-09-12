package com.hw2.model.service;

import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem{

	private Prisoner[] prisoners; // 수감자 객체 배열
	
	private int prisonerCount; // 수감자 카운트
	
	public Prison(int size) {
		prisoners = new Prisoner[size];
		prisonerCount = 0;
	}
	

	@Override
	public void addPerson(Person person) {
		if(person instanceof Prisoner && prisonerCount < prisoners.length) {
			prisoners[prisonerCount++] = (Prisoner)person;
			System.out.println("죄수가 추가되었습니다 - " + person.getInfo());
		}
		else {
			System.out.println("인원이 모두 충원되어 더 이상 추가 못함.");
		}
	}

	@Override
	public void removePerson(String id) {
		for(int i = 0; i < prisonerCount; i++) {
			if(prisoners[i].getId().equals(id)) {
				System.out.println("죄수가 삭제되었습니다 - " + prisoners[i].getInfo());
				prisoners[i] = null;
				
				for(int j = i; j < prisonerCount -1; j++) {
					prisoners[j] = prisoners[j + 1];
				}
				
				prisoners[--prisonerCount] = null;
				return;
			}
		}
		System.out.println("ID : " + id + "인 죄수를 찾을 수 없습니다.");
	}

	@Override
	public void displayAllPersons() {
		System.out.println("전체 죄수 명단 : ");
		for(int i = 0; i < prisonerCount; i++) {
			System.out.println(prisoners[i].getInfo());
		}
	}

	public Prisoner[] getPrisoners() {
		return prisoners;
	}

	public void setPrisoners(Prisoner[] prisoners) {
		this.prisoners = prisoners;
	}

	public int getPrisonerCount() {
		return prisonerCount;
	}

	public void setPrisonerCount(int prisonerCount) {
		this.prisonerCount = prisonerCount;
	}
	
	
	
}
