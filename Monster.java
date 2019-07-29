package com.project1;

import java.util.List;

public class Monster implements Motion {
	private int level;
	private int HP;
	private int attack;
	private int evasion;
<<<<<<< HEAD
	private boolean isAlive;
	private String damaged;
=======
	private String status;
	private boolean isAlive;
>>>>>>> 248825b00653809bab5f07d19f820671784a918d
	
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
<<<<<<< HEAD
	
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
=======
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

>>>>>>> 248825b00653809bab5f07d19f820671784a918d
}
