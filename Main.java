package com.project1;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1.Warrior 2.Magician 3.Archer: ");
		int num = sc.nextInt();
		//		switch(num) {
		//		case 1:
		Warrior c = new Warrior();
		Character l = null;
		if(c.set() != null)
			l = c.set();
		System.out.println(l.getLevel()+"."+l.getClass().getName().substring(13,l.getClass().getName().length()));
//		//			break;
//		//		case 2:
//		//			Magician c = new Magician();
//		//			break;
//		//		case 3:
//		//			Archer c = new Archer();
//		//			break;
//		//	}
//
//		c.print(c);
//		Monster m = new Slime();
//
//		//		//랜덤으로 아이템 생성
//		//		c.getItemByMonster(m, c.getItem());
//		//		c.getItemByMonster(m, c.getItem());
//		//		c.getItemByMonster(m, c.getItem());
//
//		//공격과 아이템사용 반복용 예시코드
//		int i = 0;
//		while(m.getIsAlive() && c.getIsAlive()) {
//
//			if(i%2 == 0) {
//				c.showStatus(c, m);
//				System.out.print("1.Attack 2.UseItem 3.Skill: ");
//				num = sc.nextInt();
//				if(m.getHP() <= 0 || c.getHP() <= 0)
//					break;
//				//아이템사용
//				switch(num) {
//				case 1:
//					c.attackJudgement(c, m, c.getEvasion());
//					break;
//				case 2:
//					if(c.getItem().size() <= 0) {
//						System.out.println("Item is null");
//						break;
//					}
//					c.useItem(c, m, c.getItem());
//					break;
//				case 3:
//					c.skill(c, m, c.getAttack());
//				}
//			}
//			else {
//				m.attack(m, c, m.getAttack());
//			}
//			//몬스터가 공격
//			if(m.getHP() == 0) {
//				c.getItemByMonster(m, c.item);
//			}
//			i++;
//		}
//		System.out.print("1.Save 2.Exit: ");
//		num = sc.nextInt();
//		if(num == 1) {
//			c.save(c);
//		}
//		else {
//
//		}

	}
}

