package com.project1;

import java.util.Random;
import java.util.Scanner;

public class Slime extends Monster{
	public Slime() {
		setLevel(1);
		setHP(100);
		setAttack(10);
		setEvasion(100);
		System.out.println("슬라임을 만났습니다.");
	}
	

	
	

	@Override	
	public void attack(Object o, int attack) {	//공격
		if(o.getClass().getName().equals("com.project1.Warrior")) {
			Warrior w = (Warrior)o;
			int cur = w.getHP();	//HP100
			w.setHP(cur - attack);	//100-attack
			System.out.print("끈적");
			System.out.println(cur + "이 "+w.getHP()+"이 되었습니다.");
		}
	}

	@Override
	public void attackJudgement(Object o, int evasion) {	//회피
		Random rand = new Random();
		if(o.getClass().getName().equals("com.project1.Warrior")) {
			Warrior w = (Warrior)o;
			int num = rand.nextInt(100);
			
			System.out.println(num+" : "+(100 - evasion));
			if(num >= (100 - evasion)) {
				System.out.println("회피에 성공해서 Hp는 "+w.getHP()+"입니다.");
			}
			else {
				System.out.println("회피실패");
				this.attack(o, evasion);
			}
		}
	}

}
