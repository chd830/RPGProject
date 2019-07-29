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
		System.out.println("You met slime");
	}

	//�����ϴ� �޼���
	@Override
	public void attack(Object o1, Object o2, int attack) {
		Warrior w = (Warrior)o1;
		int cur = w.getHP();
		w.setHP(cur - attack);
		System.out.println("Warrior was attacked and became "+w.getHP()+"HP.");
		if(w.getHP() == 0) {
			isAlive(w);
		}
	}

	//�������� ȸ������ ����üũ �޼���
	@Override
	public void attackJudgement(Object o1, Object o2, int evasion) {	//ȸ��
		Random rand = new Random();
		if(o1.getClass().getName().equals("com.project1.Warrior")) {
			Warrior w = (Warrior)o1;
			int num = rand.nextInt(100);
			num+=100;
			System.out.println(num+" : "+(100 - evasion));
			if(num >= (100 - evasion)) {
				System.out.println("ȸ�ǿ� �����ؼ� Hp�� "+w.getHP()+"�Դϴ�.");
			}
			else {
				System.out.println("ȸ�ǽ���");
				this.attack(o1,o2, evasion);
			}
		}else if(o1.getClass().getName().equals("com.project1.Magician")) {
			Magician m = (Magician)o1;
			int num = rand.nextInt(100);
			num+=100;
			System.out.println(num+" : "+(100 - evasion));
			if(num >= (100 - evasion)) {
				System.out.println("ȸ�ǿ� �����ؼ� Hp�� "+m.getHP()+"�Դϴ�.");
			}
			else {
				System.out.println("ȸ�ǽ���");
				this.attack(o1, o2,evasion);
			}			
		}else if(o1.getClass().getName().equals("com.project1.Archer")) {
			Archer a = (Archer)o1;
			int num = rand.nextInt(100);
			num+=100;
			System.out.println(num+" : "+(100 - evasion));
			if(num >= (100 - evasion)) {
				System.out.println("ȸ�ǿ� �����ؼ� Hp�� "+a.getHP()+"�Դϴ�.");
			}
			else {
				System.out.println("ȸ�ǽ���");
				this.attack(o1, o2,evasion);
			}			
		}
	}
//
//	//������ Ȯ���ϴ� �޼���. 
//	@Override
//	public void dead(Object o) {
//		Character c = (Warrior)o;
//		System.out.println("Warrior is dead.");
//		c.setIsAlive(false);
//	}

}
