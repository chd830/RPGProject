package com.project1;

public class Character implements Motion {
	private int level;
	private int HP;
	private int MP;
	private int attack;
	private int[] experience = {5, 10, 20, 20, 20};
	private int evasion;
	private int critical; //치명타율
	
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
	
	@Override
	public void attack(Object o, int attack) {
		System.out.println("");
	}
	@Override
	public void attackJudgement(Object o, int evasion) {
		
	}
	
}
