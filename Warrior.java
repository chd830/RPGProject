package com.project1;

import java.util.List;

public class Warrior extends Character implements Motion {
	public Warrior() {

		setLevel(1);
		setHP(100);
		setMP(10);
		setAttack(10);
		setEvasion(10);
		setCritical(10);	
		System.out.println("���縦 �����߽��ϴ�.");
		
	}

	@Override
	public void print(Object o) {
		Warrior w = (Warrior)o;
		System.out.println();
		System.out.println("������ ����: "+w.getLevel());		
		System.out.println("HP: " +w.getHP()+ ", MP: " +w.getMP());
		System.out.println("���ݷ�: " +w.getAttack());
		System.out.println("ȸ����: " +w.getEvasion());
		System.out.println("ġ��Ÿ��: " +w.getCritical());
	}

	
	@Override
	public void takeMedicine(Object o, List<String> item) {
		// TODO Auto-generated method stub

	}

	@Override
	public void attackJudgement(Object o, int evasion) {
		// TODO Auto-generated method stub

	}

	@Override
	public void attack(Object o, int attack) {
		if(o.getClass().getName().equals("com.project1.Slime")) {
			Slime m = (Slime)o;
			int cur = m.getHP();
			m.setHP(cur - attack);
			System.out.println("�������� Hp�� "+cur + "���� "+m.getHP()+"�� �Ǿ����ϴ�.");
<<<<<<< HEAD
		}
=======
		}		
>>>>>>> 93a2bc7b421d5e438e7666520bfb2f6524abd010
	}


}
