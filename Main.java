package com.project1;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1.Warrior 2.Magician 3.Archer: ");

		Character c = new Warrior();
		Monster m = new Slime();

		recur:for(int i = 0; ; i++) {
			if(i%2 == 0) {
				boolean check = true;
				do {
					System.out.print("1.Attack 2.UseItem: ");
					int num = sc.nextInt();
					switch(num) {
					case 1:
						if(m.getHP() == 0)
							break recur;
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
				if(c.getHP() == 0)
					break recur;
				m.attackJudgement(c, m.getAttack());
			}
		}
	}
}
