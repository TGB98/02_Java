package com.hw2.model.dto;

public abstract class Person {

	protected String id;
	protected String name;
	
	public Person(String id, String name) {}
	
	public abstract String getInfo();
	
	
}
