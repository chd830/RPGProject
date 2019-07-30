package com.project1;

import java.util.*;

public class Slime extends Monster {
	Random rand = new Random();

	public Slime() {
		setLevel(1);
		setHP(100);
		setAttack(10);
		setEvasion(100);
		setIsAlive(true);
		System.out.println("You meet a slime!");
		System.out.println();
	}

	//공격하는 메서드
	@Override
	public void attack(Object o1, Object o2, int attack) {
		Warrior w = (Warrior)o2;
		Magician m = (Magician)o2;
		Archer a = (Archer)o2;
		//		if()
		int cur = w.getHP();
		w.setHP(cur - attack);
		System.out.println("Warrior is attacked and the Hp is "+w.getHP()+".");
		if(w.getHP() == 0) {
			isAlive(w);
		}
	}


	//공격인지 회피인지 판정체크 메서드
	@Override
	public void attackJudgement(Object o1, Object o2, int evasion) {
		Random rand = new Random();
		if(o1.getClass().getName().equals("com.project1.Warrior")) {
			Warrior w = (Warrior)o1;
			int num = rand.nextInt(100);
			num+=100;
			System.out.println(num+" : "+(100 - evasion));
			if(num >= (100 - evasion)) {
				System.out.println("Slime evade the attack and the Hp is " +w.getHP()+ ".");
			}
			else {
				System.out.println("Slime is attacked.");
				int cur = getHP();
				setHP(cur-getAttack());
				System.out.println("Slime's Hp goes down to " +getHP());				
			}
		}else if(o1.getClass().getName().equals("com.project1.Magician")) {
			Magician m = (Magician)o1;
			int num = rand.nextInt(100);
			num+=100;
			System.out.println(num+" : "+(100 - evasion));
			if(num >= (100 - evasion)) {
				System.out.println("Slime evade the attack and the Hp is "+m.getHP()+".");
			}
			else {
				System.out.println("Slime is attacked.");
				int cur = getHP();
				setHP(cur-getAttack());
				System.out.println("Slime's Hp goes down to " +getHP());
			}			
		}else if(o1.getClass().getName().equals("com.project1.Archer")) {
			Archer a = (Archer)o1;
			int num = rand.nextInt(100);
			num+=100;
			System.out.println(num+" : "+(100 - evasion));
			if(num >= (100 - evasion)) {
				System.out.println("Slime evade the attack and Hp is "+a.getHP()+".");
			}
			else {
				System.out.println("Slime is attacked.");
				int cur = getHP();
				setHP(cur-getAttack());
				System.out.println("Slime's Hp goes down to " +getHP());
			}			
		}
	}

	//죽은거 확인하는 메서드. 
	@Override
	public boolean isAlive(Object o) {
		Character c = (Warrior)o;
		System.out.println("Warrior is dead.");
		c.setIsAlive(false);
		return false;
	}

}
