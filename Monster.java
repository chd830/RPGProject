package com.project1;

import java.util.List;

public class Monster implements Motion {
	private int level;
	private int HP;
	private int attack;
	private int evasion;
	private boolean isAlive;
	private String damaged;
	
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
	
	public boolean isAlive() {
		return isAlive;
	}
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	public String getDamaged() {
		return damaged;
	}
	public void setDamaged(String damaged) {
		this.damaged = damaged;
	}
	@Override
	public void useItem(Object o1, Object o2, List<String> item) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void attacked(Object o1, int attack) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void attackJudgement(Object o1, int evasion) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getItem(Object o, List<String> item) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void dead(Object o) {
		// TODO Auto-generated method stub
		
	}
}
