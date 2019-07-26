package com.project1;

import java.util.*;

public class Slime extends Monster {
	public Slime() {
		setLevel(1);
		setHP(100);
		setAttack(10);
		setEvasion(10);
		setAlive(true);
		System.out.println("슬라임을 만났습니다.");
	}

	@Override
	public void attacked(Object o1,int attack) {
		Character c = null;
		if(o1.getClass().getName().equals("com.project1.Warrior")) {
			c = (Warrior)o1;
			int cur = c.getHP();
			c.setHP(cur - attack);
			System.out.println("전사가 공격을 받아 Hp가"+cur + "이 "+c.getHP()+"이 되었습니다.");
		}
		if(c.getHP() == 0)
			dead(c);
	}

	@Override
	public void attackJudgement(Object o1, int evasion) {
		Random rand = new Random();
		Warrior w = (Warrior)o1;
		int num = rand.nextInt(100);
		if(num >= (100 - evasion)) {
			System.out.println("회피에 성공해서 Hp는 "+w.getHP()+"입니다.");
		}
		else {
			this.attacked(o1, evasion);
		}
	}

	@Override
	public void useItem(Object o1, Object o2, List<String> item) {
		
	}

	@Override
	public void getItem(Object o, List<String> item) {
		
	}

	@Override
	public void dead(Object o) {
		Character c = null;
		if(o.getClass().getName().equals("com.project1.Warrior")) {
			c = (Warrior)o;
			c.setAlive(false);
			System.out.println("전사가 죽었습니다.");
		}
		
	}

}
