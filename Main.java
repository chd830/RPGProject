package com.project1;

import java.io.*;
import java.util.*;

import com.project1.Character;

public class Main {
	public static void main(String[] args) throws Exception {
		//If file does not exist
		Scanner sc = new Scanner(System.in);
		System.out.print("1.Warrior 2.Magician 3.Archer: ");
		int num = sc.nextInt();


		Character c = null;

		switch(num) {
		case 1:
			c = new Warrior();
			break;
		case 2:
			c = new Magician();
			break;
		case 3:
			c = new Archer();
			break;
		}

//		//If file exist. Get data from file. Need to Change Position.
		List<Character> l = new ArrayList();
//		l = c.set();
//		for(int i = 0; i < l.size(); i++) {
//			System.out.println((i + 1 ) +".Lv"+l.get(i).getLevel()+" "+l.get(i).getClass().getName().substring(13,l.getClass().getName().length() + 1));
//		}

		//Detailed data print
		c.print(c);
		Monster m = new Slime();

		//		//占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙
		//		c.getItemByMonster(m, c.getItem());
		//		c.getItemByMonster(m, c.getItem());
		//		c.getItemByMonster(m, c.getItem());

		//占쏙옙占쌥곤옙 占쏙옙占쏙옙占쌜삼옙占� 占쌥븝옙占쏙옙 占쏙옙占쏙옙占쌘듸옙
		int i = 0;
		while(m.getIsAlive() && c.getIsAlive()) {

			if(i%2 == 0) {
				c.showStatus(c, m);
				System.out.print("1.Attack 2.UseItem 3.Skill: ");
				num = sc.nextInt();
				if(m.getHP() <= 0 || c.getHP() <= 0)
					break;
				//占쏙옙占쏙옙占쌜삼옙占�
				switch(num) {
				case 1:
					c.attackJudgement(c, m, c.getEvasion());
					break;
				case 2:
					if(c.getItem().size() <= 0) {
						System.out.println("Item is null");
						break;
					}
					c.useItem(c, m, c.getItem());
					break;
				case 3:
					c.skill(c, m, c.getAttack());
				}
			}
			else {
				m.attack(m, c, m.getAttack());
			}
			//占쏙옙占싶곤옙 占쏙옙占쏙옙
			if(m.getHP() == 0) {
				c.getItemByMonster(m, c.item);
			}
			i++;
		}
		System.out.print("1.Save 2.Exit: ");
		num = sc.nextInt();
		if(num == 1) {
			l.add(c);
			c.save(l);
		}
		else {

		}

	}
}


