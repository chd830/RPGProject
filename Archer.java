package com.project1;

public class Archer extends Character implements Motion {

	public Archer() {
		setHP(100);
		setMaxHP(this.getHP());
		setMP(100);
		setMaxMP(this.getMP());
		setAttack(30);
		setEvasion(20);
		setCritical(15);
		setAlive(true);
		System.out.println("궁수를 선택했습니다.");

	}
	//Archer의 스킬
	public void skill(Object o1, Object o2, int attack) {
		System.out.println("스킬을 사용했습니다.");
		Character c = (Archer)o1;
		c.setMP(c.getMP() - 10);
	}
}
