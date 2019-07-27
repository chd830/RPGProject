package com.project1;

import java.util.List;

public class Warrior extends Character {
	public Warrior() {

		setLevel(1);
		setHP(100);
		setMP(10);
		setAttack(10);
		setEvasion(10);
		setCritical(10);	
		System.out.println("Warrior is selected");

	}

	@Override
	public void print(Object o) {
		Warrior w = (Warrior)o;
		System.out.println();
		System.out.println("Warrior's Level is: "+w.getLevel());		
		System.out.println("HP: " +w.getHP()+ ", MP: " +w.getMP());
		System.out.println("Attack: " +w.getAttack());
		System.out.println("Evasion: " +w.getEvasion());
		System.out.println("Critical: " +w.getCritical());
	}


	@Override
	public void useItem(Object o1, Object o2, List<String> item) {
		// TODO Auto-generated method stub

	}

	@Override
	public void attackJudgement(Object o, int evasion) {
		// TODO Auto-generated method stub

	}

	@Override
	public void attack(Object o, int attack) {
		if(o.getClass().getName().equals("com.project1.Slime")) {
			Slime m = (Slime)o;
			int cur = m.getHP();
			m.setHP(cur - attack);
			System.out.println("�������� Hp�� "+cur + "���� "+m.getHP()+"�� �Ǿ����ϴ�.");
		}
	}

	@Override
	public void getItem(Object o1, Object o2, List<String> item) {
		
	}

	@Override
	public void dead(Object o) {
		Monster c = null;
		if(o.getClass().getName().equals("com.project1.Slime")) {
		c = (Slime)o;
		}
		System.out.println("Slime is dead.");
		c.setIsAlive(false);
	}		
}


