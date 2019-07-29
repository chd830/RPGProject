package com.project1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Character c = new Warrior();
		
		Scanner sc = new Scanner(System.in);

//		Warrior war = new Warrior();
//		Archer arc = new Archer(); 
//		Magician mag = new Magician();

		Character m = new Magician();		
		
		m.print();
		
		Slime s = new Slime();
		c.attack(s, c.getAttack());
		
		
	}
}
