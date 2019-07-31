package com.project1;

import java.io.*;
import java.util.*;

import com.project1.Character;

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

			c.showStatus(c, m);
			recur: while(true) {
				if(m.getHP() <= 0 || c.getHP() <= 0)
					return;
				try {
					Thread.sleep(1000);
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
			if(m.getHP() <= 0 || c.getHP() <= 0)
				return;
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
		}
		game();
		if(m.getHP() <= 0) {
			c.getItemByMonster(m, c.item);
			c.abilityRise(c);
			reset(c);
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
		Scanner sc = new Scanner(System.in);
		Character ch = null;
		if (c.getClass().getName().equals("com.project1.Archer")) {
			ch = (Archer) c;
		} else if (c.getClass().getName().equals("com.project1.Warrior")) {
			ch = (Warrior) c;
		} else {
			ch = (Magician) c;
		}
		ch.setMaxHP(ch.getMaxHP() + 50);
		ch.setMaxMP(ch.getMaxMP() + 50);
		ch.setHP(ch.getMaxHP());
		ch.setMP(ch.getMaxMP());
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
		if(num == 9) 
			return new Boss();
		else 
			return new Slime();
	}
}
