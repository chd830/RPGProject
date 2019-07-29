package com.project1;
import java.util.*;

public class Main {

	public static void main(String[] args) {
<<<<<<< HEAD
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("1.전사 2.궁수 3.마법사");
		int num = sc.nextInt();
		Character c = null;
		switch(num) {
		case 1:
			c = new Warrior();
			break;
		case 2:
			break;
		case 3:
			break;
		}
		Monster m = new Slime();
		for(int i = 0; m.getHP() != 0 && c.getHP() != 0; i++) {
			if(i%2 == 0)
				m.attackJudgement(c, m.getAttack());
			else
				c.attackJudgement(m, c.getAttack());
=======
		Scanner sc = new Scanner(System.in);
		System.out.print("1.Warrior 2.Magician 3.Archer: ");

		Character c = new Warrior();
		Monster m = new Slime();
		c.getItemByMonster(m, c.getItem());
		c.getItemByMonster(m, c.getItem());
		c.getItemByMonster(m, c.getItem());
		
		c.print(c);
		System.out.print("1.Attack 2.UseItem: ");
		int num = sc.nextInt();
		recur:for(int i = 0; ; i++) {
			if(i%2 == 0) {
				boolean check = true;
				do {
					if(m.getHP() == 0 || c.getHP() == 0)
						break recur;
					switch(num) {
					case 1:
						c.attackJudgement(m, c.getAttack());
						check = false;
						break;
					case 2:
						if(c.getItem().size() <= 0) {
							System.out.println("Item is null");
							break;
						}
						c.useItem(c, m, c.getItem());
						System.out.println("Have Item");
						check = false;
						break;

					}
				} while(check);
			}
			else {
				m.attackJudgement(c, m.getAttack());
			}
		}
		if(m.getHP() == 0) {
			c.getItemByMonster(m, c.item);
>>>>>>> 248825b00653809bab5f07d19f820671784a918d
		}
	}
}

