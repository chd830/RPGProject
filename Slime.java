package com.project1;

import java.util.*;

public class Slime extends Monster {
	Random rand = new Random();
	static int count = 0;

	public Slime() {
		setLevel(1);
		setHP(100);
		setMaxHP(this.getHP());
		setAttack(10);
		setEvasion(10);
		setIsAlive(true);
		System.out.println("You met slime");
	}
	@Override
	public void attack(Object o1, Object o2) {
		Character c = null;
		String str = "";
		int attack = ((Slime)o1).getAttack();
		if(o2.getClass().getName().equals("com.project1.Warrior")) {
			str = "Warrior";
			c = (Warrior)o2;
		} else if(o2.getClass().getName().equals("com.project1.Magician")) {
			str = "Magician";
			c = (Magician)o2;
		} else {
			str = "Archer";
			c = (Archer)o2;
		}
		int cur = c.getHP();
		c.setHP(cur - attack);
		System.out.println(str+" was attacked and became "+c.getHP()+"HP.");

		if(c.getHP() == 0) {
			isAlive(c);
		}
	}

	@Override
	public void attackJudgement(Object o1, Object o2) {
		Monster m = (Slime)o1;
		if(m.getStatus().equals("Iced") && count < 1) {
			count++;
			return;
		}
		else if(m.getStatus().equals("Fired")&& count < 1) {
			count++;
			System.out.println("Slime is in Fired status");
			attack(o2, m);
			return;
		}

		m.setStatus("");
		count = 0;
		
		Random rand = new Random();
		Character c = null;
		int num = rand.nextInt(100);
		if(o2.getClass().getName().equals("com.project1.Warrior")) {
			c = (Warrior)o2;
			if(num >= (100 - m.getAttack())) {
				System.out.println("Warrior succeeded in evasion and became "+c.getHP()+"HP.");
				return;
			}
		} else if(o2.getClass().getName().equals("com.project1.Magician")) {
			c = (Magician)o2;
			num+=100;
			if(num >= (100 - m.getEvasion())) {
				System.out.println("Magician succeeded in evasion and became "+c.getHP()+"HP.");
			}
		} else {
			c = (Archer)o2;
			num+=100;
			if(num >= (100 - m.getEvasion())) {
				System.out.println("Archer succeeded in evasion and became "+c.getHP()+"HP.");
			}
		}
		attack(o2, m);
	}

	@Override
	public void isAlive(Object o) {
		Character c = null;
		if(o.getClass().getName().equals("com.project1.Warrior")) {
			c = (Warrior)o;
			System.out.println("Warrior is dead.");
		}
		else if(o.getClass().getName().equals("com.project1.Magician")) {
			c = (Magician)o;
			System.out.println("Magician is dead.");
		}
		else {
			c = (Archer)o;
			System.out.println("Archer is dead.");
		}
		c.setIsAlive(false);
	}

}
