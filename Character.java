package com.project1;

public class Character implements Motion {

	private int level;
	private int HP; //ü��
	private int MP; //����
	private int attack; //���ݷ�
	private int[] experience = {5, 10, 20, 20, 20}; //����ġ
	private int evasion; //ȸ����
	private int critical; //ġ��Ÿ��

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

	@Override
	public void print(Object o) {

	}

}
