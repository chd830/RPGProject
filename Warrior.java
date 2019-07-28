package com.project1;

import java.util.*;

public class Warrior extends Character {
	Random rand = new Random();
	Scanner sc = new Scanner(System.in);
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
		System.out.println("Critical: " +w.getCritical()+"\n");
	}

	@Override
	public void useItem(Object o1, Object o2, List<String> item) {
		Warrior w = (Warrior)o1;
		if(item.size() < 0) {
			System.out.println("Item is empty");
			return;
		}
		System.out.println("Select Item: ");
		for(int i = 0; i < item.size(); i++) {
			System.out.print((i+1)+"."+item.get(i)+"\t");
		}
		int num = sc.nextInt();
		System.out.println("\'"+item.get(num - 1)+"\' is selected");
		if(item.get(num - 1).equals("Hp up")) {
			int cur = w.getHP();
			w.setHP(cur + 10);
			System.out.println("Hp of the warrior is become "+cur + " to "+w.getHP());
		}
		else if(item.get(num - 1).equals("Mp up")) {
			int cur = w.getMP();
			w.setMP(cur + 10);
			System.out.println("Mp of the warrior is become "+cur + " to "+w.getMP());
		}
		else {
			if(o2.getClass().getName().equals("com.project1.Slime")) {
				Slime s = (Slime)o2;
				s.setStatus("Iced");
				System.out.println("Slime is Iced.");
			}
		}
		item.remove(num - 1);
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


