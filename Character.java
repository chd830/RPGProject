package com.project1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Character implements Motion, Serializable {
	/**
	 * Serialized error in scanner >> Need to use transient
	 * Cannot find some class >> Need to fix serialVersionUID
	 */
	private static final long serialVersionUID = 4379276376446092084L;
	private int level;
	private int HP;
	private int MaxHP;
	private int MP;
	private int MaxMP;
	private int attack;
	private int[] experience = {5, 10, 20, 20, 20};
	private int critical;
	private int evasion;
	private boolean isAlive;
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

	public int getMaxHP() {
		return MaxHP;
	}
	public void setMaxHP(int maxHP) {
		MaxHP = maxHP;
	}
	
	public int getMP() {
		return MP;
	}
	public void setMP(int mP) {
		MP = mP;
	}

	public int getMaxMP() {
		return MaxMP;
	}
	public void setMaxMP(int maxMP) {
		MaxMP = maxMP;
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
	public void attack(Object o1, Object o2, int attack) {
	}
	@Override
	public void attackJudgement(Object o1, Object o2, int evasion) {
	}
	@Override
	public boolean criticalJudgement(int critical) {
		return false;
	}
	@Override
	public void print(Object o) {
	}
	@Override
	public boolean isAlive(Object o) {
		return false;
	}
	@Override
	public void skill(Object o1, Object o2, int attack) {
	}
	
	public void showStatus(Object o1, Object o2) {
	}
	transient List<Character> characterList = new ArrayList();
	

}
