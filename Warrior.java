package com.project1;

import java.util.*;

public class Warrior extends Character {
	Random rand = new Random();
	public Warrior() {
		setLevel(1);
		setHP(100);
		setMP(10);
		setAttack(10);
		setEvasion(10);
		setCritical(10);	
		setIsAlive(true);
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

	}

	@Override
	public void attackJudgement(Object o, int evasion) {
		Random rand = new Random();
		Monster m = null;
		int num = rand.nextInt(100);
		if(o.getClass().getName().equals("com.project1.Slime")) {
			m = (Slime)o;
			if(num >= (100 - evasion)) {
				System.out.println("Warrior succeeded in evasion and became "+m.getHP()+"HP.");
				return;
			}
		}
		attack(m, m.getAttack());

	}

	@Override
	public void attack(Object o, int attack) {
		Monster m = (Slime)o;
		int cur = m.getHP();
		m.setHP(cur - attack);
		System.out.println("Slime was attacked and became "+m.getHP()+"HP.");
		if(m.getHP() == 0) {
			dead(m);
		}
	}

	@Override
	public void getItemByMonster(Object o1, List<String> item) {
		Monster m = null;
		if(o1.getClass().getName().equals("com.project1.Slime")) {
			m = (Slime)o1;
			System.out.println("Get item from slime");
		}
		int num = rand.nextInt(10);
		if(num < 3) {
			System.out.println("Get \'Hp up\'");
			item.add("Hp up");
		}
		else if(num < 6) {
			System.out.println("Get \'Mp up\'");
			item.add("Hp up");
		}
		else {
			System.out.println("Get \'Iced\'");
			item.add("Iced");
		}
			
	}

	@Override
	public void dead(Object o) {
		Monster c = null;
		if(o.getClass().getName().equals("com.project1.Slime")) {
			c = (Slime)o;
			System.out.println("Slime is dead.");
		}
		c.setIsAlive(false);
	}		
}


