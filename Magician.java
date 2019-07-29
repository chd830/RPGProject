package com.project1;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Magician extends Character implements Motion, Runnable{

	Scanner sc = new Scanner(System.in);
	Random rd = new Random();

	public Magician() {

		setLevel(1);
		setHP(30);
		setMP(100);
		setAttack(30);
		setEvasion(30);
		setCritical(30);
		System.out.println("�����縦 �����߽��ϴ�.");

	}

	@Override
	public void print(Object o) {
		Magician m = (Magician)o;
		System.out.println();
		System.out.println("�������� ����: "+m.getLevel());
		System.out.println("HP: " +m.getHP()+ ", MP: " +m.getMP());
		System.out.println("���ݷ�: " +m.getAttack());
		System.out.println("ȸ����: " +m.getEvasion());
		System.out.println("ġ��Ÿ��: " +m.getCritical());
		System.out.println();
	}

	@Override
	public void attack(Object o, int attack) {

		Slime s = (Slime)o;
		int a;
		int i = 0;
		int num[] = new int[2];

		num[0] = s.getAttack(); //���ݼ���
		num[1] = s.getEvasion(); //�������� ȸ��	

		try {

			while(true) {

				System.out.println();
				do {
					System.out.print("1. ���� 2. �����ۻ��\n=>");
					a = sc.nextInt();
				}while(a<1||a>2);

				if(a==1) {
					System.out.println("�����ӿ��� ������ �õ��߽��ϴ�.");

					//����
					while(i<2) {
						num[i] = rd.nextInt(2)+1;

						for(int j=0;j<i;j++) {
							if(num[i]==num[j]) {
								i--;
								break;
							}
						}
						i++;
					}
					
					//���� ���ݼ����ߴٸ� //�������� ������ ȸ���ߴٸ�
					if(i==0) {
						int cur = s.getHP();
						s.setHP(cur-attack);
						System.out.println("�������� HP�� " +cur+ "���� " +s.getHP()+ "�� �Ǿ����ϴ�.");
					}else if(i==1){
						System.out.println("�������� HP�� �����Ǿ����ϴ�.");
					}

				}else if(a==2) {
					System.out.println("� �������� ����Ͻðڽ��ϱ�?");
					System.out.print("1. hpȸ�� 2. mpȸ�� 3. ��������\n=>");
					int b = sc.nextInt();

					if(b==1) {
						setHP(30);
						System.out.println("HP�� 30���� ȸ���Ǿ����ϴ�.");
					}else if(b==2) {
						setMP(100);
						System.out.println("MP�� 100���� ȸ���Ǿ����ϴ�.");
					}else if(b==3) { //��������
						try {
							Thread.sleep(10000);
						} catch (Exception e) {
							// TODO: handle exception
						}
						
					}
				}				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}



		//		switch(a) {
		//		
		//		case 1: System.out.println("������ �õ��߽��ϴ�.");
		//				s
		//		
		//		case 2: System.out.println("� �������� ����Ͻðڽ��ϱ�?");
		//		}

	}

	@Override
	public void attackJudgement(Object o, int evasion) {
	}

	@Override
	public void takeMedicine(Object o, List<String> item) {
	}

	@Override
	public void run() {
	}

}

