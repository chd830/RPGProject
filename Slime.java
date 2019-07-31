package com.project1;

import java.util.*;

public class Slime extends Monster {
	Random rand = new Random();

	static int icedCount = 0;
	static int firedCount = 0;

	public Slime() {
		setHP(100);
		setMaxHP(this.getHP());
		setAttack(10);
		setEvasion(10);
		setIsAlive(true);
		setStatus("");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}

		System.out.println("You meet slime");
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
		if(firedCount != 0) {
			c.setHP(cur - 5);
		}
		c.setHP(cur - attack);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(str+" was attacked and became "+c.getHP()+"HP.");
		if(c.getHP() == 0) {
			isAlive(c);
		}
	}

	@Override
	public void attackJudgement(Object o1, Object o2) {
		Monster m = (Slime)o1;
		if(m.getStatus().equals("Iced") && icedCount < 2) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("Slime is in Iced status");
			icedCount++;
			return;
		}
		else if(m.getStatus().equals("Fired")&& firedCount < 2) {
			firedCount++;
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("Slime is in Fired status");
		}
		m.setStatus("");
		icedCount = 0;
		firedCount = 0;

		Random rand = new Random();
		Character c = null;
		String str = "";
		int num = rand.nextInt(100);
		if(o2.getClass().getName().equals("com.project1.Warrior")) {
			c = (Warrior)o2;
			str = "Warrior";
		} 
		else if(o2.getClass().getName().equals("com.project1.Magician")) {
			c = (Magician)o2;
			str = "Magician";
		} 
		else {
			c = (Archer)o2;
			str = "Magician";
		}
		if(num >= (100 - m.getAttack())) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(str + " succeeded in evasion and became "+c.getHP()+"HP.");
			return;
		}
		attack(m, c);
	}

	@Override
	public void isAlive(Object o) {
		Character c = null;
		String str = "";
		if(o.getClass().getName().equals("com.project1.Warrior")) {
			c = (Warrior)o;
			str = "Warrior";
		}
		else if(o.getClass().getName().equals("com.project1.Magician")) {
			c = (Magician)o;
			str = "Magician";
		}
		else {
			c = (Archer)o;
			str = "Archer";
		}
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(str + " is dead.");
		c.setAlive(false);
	}
}