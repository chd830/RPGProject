package com.project1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
	private static int ch;

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ���۵Ǿ����ϴ�.");
		
		String file = null;
		int choice=0;
		FileReader fr;
		BufferedReader br = null;
		File f= new File("C:\\Users\\stu\\Desktop\\Project1\\warrior.txt");
		
		
		
		try {
			if(!f.exists()) {
				System.out.println("������ ĳ���Ͱ� �����ϴ�. ������ ĳ���͸� ����ּ���.");
				System.out.println("1. ���� 2. ������ 3. �ü�");
				choice =sc.nextInt();
				
				Object o;
				if(choice==1) {
					Warrior warrior = new Warrior();
				}else if(choice ==2) {
	//				Magician magician = new Magician(); 
				}else {
	//				Archer archer = new Archer();
				}
			}else {
				System.out.println("����� ������ �ֽ��ϴ�. �ҷ����ðڽ��ϱ�?(y/n)");
				char ch=(char)System.in.read();
				
				if(ch != 'y') {
					return;
				}else {
					
					System.out.println("1. ���� 2. ������ 3. �ü�");
					int cho =sc.nextInt();
					
					if(cho==1) {
						fr = new FileReader("C:\\Users\\stu\\Desktop\\Project1\\warrior.txt");
						String st;
						while((st=br.readLine())!=null) {
							System.out.println(st);
						}
					}else if(cho==2) {
						 new FileInputStream("C:\\Users\\stu\\Desktop\\Project1\\warrior.txt");
					}else {
						new FileInputStream("C:\\Users\\stu\\Desktop\\Project1\\warrior.txt");
					

					}
				}
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		System.out.println("1.���� 2.�����ۻ��");
		choice = sc.nextInt();
		
		
		if(choice==1) {
			Slime slime = new Slime();
			
		}
		
		


		
	}
}
