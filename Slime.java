package com.project1;

import java.util.*;

public class Slime extends Monster {
	public Slime() {
		setLevel(1);
		setHP(100);
		setAttack(10);
<<<<<<< HEAD
		setEvasion(10);
		setAlive(true);
		System.out.println("�������� �������ϴ�.");
	}

	@Override
	public void attacked(Object o1,int attack) {
		Character c = null;
		if(o1.getClass().getName().equals("com.project1.Warrior")) {
			c = (Warrior)o1;
			int cur = c.getHP();
			c.setHP(cur - attack);
			System.out.println("���簡 ������ �޾� Hp��"+cur + "�� "+c.getHP()+"�� �Ǿ����ϴ�.");
=======
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
>>>>>>> 248825b00653809bab5f07d19f820671784a918d
		}
		if(c.getHP() == 0)
			dead(c);
	}

	@Override
	public void attackJudgement(Object o1, int evasion) {
		Random rand = new Random();
<<<<<<< HEAD
		Warrior w = (Warrior)o1;
		int num = rand.nextInt(100);
		if(num >= (100 - evasion)) {
			System.out.println("ȸ�ǿ� �����ؼ� Hp�� "+w.getHP()+"�Դϴ�.");
		}
		else {
			this.attacked(o1, evasion);
=======
		Warrior w = (Warrior)o;
		int num = rand.nextInt(100);
		if(num >= (100 - evasion)) {
			System.out.println("Warrior succeeded in evasion and became "+w.getHP()+"HP.");
		}
		else {
			attack(w, evasion);
>>>>>>> 248825b00653809bab5f07d19f820671784a918d
		}
	}

	@Override
<<<<<<< HEAD
	public void useItem(Object o1, Object o2, List<String> item) {
		
	}

	@Override
	public void getItem(Object o, List<String> item) {
		
	}

	@Override
	public void dead(Object o) {
		Character c = null;
		if(o.getClass().getName().equals("com.project1.Warrior")) {
			c = (Warrior)o;
			c.setAlive(false);
			System.out.println("���簡 �׾����ϴ�.");
		}
		
=======
	public void dead(Object o) {
		Character c = (Warrior)o;
		System.out.println("Warrior is dead.");
		c.setIsAlive(false);
>>>>>>> 248825b00653809bab5f07d19f820671784a918d
	}

}
