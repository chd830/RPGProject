package com.project1;


public class Warrior extends Character {

	private static final long serialVersionUID = 5716387998910136780L;
	public Warrior() {
		setHP(200);
		setMaxHP(getHP());
<<<<<<< HEAD
		setMP(20);
=======
		setMP(30);
>>>>>>> ae0573a3809c42827127b49847435b8ed4f19a2c
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

<<<<<<< HEAD

	public boolean skill(Object o1, Object o2) {
		Warrior w = null;
		try {
			System.out.println("Warrior's Skill.");
			Thread.sleep(1000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return true;
=======
	public void skill(Object o1, Object o2) {
		System.out.println("Warrior's Skill.");
		Character c = (Warrior)o1;
		c.setMP(c.getMP() - 10);
>>>>>>> ae0573a3809c42827127b49847435b8ed4f19a2c
	}
}