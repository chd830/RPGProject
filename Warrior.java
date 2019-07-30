package com.project1;


public class Warrior extends Character {

	private static final long serialVersionUID = 5716387998910136780L;

	public Warrior() {
		setLevel(1);
		setHP(100);
		setMaxHP(getHP());
		setMP(10);
		setMaxMP(getMP());
		setCritical(50);
		setAttack(10);
		setEvasion(10);
		setIsAlive(true);
		System.out.println("Warrior is selected.");
	}

	public boolean skill(Object o1, Object o2) {
		System.out.println("Warrior's Skill.");
		return true;
	}
}
