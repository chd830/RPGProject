package com.project1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

public class Character implements Motion{
	private int level;
	private int HP;
	private int MP;
	private int attack;
	private int[] experience = {5, 10, 20, 20, 20};
	private int critical;
	private int evasion;
	private boolean isAlive;
	List<String> item = new ArrayList<String>();
	List<String> lists = new ArrayList<>();
	
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
	
	public boolean getIsAlive() {
		return isAlive;
	}
	public void setIsAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	public int getCritical() {
		return critical;
	}
	public void setCritical(int critical) {
		this.critical = critical;
	}
	
	public boolean isAlive() {
		return isAlive;
	}
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
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
	public void getItemByMonster(Object o1, List<String> item) {
	}
	
	//저장
	public void save(Object o) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1. save 2. cancel : ");
		int num=sc.nextInt();
		if(num==1) {
			
			FileOutputStream fos = new FileOutputStream("C:\\Users\\duekt\\OneDrive\\문서\\RPGProject\\warrior.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(lists);
			oos.close();
			fos.close();
		}
	}
	
	@Override
	public void useItem(Object o1, Object o2, List<String> item) {
	}
	@Override
	public void attack(Object o, int attack) {
	}
	@Override
	public void attackJudgement(Object o, int evasion) {
	}
	@Override
	public void print(Object o) {
	}
	@Override
	public void dead(Object o) {
	}
}
