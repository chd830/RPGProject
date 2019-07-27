package com.project1;

import java.util.*;

public class Slime extends Monster {
	public Slime() {
		setLevel(1);
		setHP(100);
		setAttack(10);
		setEvasion(100);
		setIsAlive(true);
		System.out.println("You met slime");
	}

	@Override
	public void attack(Object o, int attack) {
		Warrior w = (Warrior)o;
		int cur = w.getHP();
		w.setHP(cur - attack);
		System.out.println("Warrior was attacked and became "+w.getHP()+"HP.");
		if(w.getHP() == 0) {
			dead(w);
		}
	}

	@Override
	public void attackJudgement(Object o, int evasion) {
		Random rand = new Random();
		Warrior w = (Warrior)o;
		int num = rand.nextInt(100);
		if(num >= (100 - evasion)) {
			System.out.println("Warrior succeeded in evasion and became "+w.getHP()+"HP.");
		}
		else {
			attack(w, evasion);
		}
	}

	@Override
	public void dead(Object o) {
		Character c = (Warrior)o;
		System.out.println("Warrior is dead.");
		c.setIsAlive(false);
	}

}
