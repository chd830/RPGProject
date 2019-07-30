package com.project1;

import java.util.Random;

public class Boss extends Monster{
	Random rd = new Random();

	static int count = 0;

	public Boss() {
		setLevel(1);
		setHP(150);
		setMaxHP(this.getHP());
		setAttack(20);
		setEvasion(100);
		setIsAlive(true);
		System.out.println("You meet a boss!");
		System.out.println();
	}

	@Override
	public void attack(Object o1, Object o2) {
		Character c = null;
		int attack = ((Boss)o1).getAttack();

		if(o2.getClass().getName().equals("com.procject1.Warrior")) {
			c = (Warrior)o2;			
		}else if(o2.getClass().getName().equals("com.project1.Magician")) {
			c = (Magician)o2;
		}else if(o2.getClass().getName().equals("com.project1.Archer")) {
			c = (Archer)o2;
		}
		int cur = c.getHP();
		c.setHP(cur - attack);
		System.out.println("You are attacked by boss and the Hp goes down to " +c.getHP()+ ".");

		if(c.getHP()==0) {
			isAlive(c);
		}
	}

	@Override
	public void attackJudgement(Object o1, Object o2) {
		Monster m = (Slime)o1;

		if(m.getStatus().equals("Iced") && count<1) { //count°¡ 0ÀÏ¶§´Â IcedµÊ
			count++;
			return;
		}else if(m.getStatus().equals("Fired") && count<1) {
			count++;
			System.out.println("Boss is in Fired status.");
			attack(o2, m);
			return;
		}
		
		m.setStatus("");
		count = 0;

		Random rd = new Random();
		int num = rd.nextInt(100);
		Character c = null;
		if(o2.getClass().getName().equals("com.project1.Warrior")) {
			c = (Warrior)o2;
			if(num >= (100 - m.getAttack())) {
				System.out.println("Warrior succeeded in evasion and became "+c.getHP()+"HP.");
				return;
			}
		} else if(o2.getClass().getName().equals("com.project1.Magician")) {
			c = (Magician)o2;
			num+=100;
			if(num >= (100 - m.getAttack())) {
				System.out.println("Magician succeeded in evasion and became "+c.getHP()+"HP.");
			}
		} else {
			c = (Archer)o2;
			num+=100;
			if(num >= (100 - m.getAttack())) {
				System.out.println("Archer succeeded in evasion and became "+c.getHP()+"HP.");
			}
		}
		attack(o2, m);
	}


	@Override
	public void isAlive(Object o) {
		Character c = null;
		Warrior w = new Warrior();
		Magician m = new Magician();
		Archer a = new Archer();

		if(o.getClass().getName().equals("com.procject1.Warrior")&&w.getHP()==0) {
			c = (Warrior)o;			
			System.out.println("Warrior is dead.");
		}else if(o.getClass().getName().equals("com.project1.Magician")&&m.getHP()==0) {
			c = (Magician)o;
			System.out.println("Magician is dead.");
		}else if(o.getClass().getName().equals("com.project1.Archer")&&a.getHP()==0) {
			c = (Archer)o;
			System.out.println("Archer is dead.");
		}
		c.setIsAlive(false);
	}


}
