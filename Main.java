package com.project1;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.project1.Character;



public class Main {
<<<<<<< HEAD
	
	static List<Character> characterLists =null;
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Game Start!!.");

		Warrior warrior = null;
		Character c = null;
		String file = null;
		int choice = 0;
		FileReader fr;
		BufferedReader br;
		Object o = null;
		
		File f = new File("C:\\Users\\stu\\Desktop\\Project1\\warrior.txt");

		try {
			// 파일 존재 하지 않으면
			if (!f.exists()) {
				System.out.println("Please choose the character you want to create");
				System.out.print("1. warrior 2. magicia 3. archer");
				choice = sc.nextInt();

				//생성
				switch (choice) {
				case 1:	
					c = new Warrior();	
					c.print(c);
					characterLists.add(c);
					save();
					break;
				case 2:	
					c = new Magician();	
					c.print(c);
					break;
				case 3:	
					c = new Archer();
					c.print(c);
					break;
				}
				
				
				// 존재 하면
			} else {
				System.out.print("There is a saved file. Would you like to call me?(y/n) : ");
				char ch = (char) System.in.read();

				// 파일 불러오기
				if (ch != 'y') {
					System.out.print("1. warrior 2. magicia 3. archer");
					choice = sc.nextInt();
					
					switch (choice) {
					case 1:	
						c = new Warrior();
//						characterLists= ArrayList<Warrior>();
						c.print(c);
						break;
					case 2:	
						c = new Magician();	
						c.print(c);
						break;
					case 3:	
						c = new Archer();
						c.print(c);
						break;
=======
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
					System.out.println((i + 1) + ".Lv" + l.get(i).getLevel() +" " + l.get(i).getClass().getName().substring(13, l.get(i).getClass().getName().length()));
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

		int i = 0;
		while(m.getIsAlive() && c.getIsAlive()) {

			if(i%2 == 0) {
				c.showStatus(c, m);
				System.out.print("1.Attack 2.UseItem 3.Skill: ");
				num = sc.nextInt();
				if(m.getHP() <= 0 || c.getHP() <= 0)
					break;
				switch(num) {
				case 1:
					c.attackJudgement(c, m, c.getEvasion());
					break;
				case 2:
					try {
						if(c.getItem().size() <= 0) {
							System.out.println("Item is null");
							break;
						}
					}
					catch(Exception e) {
						System.out.println(e.toString());
>>>>>>> a50e3e020527f8e3417320fc564d452dd131eec9
					}
				} else if(ch == 'y'){

					try {
						FileInputStream fis = new FileInputStream("C:\\Users\\stu\\Desktop\\Project1\\Warrior.txt");
						ObjectInputStream ois = new ObjectInputStream(fis);
						
						characterLists=(ArrayList<Character>) ois.readObject();
						
						//출력
						Iterator<Character> it = characterLists.iterator();
						
						while(it.hasNext()) {
							Character str = it.next();
							System.out.println(str.getCritical());
						}
						
					} catch(Exception e ) {
						System.out.println(e.toString());
					}
						
				}
<<<<<<< HEAD
			} // 파일 불러오기 종료
		} catch (Exception e) {
			// TODO: handle exception
		}
		
//		Monster m = new Slime();
//
//		// 랜덤으로 아이템 생성
//		c.getItemByMonster(m, c.getItem());
//		c.getItemByMonster(m, c.getItem());
//		c.getItemByMonster(m, c.getItem());
//
//		c.print(c);
//
//		// 공격과 아이템사용 반복용 예시코드
//		recur: for (int i = 0;; i++) {
//			if (i % 2 == 0) {
//				System.out.print("1.Attack 2.UseItem: ");
//				int num = sc.nextInt();
//				// 아이템사용
//				boolean check = true;
//				do {
//					if (m.getHP() == 0 || c.getHP() == 0)
//						break recur;
//					switch (num) {
//					case 1:
//						c.attackJudgement(m, c, c.getAttack());
//						check = false;
//						break;
//					case 2:
//						if (c.getItem().size() <= 0) {
//							System.out.println("Item is null");
//							break;
//						}
//						c.useItem(c, m, c.getItem());
//						System.out.println("Have Item");
//						check = false;
//						break;
//
//					}
//				} while (check);
//			} else {
//				// 공격
//				m.attackJudgement(c, m, m.getAttack());
//			}
//		}
//		// 몬스터가 공격
//		if (m.getHP() == 0) {
//			c.getItemByMonster(m, c.item);
//		}
//	
		
	}
	
	//저장
	public static void save() throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.print("1. save 2. cancel : ");
		int num=sc.nextInt();
		
		if(num==1) {
			try {
				FileOutputStream fos = new FileOutputStream("C:\\Users\\stu\\Desktop\\Project1\\Warrior.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				oos.writeObject(characterLists);
				oos.close();
				fos.close();
			}catch (Exception e) {
				System.out.println(e.toString());
			}
		}else {
			return;
=======
			}
			else {
				m.attack(m, c, m.getAttack());
			}

			i++;
		}
		if(m.getHP() <= 0) {
			c.getItemByMonster(m, c.item);
			System.out.print("1.Save 2.Exit: ");
			num = sc.nextInt();
			try {
				if(num == 1) {
					l.add(c);
					for(int j = 0; j < l.size(); j++)
						System.out.println(l.get(j).getClass().getName());
					save(l);
				}
			} catch(Exception e ) {

			}
		}
		if(c.getHP() <= 0) {
			System.out.println("Game is end");
>>>>>>> a50e3e020527f8e3417320fc564d452dd131eec9
		}
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
