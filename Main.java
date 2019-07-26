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
		
		System.out.println("게임이 시작되었습니다.");
		
		String file = null;
		int choice=0;
		FileReader fr;
		BufferedReader br = null;
		File f= new File("C:\\Users\\stu\\Desktop\\Project1\\warrior.txt");
		
		
		
		try {
			if(!f.exists()) {
				System.out.println("생성된 캐릭터가 없습니다. 생성할 캐릭터를 골라주세요.");
				System.out.println("1. 전사 2. 마법사 3. 궁수");
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
				System.out.println("저장된 파일이 있습니다. 불러오시겠습니까?(y/n)");
				char ch=(char)System.in.read();
				
				if(ch != 'y') {
					return;
				}else {
					
					System.out.println("1. 전사 2. 마법사 3. 궁수");
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
		
		
		
		
		System.out.println("1.공격 2.아이템사용");
		choice = sc.nextInt();
		
		
		if(choice==1) {
			Slime slime = new Slime();
			
		}
		
		


		
	}
}
