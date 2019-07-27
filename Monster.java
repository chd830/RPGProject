package com.project1;

import java.util.List;

public class Monster implements Motion {
	private int level;
	private int HP;
	private int attack;
	private int evasion;
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
	public boolean getIsAl() {
		return isAlive;
	}
	public void setIsAlive(boolean isAlive) {
		this.isAlive = isAlive;
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
	@Override
	public void useItem(Object o1, Object o2, List<String> item) {
	}
	@Override
	public void getItemByMonster(Object o1, List<String> item) {
		// TODO Auto-generated method stub
		
	}

}
