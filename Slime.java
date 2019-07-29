package com.project1;

import java.util.*;

public class Slime extends Monster {
	Random rand = new Random();
	static int count = 0;
	public Slime() {
		setLevel(1);
		setHP(100);
		setAttack(10);
		setEvasion(100);
		setIsAlive(true);
		System.out.println("You met slime");
	}

	//�����ϴ� �޼���
	@Override
	public void attack(Object o1, Object o2, int attack) {
		Character c = null;
		String str = "";
		if(o1.getClass().getName().equals("com.project1.Warrior")) {
			str = "Warrior";
			c = (Warrior)o1;
		} else if(o1.getClass().getName().equals("com.project1.Magician")) {
			str = "Magician";
			c = (Magician)o1;
		} else {
			str = "Archer";
			c = (Archer)o1;
		}
		int cur = c.getHP();
		c.setHP(cur - attack);
		System.out.println(str+" was attacked and became "+c.getHP()+"HP.");

		if(c.getHP() == 0) {
			isAlive(c);
		}
	}

	//�������� ȸ������ ����üũ �޼���. ĳ����, ����, ������ ȸ��
	@Override
	public void attackJudgement(Object o1, Object o2, int evasion) {
		try {
			if(((Slime)o2).getStatus().equals("Iced") && count < 1) {
				count++;
				return;
			}
		} catch(Exception e) {
		}
		System.out.println("The state of the slime was released from \'Iced\'.");
		((Slime)o2).setStatus("");
		count = 0;
		Random rand = new Random();
		Character c = null;
		int num = rand.nextInt(100);
		if(o1.getClass().getName().equals("com.project1.Warrior")) {
			c = (Warrior)o1;
			if(num >= (100 - evasion)) {
				System.out.println("Warrior succeeded in evasion and became "+c.getHP()+"HP.");
				return;
			}
		} else if(o1.getClass().getName().equals("com.project1.Magician")) {
			c = (Magician)o1;
			num+=100;
			if(num >= (100 - evasion)) {
				System.out.println("Magician succeeded in evasion and became "+c.getHP()+"HP.");
			}
		} else {
			c = (Archer)o1;
			num+=100;
			if(num >= (100 - evasion)) {
				System.out.println("Archer succeeded in evasion and became "+c.getHP()+"HP.");
			}
		}
		attack(o1, o2, c.getAttack());
	}

	//������ Ȯ���ϴ� �޼���. 
	@Override
	public boolean isAlive(Object o) {
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
		return false;
	}

}
