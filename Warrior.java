package com.project1;

public class Warrior extends Character {

	private static final long serialVersionUID = 5716387998910136780L;
	public Warrior() {

		setHP(100);
		setMaxHP(getHP());
		setMP(30);
		setMaxMP(getMP());
		setCritical(50);
		setAttack(10);
		setEvasion(10);
		setAlive(true);
		try {
			System.out.println("Warrior is selected.");
//			Thread.sleep(1000);
		} catch (Exception e) {
		}
		System.out.println("Warrior is selected.");
	}

	public void skill(Object o1, Object o2) {
		Warrior w = (Warrior)o1;
		try {
			System.out.println("Warrior's Skill.");
//			Thread.sleep(1000);
			w.setMP(w.getMP() - 10);
		} catch (Exception e) {
		}
	}
}