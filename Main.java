package com.project1;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.project1.Character;

public class Main {
	static List<Character> l = null;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String str = "";
		File f = new File("C:\\Users\\stu\\Desktop\\Project1\\data.txt");
		Character c = null;
		int num = 0;
		if(f.exists()) {
			System.out.print("Load Data?[y/n] ");
			str = sc.next();
		}

		if(str.equals("y") || str.equals("Y")) {
			try {
				set();
				for(int i = 0; i < l.size(); i++) {
					System.out.println((i + 1) + "." +l.get(i).getClass().getName().substring(13, l.get(i).getClass().getName().length()));
				}
			} catch(Exception e ) {
				System.out.println(e.toString());
			}
			System.out.print("Select: ");
			num = sc.nextInt();
			c = l.get(num - 1);

		}
		else {
			l = new ArrayList(); 
			System.out.print("1.Warrior 2.Magician 3.Archer: ");
			num = sc.nextInt();

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
		}

		//Detailed data print
		c.print(c);
		Monster m = new Slime();

		while(m.getIsAlive() && c.isAlive()) {

			c.showStatus(c, m);

			if(m.getHP() <= 0 || c.getHP() <= 0)
				break;
			recur:do {
				System.out.print("1.Attack 2.UseItem 3.Skill: ");
				num = sc.nextInt();
				switch(num) {
				case 1:
					c.attackJudgement(c, m);
					break recur;
				case 2:
					try {
						if(c.getItem().size() <= 0) {
							System.out.println("Item is null");
							break;
						}
					}
					catch(Exception e) {
						System.out.println(e.toString());
					}
					c.useItem(c, m, c.getItem());
					break;
				case 3:
					if(c.getMP() > 0) {
						c.setSkill(true);
						c.attackJudgement(c, m);
						break recur;
					}
					else {
						System.out.println("Not enough MP.");
					}
				}
			} while(true);
			m.attackJudgement(m, c);
		}
		c.showStatus(c, m);
		/*
		 * 몬스터랑 캐릭터 게임이 끝 나면 초기화하기
		 */
		if(m.getHP() <= 0) {
			c.getItemByMonster(m, c.item);
			System.out.print("1.Save 2.Exit: ");
			num = sc.nextInt();
			try {
				if(num == 1) {
					reset(c);
					l.add(c);
					save(l);
				}
			} catch(Exception e ) {

			}
		}
		if(c.getHP() <= 0) {
			System.out.println("Game is end");
		}
	}
	public static void reset(Character c) {
		c.setMaxHP(c.getMaxHP() + 50);
		c.setMaxMP(c.getMaxMP() + 50);
		c.setHP(c.getMaxHP());
		c.setMP(c.getMaxMP());
	}
	public static void save(List<Character> c) {
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\stu\\Desktop\\Project1\\data.txt");
			//			FileOutputStream fos = new FileOutputStream("c:\\Users\\com\\Desktop\\RPGProject\\data.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(c);
			oos.close();
		} catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	@SuppressWarnings("unchecked")
	public static void set() {
		FileInputStream fis;
		try {
			fis = new FileInputStream("C:\\Users\\stu\\Desktop\\Project1\\data.txt");
			//			fis = new FileInputStream("c:\\Users\\com\\Desktop\\RPGProject\\data.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			l = (List<Character>)ois.readObject();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}