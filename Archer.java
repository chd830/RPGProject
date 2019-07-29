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
		System.out.println("궁수를 선택했습니다.");
		
	}
	
	@Override
	public void print(Object o) {
		Warrior w = (Warrior)o;
		System.out.println();
		System.out.println("궁수의 레벨: "+w.getLevel());		
		System.out.println("HP: " +w.getHP()+ ", MP: " +w.getMP());
		System.out.println("공격력: " +w.getAttack());
		System.out.println("회피율: " +w.getEvasion());
		System.out.println("치명타율: " +w.getCritical());
	}

	@Override
	public void attack(Object o, int attack) {
		if(o.getClass().getName().equals("com.project1.Slime")) {
			Slime m = (Slime)o;
			int cur = m.getHP();
			m.setHP(cur-attack);
			System.out.println("슬라임의 HP가 " +cur+ "에서 " +m.getHP()+ "이 되었습니다.");
		}		
	}
	
	@Override
	public void attackJudgement(Object o, int evasion) {
		
	}

	@Override
	public void takeMedicine(Object o, List<String> item) {
	}
	

}
