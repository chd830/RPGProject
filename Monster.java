package com.project1;

public class Monster  implements Motion {
	private int level;
	private int HP;
	private int attack;
	private int evasion;
	
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
	@Override
	public void attack(Object o, int attack) {
	}

	@Override
	public void attackJudgement(Object o, int evasion) {
	}
	@Override
	public void print(Object o) {
	}
	
}
