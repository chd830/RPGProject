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

public class Main{
	private static int ch;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception  {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ���۵Ǿ����ϴ�.");
		
		Warrior warrior = null;
		String file = null;
		int choice=0;
		FileReader fr;
		BufferedReader br;
		Object o = null;
		File f= new File("C:\\Users\\duekt\\OneDrive\\����\\RPGProject\\warrior.txt");
		
		try {
			//���� ���� Ȯ��
			//���� ���� ������
			if(!f.exists()) {
				System.out.println("������ ĳ���͸� ����ּ���.");
				System.out.println("1. warrior 2. magicia 3. archer");
				choice =sc.nextInt();
				
				if(choice==1) {
					warrior = new Warrior();
				}else if(choice ==2) {
//					Magician magician = new Magician(); 
				}else {
//					Archer archer = new Archer();
				}
			//���� �ϸ�
			}else {
				System.out.println("����� ������ �ֽ��ϴ�. �ҷ����ðڽ��ϱ�?(y/n)");
				char ch=(char)System.in.read();
				
				//���� �ҷ�����
				if(ch != 'y') {
					return;
				}else {
					System.out.println("1. warrior 2. magicia 3. archer");
					choice =sc.nextInt();
					
					if(choice==1) {
						FileInputStream fis = new FileInputStream("C:\\Users\\duekt\\OneDrive\\����\\RPGProject\\warrior.txt");
						ObjectInputStream ois= new ObjectInputStream(fis);
						List<Warrior> lists=(List<Warrior>) ois.readObject();
						System.out.println(lists);
						
					}else if(choice==2) {
						
					}else {
					
					}
				}
			}//���� �ҷ����� ����
		}catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println("1.���� 2.�����ۻ��");
		choice = sc.nextInt();
		
		if(choice==1) {
			Character c = new Character();
			Slime slime = new Slime();
			Warrior warrios= new Warrior();
			slime.attack(c, 2);
			warrios.save(o);
		}else if(choice==2) {
			
		}else {
			
		}
	}
}
