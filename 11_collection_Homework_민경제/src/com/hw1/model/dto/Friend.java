package com.hw1.model.dto;

import java.util.Objects;

public class Friend {

	private String name;
	
	public Friend() {}

	public Friend(String name) {
		this.name = name;
	}
	
	public void pickLeader() {
		System.out.println(name + "가 떡잎방범대 대장이다!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Friend other = (Friend) obj;
		return Objects.equals(name, other.name);
	}
	
}
