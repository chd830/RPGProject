package com.project1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

//		Warrior war = new Warrior();
//		Archer arc = new Archer(); 
//		Magician mag = new Magician();

		Character c = new Magician();		
		
		c.print(c);
		
		Slime s = new Slime();
		c.attack(s, c.getAttack());
		
		
	}
}
