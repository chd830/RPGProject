package com.project1;

public class Warrior extends Character {

	private static final long serialVersionUID = 5716387998910136780L;
	public Warrior() {

		setHP(150);
		setMaxHP(getHP());
		setMP(50);
		setMaxMP(getMP());
		setCritical(30);
		setAttack(20);
		setEvasion(10);
		setAlive(true);
		
		try {
			Thread.sleep(700);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("Warrior is selected.");
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		
	}

	public void skill(Object o1, Object o2) {
		Warrior w = (Warrior)o1;
		try {
			Thread.sleep(1000);
			System.out.println("Warrior's Skill.");
			w.setMP(w.getMP() - 10);
		} catch (Exception e) {
		}
	}
}