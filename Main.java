package com.project1;
<<<<<<< HEAD

import java.util.Scanner;
=======
>>>>>>> 93a2bc7b421d5e438e7666520bfb2f6524abd010

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
