package com.project1;
<<<<<<< HEAD
import java.io.*;
import java.util.*;

import com.project1.Character;
=======
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
>>>>>>> a50e3e020527f8e3417320fc564d452dd131eec9

public class Character implements Motion, Serializable {
	private int level;
	private int HP;
	private int MP;
	private int attack;
	private int[] experience = {5, 10, 20, 20, 20};
	private int critical;
	private int evasion;
	private boolean isAlive;
	List<String> item = new ArrayList<String>();
<<<<<<< HEAD
	
//	List<Character> characterLists = new ArrayList<>();
=======
>>>>>>> a50e3e020527f8e3417320fc564d452dd131eec9
	
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
	@Override
	public void useItem(Object o1, Object o2, List<String> item) {
	}
	@Override
	public void attack(Object o1, Object o2,int attack) {
	}
	@Override
	public void attackJudgement(Object o1, Object o2, int evasion) {
	}
	@Override
	public void print(Object o) {
	}

	public boolean criticalJudgement(int critical) {
		return false;
	}

	@Override
	public void skill(Object o1, Object o2, int attack) {
	}
	@Override
	public boolean isAlive(Object o) {
		return false;
	}
	
	

}
