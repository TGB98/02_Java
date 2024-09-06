package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Hero;

public class HeroService {
	
	public void practice() {
		
		Hero hero1 = new Hero("이구역짱", "전사", 200, 20, 1, 0);
		Hero hero2 = new Hero("Zi존위자드", "마법사", 100, 100, 1, 0);
		
		System.out.printf("==========%s 시점==========\n", hero1.getNickname());
		
		hero1.attack(100);
		hero1.attack(50.5);
		hero1.attack(49.5);
		
		hero1.dash();
		hero1.dash();
		hero1.dash();
		
		System.out.printf(hero1.toString(),
				hero1.getNickname(),
				hero1.getLevel(),
				hero1.getHp(),
				hero1.getMp(),
				hero1.getExp() );
		
		System.out.printf("==========%s 시점==========\n", hero2.getNickname());
		
		hero2.attack(300);
		hero2.dash();
		
		hero2.attack(300);
		hero2.attack(300);
		
		System.out.printf(hero2.toString(),
				hero2.getNickname(),
				hero2.getLevel(),
				hero2.getHp(),
				hero2.getMp(),
				hero2.getExp() );
	}
	
	
}
