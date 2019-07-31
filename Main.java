package com.project1;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import com.project1.Character;

<<<<<<< HEAD
public class Main {
	static List<Character> l = null;

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
=======
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
					Thread.sleep(500);
					System.out.print("\n1.Attack 2.UseItem 3.Skill: ");
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
							try {
								Thread.sleep(500);
							} catch (Exception e) {
								// TODO: handle exception
							}
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
						try {
							Thread.sleep(500);
						} catch (Exception e) {
							// TODO: handle exception
						}
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

>>>>>>> 1c76cb2f341968c7ace7becb2912148191eab126
		String str = "";
		File f = new File("C:\\Users\\stu\\Desktop\\Project1\\data.txt");
		int num = 0;
<<<<<<< HEAD

		if (f.exists()) {
=======
		if(f.exists()) {
			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
>>>>>>> 1c76cb2f341968c7ace7becb2912148191eab126
			System.out.print("Load Data?[y/n] ");
			str = sc.next();
		}

		if (str.equals("y") || str.equals("Y")) {
			try {
				set();
<<<<<<< HEAD
				for (int i = 0; i < l.size(); i++) {
					System.out.println((i + 1) + ".Lv" + l.get(i).getLevel() + " "
							+ l.get(i).getClass().getName().substring(13, l.get(i).getClass().getName().length()));
=======
				for(int i = 0; i < l.size(); i++) {
					System.out.println((i + 1) + "." +l.get(i).getClass().getName().substring(13, l.get(i).getClass().getName().length()));
>>>>>>> 1c76cb2f341968c7ace7becb2912148191eab126
				}
			} catch (Exception e) {
				System.out.println(e.toString());
			}
<<<<<<< HEAD

			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}

			System.out.print("Select: ");
			num = sc.nextInt();
			c = l.get(num - 1);

		} else {
			l = new ArrayList();
			System.out.print("1.Warrior 2.Magician 3.Archer: ");
			num = sc.nextInt();

			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
=======
			System.out.print("Select: ");
			num = sc.nextInt();
			c = l.get(num - 1);
		}
		else {
			l = new ArrayList(); 
			System.out.print("1.Warrior 2.Magician 3.Archer: ");
			num = sc.nextInt();
>>>>>>> 1c76cb2f341968c7ace7becb2912148191eab126

			switch (num) {
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
<<<<<<< HEAD
<<<<<<< HEAD

		// Detailed data print
		c.print(c);

		Monster m = new Slime();

		while (m.getIsAlive() && c.getIsAlive()) {

			c.showStatus(c, m);

			if (m.getHP() <= 0 || c.getHP() <= 0)
				break;
			recur: do {
				try {
					Thread.sleep(1000);
					System.out.print("\n1.Attack 2.UseItem 3.Skill: ");
				} catch (Exception e) {
					// TODO: handle exception
				}

				num = sc.nextInt();
				switch (num) {
				case 1:
					c.attackJudgement(c, m);
					break recur;
				case 2:
					try {

						try {
							Thread.sleep(1000);
						} catch (Exception e) {
							// TODO: handle exception
						}
						if (c.getItem().size() <= 0) {
							System.out.println("Item is null");

							break;
						}
					} catch (Exception e) {
						System.out.println(e.toString());
					}
					c.useItem(c, m, c.getItem());
					break;
				case 3:
					c.skill(c, m);
					break recur;
				}
			} while (true);
			m.attack(m, c);

			if (m.getHP() <= 0) {
				c.getItemByMonster(m, c.item);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}

				System.out.print("1.Save 2.Exit: ");
				num = sc.nextInt();
				try {
					switch (num) {
					case 1:
						l.add(c);
						save(l);
						break;
					case 2:
						m = new Slime();
						break;
					}
				} catch (Exception e) {

				}
			}
			if (c.getHP() <= 0) {
				try {
					Thread.sleep(1000);
					System.out.println("Game is end");
				} catch (Exception e) {
					// TODO: handle exception
				}

			}
		}
=======
		game();
		if(m.getHP() <= 0) {
			c.getItemByMonster(m, c.item);
			
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
=======
		while(true) {
			game();
			if(m.getHP() <= 0) {
				c.getItemByMonster(m, c.item);
				c.getItemByMonster(m, c.item);
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
				}
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
>>>>>>> 98830d59c218577e51fed5f2c4f0faf2e379a1d1
			}
			if(c.getHP() <= 0) {
				System.out.println("Game is end");
				System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
				return;
			}
			c.abilityRise(c);
			reset(c);
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
		ch.setMaxHP(ch.getMaxHP());
		ch.setMaxMP(ch.getMaxMP());
		ch.setHP(ch.getMaxHP());
		ch.setMP(ch.getMaxMP());
>>>>>>> 1c76cb2f341968c7ace7becb2912148191eab126
	}

	public static void save(List<Character> c) {
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\stu\\Desktop\\Project1\\data.txt");
<<<<<<< HEAD
			// FileOutputStream fos = new
=======
>>>>>>> 1c76cb2f341968c7ace7becb2912148191eab126
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
<<<<<<< HEAD
=======
	public static Monster randomMonster() {
		Random rand = new Random();
		int num = rand.nextInt(10);
		if(num == 9) 
			return new Boss();
		else 
			return new Slime();
	}
>>>>>>> 1c76cb2f341968c7ace7becb2912148191eab126
}
