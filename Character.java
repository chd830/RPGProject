package com.project1;
import java.util.*;

public class Character {
	private int level;
	private int HP;
	private int MP;
	private int attack;
	private int[] experience = {5, 10, 20, 20, 20};
	private int evasion;
	List<String> item = new ArrayList<String>();
	
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
	
}
