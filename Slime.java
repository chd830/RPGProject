package com.project1;

import java.util.*;

public class Slime extends Monster implements Motion {
	public Slime() {
		setLevel(1);
		setHP(100);
		setAttack(10);
		setEvasion(100);
		setAlive(true);
		System.out.println("�������� �������ϴ�.");
	}

	@Override
	public void attack(Object o, int attack) {
		if(o.getClass().getName().equals("com.project1.Warrior")) {
			Warrior w = (Warrior)o;
			int cur = w.getHP();
			w.setHP(cur - attack);
			System.out.println(cur + "�� "+w.getHP()+"�� �Ǿ����ϴ�.");
		}
	}

	@Override
	public void attackJudgement(Object o, int evasion) {
		Random rand = new Random();
		Warrior w = (Warrior)o;
		int num = rand.nextInt(100);
		if(num >= (100 - evasion)) {
			System.out.println("ȸ�ǿ� �����ؼ� Hp�� "+w.getHP()+"�Դϴ�.");
		}
		else {
			System.out.println("ȸ�ǽ���");
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
		System.out.println("�������� �׾����ϴ�.");
	}

}
