package com.project1;

import java.util.*;

public class Magician extends Character implements Motion{

	private static final long serialVersionUID = -1644685707880637214L;

	public Magician() {
		setHP(60);
		setMaxHP(this.getHP());
		setMP(150);
		setMaxMP(this.getMP());
		setAttack(30);
		setEvasion(30);
		setCritical(30);
		setAlive(true);
		System.out.println("Magician is selected.");
	}

	public void skill(Object o1, Object o2) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Select one: \t");
		System.out.println("1.Iced 2.Fired");
		Magician c = (Magician)o1;
		Monster m = null;
		if(o2.getClass().getName().equals("com.project1.Slime")) {
			m = (Slime)o2;
		}
		else {
			m = (Boss)o2;
		}
		int num = sc.nextInt();
		if(num == 1) {
			System.out.println("\'Iced\' is selected");
			m.setStatus("Iced");
			System.out.println("Monster is \'Iced\'");
		}
		else if(num == 2) {
			System.out.println("\'Fired\' is selected");
			m.setStatus("Fired");
			System.out.println("Monster is \'Fired\'");
		}
		c.setMP(c.getMP() - 10);
	}
}

