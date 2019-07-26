package com.project1;

import java.util.*;

public class Warrior extends Character {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	public Warrior() {
		setLevel(1);
		setHP(100);
		setMP(10);
		setCritical(10);
		setAttack(10);
		setEvasion(10);
		setAlive(true);
		System.out.println("���縦 �����߽��ϴ�.");
	}

	@Override
	public void useItem(Object o1, Object o2, List<String> item) {
		Warrior w = (Warrior)o1;
		if(item.size() < 1) {
			System.out.println("�������� �����ϴ�.");
			return;
		}
		System.out.println("�������� ����ֽʽÿ�.");
		for(int i = 0; i < item.size(); i++) {
			System.out.print((i+1)+"."+item.get(i)+"\t");
		}
		int num = sc.nextInt();
		if(item.get(num-1).equals("Hpȸ��")) {
			int cur = w.getHP();
			w.setHP(cur+10);
			System.out.println("������ hp�� "+cur+"���� "+w.getHP()+"�� �Ǿ����ϴ�.");
		}
		else if(item.get(num-1).equals("Mpȸ��")) {
			int cur = w.getMP();
			w.setMP(cur+10);
			System.out.println("������ mp�� "+cur+"���� "+w.getMP()+"�� �Ǿ����ϴ�.");
		}
		else {
			if(o2.getClass().getName().equals("com.project1.Slime")) {
				Slime s = (Slime)o2;
				System.out.println("�������� "+item.get(num-1)+"���°� �Ǿ����ϴ�.");
				s.setDamaged("����");
			}
		}
		item.remove(num-1);
	}

	@Override
	public void attackJudgement(Object o1, int evasion) {
		Random rand = new Random();
		Slime w = (Slime)o1;
		int num = rand.nextInt(100);
		if(num >= (100 - evasion)) {
			System.out.println("�������� ȸ�ǿ� �����ؼ� Hp�� "+w.getHP()+"�Դϴ�.");
		}
		else {
			this.attacked(o1, evasion);
		}
	}

	@Override
	public void attacked(Object o1, int attack) {
		Monster m = null;
		if(o1.getClass().getName().equals("com.project1.Slime"))
			m = (Slime)o1;
		if(this.getHP() == 0)
			dead(this);
		int cur = m.getHP();
		m.setHP(cur - attack);
		System.out.println("�������� Hp�� "+cur + "���� "+m.getHP()+"�� �Ǿ����ϴ�.");
		if(m.getHP() == 0) 
			dead(m);
	}

	@Override
	public void getItem(Object o, List<String> item) {
		if(o.getClass().getName().equals("com.project1.Slime")) {
			System.out.println("���������� ���� �������� ������ϴ�");

		}
		//		else if() {
		//			
		//		}
		int num = rand.nextInt(10);
		if(num < 3) {
			item.add("Hpȸ��");
			System.out.println("Hpȸ�� �������� ������ϴ�.");
		}
		else if(num < 6) {
			item.add("Mpȸ��");
			System.out.println("Mpȸ�� �������� ������ϴ�.");
		}
		else { 
			item.add("����");
			System.out.println("���� �������� ������ϴ�.");
		}
		this.setItem(item);
	}

	@Override
	public void dead(Object o) {
		Monster c = null;
		if(o.getClass().getName().equals("com.project1.Slime")) {
			c = (Slime)o;
			c.setAlive(false);
			System.out.println("�������� �׾����ϴ�.");
		}
	}


}
