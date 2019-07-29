package com.project1;

import java.util.List;
import java.util.Random;

public class Slime extends Monster implements Motion {
	public Slime() {

		setLevel(1);
		setHP(100);
		setAttack(10);
		setEvasion(100);
		System.out.println("�������� �������ϴ�.");
	}

	@Override
	public void attack(Object o, int attack) {
		if(o.getClass().getName().equals("com.project1.Warrior")) {
			Warrior w = (Warrior)o;
			int cur = w.getHP();
			w.setHP(cur - attack);
			System.out.print("����");
			System.out.println(cur + "�� "+w.getHP()+"�� �Ǿ����ϴ�.");
		}else if(o.getClass().getName().equals("com.project1.Magician")) {
			Magician m = (Magician)o;
			int cur = m.getHP();
			m.setHP(cur - attack);
			System.out.print("����");
			System.out.println(cur + "�� "+m.getHP()+"�� �Ǿ����ϴ�.");
		}else if(o.getClass().getName().equals("com.project1.Archer")) {
			Archer a = (Archer)o;
			int cur = a.getHP();
			a.setHP(cur - attack);
			System.out.print("����");
			System.out.println(cur + "�� "+a.getHP()+"�� �Ǿ����ϴ�.");
		}
	}

	@Override
	public void attackJudgement(Object o, int evasion) {
		Random rand = new Random();
		if(o.getClass().getName().equals("com.project1.Warrior")) {
			Warrior w = (Warrior)o;
			int num = rand.nextInt(100);
			num+=100;
			System.out.println(num+" : "+(100 - evasion));
			if(num >= (100 - evasion)) {
				System.out.println("ȸ�ǿ� �����ؼ� Hp�� "+w.getHP()+"�Դϴ�.");
			}
			else {
				System.out.println("ȸ�ǽ���");
				this.attack(o, evasion);
			}
		}else if(o.getClass().getName().equals("com.project1.Magician")) {
			Magician m = (Magician)o;
			int num = rand.nextInt(100);
			num+=100;
			System.out.println(num+" : "+(100 - evasion));
			if(num >= (100 - evasion)) {
				System.out.println("ȸ�ǿ� �����ؼ� Hp�� "+m.getHP()+"�Դϴ�.");
			}
			else {
				System.out.println("ȸ�ǽ���");
				this.attack(o, evasion);
			}			
		}else if(o.getClass().getName().equals("com.project1.Archer")) {
			Archer a = (Archer)o;
			int num = rand.nextInt(100);
			num+=100;
			System.out.println(num+" : "+(100 - evasion));
			if(num >= (100 - evasion)) {
				System.out.println("ȸ�ǿ� �����ؼ� Hp�� "+a.getHP()+"�Դϴ�.");
			}
			else {
				System.out.println("ȸ�ǽ���");
				this.attack(o, evasion);
			}			
		}
	}

	@Override
	public void takeMedicine(Object o, List<String> item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print(Object o) {
	}

}
