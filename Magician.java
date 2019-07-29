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
		System.out.println("마법사를 선택했습니다.");

	}

	@Override
	public void print(Object o) {
		Magician m = (Magician)o;
		System.out.println();
		System.out.println("마법사의 레벨: "+m.getLevel());
		System.out.println("HP: " +m.getHP()+ ", MP: " +m.getMP());
		System.out.println("공격력: " +m.getAttack());
		System.out.println("회피율: " +m.getEvasion());
		System.out.println("치명타율: " +m.getCritical());
		System.out.println();
	}

	@Override
	public void attack(Object o, int attack) {

		Slime s = (Slime)o;
		int a;
		int i = 0;
		int num[] = new int[2];

		num[0] = s.getAttack(); //공격성공
		num[1] = s.getEvasion(); //슬라임이 회피	

		try {

			while(true) {

				System.out.println();
				do {
					System.out.print("1. 공격 2. 아이템사용\n=>");
					a = sc.nextInt();
				}while(a<1||a>2);

				if(a==1) {
					System.out.println("슬라임에게 공격을 시도했습니다.");

					//랜덤
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
					
					//만약 공격성공했다면 //슬라임이 공격을 회피했다면
					if(i==0) {
						int cur = s.getHP();
						s.setHP(cur-attack);
						System.out.println("슬라임의 HP가 " +cur+ "에서 " +s.getHP()+ "이 되었습니다.");
					}else if(i==1){
						System.out.println("슬라임의 HP가 유지되었습니다.");
					}

				}else if(a==2) {
					System.out.println("어떤 아이템을 사용하시겠습니까?");
					System.out.print("1. hp회복 2. mp회복 3. 빙결포션\n=>");
					int b = sc.nextInt();

					if(b==1) {
						setHP(30);
						System.out.println("HP가 30으로 회복되었습니다.");
					}else if(b==2) {
						setMP(100);
						System.out.println("MP가 100으로 회복되었습니다.");
					}else if(b==3) { //빙결포션
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
		//		case 1: System.out.println("공격을 시도했습니다.");
		//				s
		//		
		//		case 2: System.out.println("어떤 아이템을 사용하시겠습니까?");
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

