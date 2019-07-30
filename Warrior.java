package com.project1;

public class Warrior extends Character {
	
	/**
	 * 
	 */
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
		System.out.println("Warrior is selected.");
	}

	public void skill(Object o1, Object o2) {
		System.out.println("Warrior's Skill.");
		Character c = (Warrior)o1;
		c.setMP(c.getMP() - 10);
	}
}