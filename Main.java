package com.project1;
import java.util.*;

public class Main {
	public static void main(String[] args) {
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
		}
	}
}

