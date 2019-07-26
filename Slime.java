package com.project1;

import java.util.*;

public class Slime extends Monster implements Motion {
	public Slime() {
		setLevel(1);
		setHP(100);
		setAttack(10);
		setEvasion(100);
		setAlive(true);
		System.out.println("슬라임을 만났습니다.");
	}

	@Override
	public void attack(Object o, int attack) {
		if(o.getClass().getName().equals("com.project1.Warrior")) {
			Warrior w = (Warrior)o;
			int cur = w.getHP();
			w.setHP(cur - attack);
			System.out.println(cur + "이 "+w.getHP()+"이 되었습니다.");
		}
	}

	@Override
	public void attackJudgement(Object o, int evasion) {
		Random rand = new Random();
		Warrior w = (Warrior)o;
		int num = rand.nextInt(100);
		if(num >= (100 - evasion)) {
			System.out.println("회피에 성공해서 Hp는 "+w.getHP()+"입니다.");
		}
		else {
			System.out.println("회피실패");
			this.attack(o, evasion);
		}
	}

	@Override
	public void userItem(Object o1, Object o2, List<String> item) {
		
	}

	@Override
	public void getItem(Object o, List<String> item) {
		
	}

	@Override
	public void dead(Object o) {
		System.out.println("슬라임이 죽었습니다.");
	}

}
