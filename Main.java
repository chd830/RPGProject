package com.project1;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.project1.Character;



public class Main {
	
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
			// ���� ���� ���� ������
			if (!f.exists()) {
				System.out.println("Please choose the character you want to create");
				System.out.print("1. warrior 2. magicia 3. archer");
				choice = sc.nextInt();

				//����
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
				
				
				// ���� �ϸ�
			} else {
				System.out.print("There is a saved file. Would you like to call me?(y/n) : ");
				char ch = (char) System.in.read();

				// ���� �ҷ�����
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
					}
				} else if(ch == 'y'){

					try {
						FileInputStream fis = new FileInputStream("C:\\Users\\stu\\Desktop\\Project1\\Warrior.txt");
						ObjectInputStream ois = new ObjectInputStream(fis);
						
						characterLists=(ArrayList<Character>) ois.readObject();
						
						//���
						Iterator<Character> it = characterLists.iterator();
						
						while(it.hasNext()) {
							Character str = it.next();
							System.out.println(str.getCritical());
						}
						
					} catch(Exception e ) {
						System.out.println(e.toString());
					}
						
				}
			} // ���� �ҷ����� ����
		} catch (Exception e) {
			// TODO: handle exception
		}
		
//		Monster m = new Slime();
//
//		// �������� ������ ����
//		c.getItemByMonster(m, c.getItem());
//		c.getItemByMonster(m, c.getItem());
//		c.getItemByMonster(m, c.getItem());
//
//		c.print(c);
//
//		// ���ݰ� �����ۻ�� �ݺ��� �����ڵ�
//		recur: for (int i = 0;; i++) {
//			if (i % 2 == 0) {
//				System.out.print("1.Attack 2.UseItem: ");
//				int num = sc.nextInt();
//				// �����ۻ��
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
//				// ����
//				m.attackJudgement(c, m, m.getAttack());
//			}
//		}
//		// ���Ͱ� ����
//		if (m.getHP() == 0) {
//			c.getItemByMonster(m, c.item);
//		}
//	
		
	}
	
	//����
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
		}
	}
}
