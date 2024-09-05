package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Hero;

public class HeroService {

	Hero hero1 = new Hero("'이구역짱'", "전사", 200, 20, 1, 0);
	Hero hero2 = new Hero("'Zi존위자드'", "마법사", 100, 100, 1, 0);
	
	public void practice() {
		
		System.out.println(hero1.toString());
		System.out.println(hero2.toString());
		
		hero1.attack(100);
		hero1.setExp(50);
		hero1.setMp(20);
		hero1.dash();
		
	}
	
	
}
