package com.project1;

import java.util.List;

public class Archer extends Character implements Motion{
	public Archer() {

		setLevel(1);
		setHP(50);
		setMP(50);
		setAttack(25);
		setEvasion(20);
		setCritical(15);
		System.out.println("�ü��� �����߽��ϴ�.");
		
	}
	
	@Override
	public void print(Object o) {
		Warrior w = (Warrior)o;
		System.out.println();
		System.out.println("�ü��� ����: "+w.getLevel());		
		System.out.println("HP: " +w.getHP()+ ", MP: " +w.getMP());
		System.out.println("���ݷ�: " +w.getAttack());
		System.out.println("ȸ����: " +w.getEvasion());
		System.out.println("ġ��Ÿ��: " +w.getCritical());
	}

	@Override
	public void attack(Object o, int attack) {
		if(o.getClass().getName().equals("com.project1.Slime")) {
			Slime m = (Slime)o;
			int cur = m.getHP();
			m.setHP(cur-attack);
			System.out.println("�������� HP�� " +cur+ "���� " +m.getHP()+ "�� �Ǿ����ϴ�.");
		}		
	}
	
	@Override
	public void attackJudgement(Object o, int evasion) {
		
	}

	@Override
	public void takeMedicine(Object o, List<String> item) {
	}
	

}
