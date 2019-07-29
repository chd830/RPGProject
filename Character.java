package com.project1;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

public class Character {
	private int level;
	private int HP;
	private int MP;
	private int attack;
	private int[] experience = {5, 10, 20, 20, 20};
	private int evasion;
	private int critical;
	List<String> item = new ArrayList<String>();
	List<Warrior> lists=new ArrayList<>();
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}

	public int getHP() {
		return HP;
	}
	public void setHP(int hP) {
		HP = hP;
	}

	public int getMP() {
		return MP;
	}
	public void setMP(int mP) {
		MP = mP;
	}

	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getEvasion() {
		return evasion;
	}
	public void setEvasion(int evasion) {
		this.evasion = evasion;
	}	
	
	public int getCritical() {
		return critical;
	}
	public void setCritical(int critical) {
		this.critical = critical;
	}
	
	public int[] getExperience() {
		return experience;
	}
	public void setExperience(int[] experience) {
		this.experience = experience;
	}
	
	public List<String> getItem() {
		return item;
	}
	public void setItem(List<String> item) {
		this.item = item;
	}
	public void attack(Object o) {
	}
	
	//저장
	public void save(Object o) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 저장 2. 취소");
		int num=sc.nextInt();
		if(num==1) {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\duekt\\OneDrive\\문서\\RPGProject\\warrior.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(lists);
			oos.close();
			fos.close();
		}
	}
}
