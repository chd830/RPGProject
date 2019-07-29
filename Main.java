package com.project1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.sound.sampled.LineListener;
import javax.xml.stream.events.Characters;

public class Main {
	private static int ch;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		System.out.println("Game Start!!");

		Warrior warrior = null;
		String file = null;
		int choice = 0;
		FileReader fr;
		BufferedReader br;
		Object o = null;
		File f = new File("C:\\Users\\duekt\\OneDrive\\문서\\RPGProject\\warrior.txt");

		try {
			// 파일 여부 확인
			// 존재 하지 않으면
			if (!f.exists()) {
				System.out.print("1.Warrior 2.Magician 3.Archer: ");

				Character c = null;
				Monster m = new Slime();
				c.getItemByMonster(m, c.getItem());
				c.getItemByMonster(m, c.getItem());
				c.getItemByMonster(m, c.getItem());

				c.print(c);
				System.out.print("1.Attack 2.UseItem: ");
				int num = sc.nextInt();
				recur: for (int i = 0;; i++) {
					if (i % 2 == 0) {
						boolean check = true;
						do {
							if (m.getHP() == 0 || c.getHP() == 0)
								break recur;
							switch (num) {
							case 1:
								c.attackJudgement(m, c.getAttack());
								check = false;
								break;
							case 2:
								if (c.getItem().size() <= 0) {
									System.out.println("Item is null");
									break;
								}
								c.useItem(c, m, c.getItem());
								System.out.println("Have Item");
								check = false;
								break;

							}
						} while (check);
					} else {
						m.attackJudgement(c, m.getAttack());
					}
				}
				if (m.getHP() == 0) {
					c.getItemByMonster(m, c.item);
				}
				
				//전사, 마법사, 궁수 생성
				System.out.print("Please choose the character you want to create : ");
				System.out.print("1. warrior 2. magicia 3. archer : ");
				choice = sc.nextInt();

				switch (choice) {
				case 1:
					c= new Warrior();
					break;
				case 2:
					c= new Magicia();
					break;
				case 3:
					c= new Archer();
					break;
				}
			}
			// 존재 하면
			else {
				System.out.print("There is a saved file. Would you like to call me?(y/n) : ");
				char ch = (char) System.in.read();

				// 파일 불러오기
				if (ch != 'y') {
					return;
				} else {
					System.out.print("1. warrior 2. magicia 3. archer : ");
					choice = sc.nextInt();

					if (choice == 1) {
						FileInputStream fis = new FileInputStream(
								"C:\\Users\\duekt\\OneDrive\\문서\\RPGProject\\warrior.txt");
						ObjectInputStream ois = new ObjectInputStream(fis);
						List<Character> lists = (List<Character>) ois.readObject();
						System.out.println(lists);

					} else if (choice == 2) {
						

					} else {

					}
				}
			} // 파일 불러오기 종료
		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.print("1.Attack 2.UseItem : ");
		choice = sc.nextInt();

		if (choice == 1) {
			Character c = new Character();
			Slime slime = new Slime();
			Warrior warrios = new Warrior();
			slime.attack(c, 2);
			warrios.save(o);
		} else if (choice == 2) {

		} else {

		}
	}
}
