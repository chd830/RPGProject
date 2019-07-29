package com.project1;

import java.util.Random;
import java.util.Scanner;

public class Slime extends Monster{
	public Slime() {
		setLevel(1);
		setHP(100);
		setAttack(10);
		setEvasion(100);
		System.out.println("�������� �������ϴ�.");
	}
	

	
	

	@Override	
	public void attack(Object o, int attack) {	//����
		if(o.getClass().getName().equals("com.project1.Warrior")) {
			Warrior w = (Warrior)o;
			int cur = w.getHP();	//HP100
			w.setHP(cur - attack);	//100-attack
			System.out.print("����");
			System.out.println(cur + "�� "+w.getHP()+"�� �Ǿ����ϴ�.");
		}
	}

	@Override
	public void attackJudgement(Object o, int evasion) {	//ȸ��
		Random rand = new Random();
		if(o.getClass().getName().equals("com.project1.Warrior")) {
			Warrior w = (Warrior)o;
			int num = rand.nextInt(100);
			
			System.out.println(num+" : "+(100 - evasion));
			if(num >= (100 - evasion)) {
				System.out.println("ȸ�ǿ� �����ؼ� Hp�� "+w.getHP()+"�Դϴ�.");
			}
			else {
				System.out.println("ȸ�ǽ���");
				this.attack(o, evasion);
			}
		}
	}

}
