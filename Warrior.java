package com.project1;

public class Warrior extends Character {
	public Warrior() {
		setLevel(1);
		setHP(100);
		setMP(10);
		setAttack(10);
		setEvasion(10);
		System.out.println("���縦 �����߽��ϴ�.");
	}

	@Override
	public void attack(Object o, int attack) {
		if(o.getClass().getName().equals("com.Project1.Slime")) {
			Slime m = (Slime)o;
			int cur = m.getHP();
			m.setHP(cur - attack);
			System.out.println("�������� Ht�� "+cur + "���� "+m.getHP()+"�� �Ǿ����ϴ�.");
		}
	}


}
