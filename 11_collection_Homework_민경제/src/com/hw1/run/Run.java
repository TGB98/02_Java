package com.hw1.run;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.hw1.model.dto.Friend;

public class Run {

	public static void main(String[] args) {
		
		Friend fr1 = new Friend();
		fr1.setName("짱구");
		Friend fr2 = new Friend();
		fr2.setName("철수");
		Friend fr3 = new Friend();
		fr3.setName("훈이");
		Friend fr4 = new Friend();
		fr4.setName("유리");
		Friend fr5 = new Friend();
		fr5.setName("맹구");
		
		List<Friend> list = new ArrayList<Friend>();

		list.add(fr1);
		list.add(fr2);
		list.add(fr3);
		list.add(fr4);
		list.add(fr5);
		
		Random random = new Random();
		int randomIndex = random.nextInt(list.size());
		list.get(randomIndex).pickLeader();

	}

}
