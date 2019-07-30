package com.project1;


public class Warrior extends Character {

	private static final long serialVersionUID = 5716387998910136780L;
	public Warrior() {
		setLevel(1);
		setHP(100);
		setMaxHP(getHP());
		setMP(20);
		setMaxMP(getMP());
		setCritical(50);
		setAttack(10);
		setEvasion(10);
		setIsAlive(true);
		try {
			System.out.println("Warrior is selected.");
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}


	public boolean skill(Object o1, Object o2) {
		Warrior w = null;
		try {
			System.out.println("Warrior's Skill.");
			Thread.sleep(1000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return true;
	}
}
