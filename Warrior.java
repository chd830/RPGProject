package com.project1;

import java.util.*;

public class Warrior extends Character implements Motion {
	Scanner sc = new Scanner(System.in);
	public Warrior() {
		setLevel(1);
		setHP(100);
		setMP(10);
		setAttack(10);
		setEvasion(10);
		setAlive(true);
		System.out.println("���縦 �����߽��ϴ�.");
	}

	@Override
	public void userItem(Object o1, Object o2, List<String> item) {
		Warrior w = (Warrior)o1;
		if(item != null) {
			System.out.println("�������� ����ֽʽÿ�.");
			for(int i = 0; i < item.size(); i++) {
				System.out.print((i+1)+"."+item.get(i)+"\t");
			}
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
			
		}
		item.remove(num-1);
	}

	@Override
	public void attackJudgement(Object o, int evasion) {
		Random rand = new Random();
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
	}

	@Override
	public void attack(Object o, int attack) {
		Slime m = (Slime)o;
		int cur = m.getHP();
		m.setHP(cur - attack);
		System.out.println("�������� Hp�� "+cur + "���� "+m.getHP()+"�� �Ǿ����ϴ�.");
	}

	@Override
	public void getItem(Object o, List<String> item) {
		if(o.getClass().getName().equals("com.project1.Slime")) {
			System.out.println("���������� ���� �������� ������ϴ�");
			item.add("Hpȸ��");
			item.add("Mpȸ��");
			item.add("����");
			this.setItem(item);
		}
//		else if() {
//			
//		}

	}

	@Override
	public void dead(Object o) {
		Warrior w = (Warrior)o;
		w.setAlive(false);
		System.out.println("���簡 �׾����ϴ�.");
	}


}
