package com.project1;

import java.util.*;

public class Slime extends Monster {
	Random rand = new Random();
	
	public Slime() {
		setLevel(1);
		setHP(100);
		setAttack(10);
		setEvasion(100);
		setIsAlive(true);
		System.out.println("You met slime");
	}
<<<<<<< HEAD
	
=======

	//공격하는 메서드
>>>>>>> 8ffa4f21927f5e051976924c2b380704fc0479ed
	@Override
	public void attack(Object o1, Object o2, int attack) {
		Warrior w = (Warrior)o1;
		int cur = w.getHP();
		w.setHP(cur - attack);
		System.out.println("Warrior was attacked and became "+w.getHP()+"HP.");
		if(w.getHP() == 0) {
			dead(w);
		}
	}

	//공격인지 회피인지 판정체크 메서드
	@Override
	public void attackJudgement(Object o, int evasion) {	//회피
		Random rand = new Random();
		if(o.getClass().getName().equals("com.project1.Warrior")) {
			Warrior w = (Warrior)o;
			int num = rand.nextInt(100);
			num+=100;
			System.out.println(num+" : "+(100 - evasion));
			if(num >= (100 - evasion)) {
				System.out.println("회피에 성공해서 Hp는 "+w.getHP()+"입니다.");
			}
			else {
				System.out.println("회피실패");
				this.attack(o, evasion);
			}
		}else if(o.getClass().getName().equals("com.project1.Magician")) {
			Magician m = (Magician)o;
			int num = rand.nextInt(100);
			num+=100;
			System.out.println(num+" : "+(100 - evasion));
			if(num >= (100 - evasion)) {
				System.out.println("회피에 성공해서 Hp는 "+m.getHP()+"입니다.");
			}
			else {
				System.out.println("회피실패");
				this.attack(o, evasion);
			}			
		}else if(o.getClass().getName().equals("com.project1.Archer")) {
			Archer a = (Archer)o;
			int num = rand.nextInt(100);
			num+=100;
			System.out.println(num+" : "+(100 - evasion));
			if(num >= (100 - evasion)) {
				System.out.println("회피에 성공해서 Hp는 "+a.getHP()+"입니다.");
			}
			else {
				System.out.println("회피실패");
				this.attack(o, evasion);
			}			
		}
	}

	//죽은거 확인하는 메서드. 
	@Override
	public void dead(Object o) {
		Character c = (Warrior)o;
		System.out.println("Warrior is dead.");
		c.setIsAlive(false);
	}

}
