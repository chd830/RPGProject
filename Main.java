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
		
		System.out.println("게임이 시작되었습니다.");
		
		Warrior warrior = null;
		String file = null;
		int choice=0;
		FileReader fr;
		BufferedReader br;
		Object o = null;
		File f= new File("C:\\Users\\duekt\\OneDrive\\문서\\RPGProject\\warrior.txt");
		
		try {
			//파일 여부 확인
			//존재 하지 않으면
			if(!f.exists()) {
				System.out.println("생성할 캐릭터를 골라주세요.");
				System.out.println("1. warrior 2. magicia 3. archer");
				choice =sc.nextInt();
				
				if(choice==1) {
					warrior = new Warrior();
				}else if(choice ==2) {
//					Magician magician = new Magician(); 
				}else {
//					Archer archer = new Archer();
				}
			//존재 하면
			}else {
				System.out.println("저장된 파일이 있습니다. 불러오시겠습니까?(y/n)");
				char ch=(char)System.in.read();
				
				//파일 불러오기
				if(ch != 'y') {
					return;
				}else {
					System.out.println("1. warrior 2. magicia 3. archer");
					choice =sc.nextInt();
					
					if(choice==1) {
						FileInputStream fis = new FileInputStream("C:\\Users\\duekt\\OneDrive\\문서\\RPGProject\\warrior.txt");
						ObjectInputStream ois= new ObjectInputStream(fis);
						List<Warrior> lists=(List<Warrior>) ois.readObject();
						System.out.println(lists);
						
					}else if(choice==2) {
						
					}else {
					
					}
				}
			}//파일 불러오기 종료
		}catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println("1.공격 2.아이템사용");
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
