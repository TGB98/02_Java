package com.hw2.model.service;

import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem{

	private Prisoner[] prisoners = new Prisoner[size];
	
	private int prisonerCount;
	
	public Prison(int size) {}
	

	@Override
	public void addPerson(Person person) {
		
	}

	@Override
	public void removePerson(String id) {
		
	}

	@Override
	public void displayAllPersons() {
		
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
