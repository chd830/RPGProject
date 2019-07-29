package com.project1;

import java.io.*;
import java.util.*;

public class Monster implements Motion, Serializable {
	private int level;
	private int HP;
	private int attack;
	private int evasion;
	private String status;
	private boolean isAlive;
	
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public boolean getIsAl() {
		return isAlive;
	}
	public void setIsAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	@Override
	public void print(Object o) {
	}
	@Override
	public void dead(Object o) {
	}
	@Override
	public void useItem(Object o1, Object o2, List<String> item) {
	}
	@Override
	public void getItemByMonster(Object o1, List<String> item) {
	}
	@Override
	public boolean criticalJudgement(int critical) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void attack(Object o1, Object o2, int attack) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void attackJudgement(Object o1, Object o2, int evasion) {
		// TODO Auto-generated method stub
		
	}
}
