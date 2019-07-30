package com.project1;

import java.io.*;
import java.util.*;

public class Main{
	static List<Character> l = null;
	static Character c = null;
	static Monster m = null;
	static Scanner sc = new Scanner(System.in);

	public static void game() {
		int num = 0;

		c.print(c);

		m = randomMonster();

		while(m.getIsAlive() && c.getIsAlive()) {

			if(m.getHP() <= 0 || c.getHP() <= 0)
				return;
			c.showStatus(c, m);
			recur: while(true) {
				try {
					//					Thread.sleep(1000);
					System.out.print("1.Attack 2.UseItem 3.Skill: ");
				} catch (Exception e) {
				}

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
			}
			m.attackJudgement(m, c);
		}
		return;
	}
	public static void main(String[] args) throws Exception {

		String str = "";
		File f = new File("C:\\Users\\stu\\Desktop\\Project1\\data.txt");
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
			game();
		}
		System.out.println("m.hp: "+m.getHP() +", c.hp: "+c.getHP());
		if(m.getHP() <= 0) {
			c.getItemByMonster(m, c.item);
			System.out.print("1.Save 2.Continue: ");
			num = sc.nextInt();
			switch (num) {
			case 1:
				l.add(c);
				save(l);
				return;
			case 2:
				game();
				break;
			}
		}
		if(c.getHP() <= 0) {
			System.out.println("Game is end");
			return;
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
			// FileOutputStream("c:\\Users\\com\\Desktop\\RPGProject\\data.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(c);
			oos.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@SuppressWarnings("unchecked")
	public static void set() {
		FileInputStream fis;
		try {
			fis = new FileInputStream("C:\\Users\\stu\\Desktop\\Project1\\data.txt");
			// fis = new FileInputStream("c:\\Users\\com\\Desktop\\RPGProject\\data.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			l = (List<Character>) ois.readObject();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	public static Monster randomMonster() {
		Random rand = new Random();
		int num = rand.nextInt(10);
		if(num >= 0) 
			return new Boss();
		else 
			return new Slime();
	}
}
