package com.project1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Character implements Motion, Serializable {
	/**
	 * Serialized error in scanner >> Need to use transient Cannot find some class
	 * >> Need to fix serialVersionUID
	 */
	private static final long serialVersionUID = 4379276376446092084L;
	private int HP;
	private int MaxHP;
	private int MP;
	private int MaxMP;
	private int attack;
	private int critical;
	private int evasion;
	private boolean isAlive;
	private boolean skill;
	List<String> item = new ArrayList<String>();

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

	public int getCritical() {
		return critical;
	}

	public void setCritical(int critical) {
		this.critical = critical;
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

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public boolean isSkill() {
		return skill;
	}
	public void setSkill(boolean skill) {
		this.skill = skill;
	}

	public List<String> getItem() {
		return item;
	}

	public void setItem(List<String> item) {
		this.item = item;
	}

	public void getItemByMonster(Object o1, List<String> item) {
		Random rand = new Random();
		Monster m = null;
		String str = "";
		int num = rand.nextInt(10);
		if (num < 3) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.print("\nGet \'Hp up\'");
			item.add("Hp up");
		} else if (num < 6) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.print("\nGet \'Mp up\'");
			item.add("Mp up");
		} else {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.print("\nGet \'Iced\'");
			item.add("Iced");
		}
		if (o1.getClass().getName().equals("com.project1.Slime")) {
			m = (Slime) o1;
			str = "Slime";

		}
		System.out.print(" from " + str + "\n");
	}

	@Override
	public void useItem(Object o1, Object o2, List<String> item) {
		String str = "";
		Character c = null;
		if (o1.getClass().getName().equals("com.project1.Archer")) {
			c = (Archer) o1;
			str = "Archer";
		} else if (o1.getClass().getName().equals("com.project1.Warrior")) {
			c = (Warrior) o1;
			str = "Warrior";
		} else {
			c = (Magician) o1;
			str = "Magician";
		}
		Scanner sc = new Scanner(System.in);

		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.print("Select Item: \t");

		try {
			Thread.sleep(300);
		} catch (Exception e) {
			// TODO: handle exception
		}

		for (int i = 0; i < item.size(); i++) {
			System.out.print((i + 1) + "." + item.get(i) + "\t : ");
		}
		int num = sc.nextInt();

		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println(item.get(num - 1) + "\' is selected");
		if (item.get(num - 1).equals("Hp up")) {
			int cur = c.getHP();
			c.setHP(cur + 10);

			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}

			System.out.println("Hp of the " + str + " is become " + cur + " to " + c.getHP());
		} else if (item.get(num - 1).equals("Mp up")) {
			int cur = c.getMP();
			c.setMP(cur + 10);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}

			System.out.println("Mp of the " + str + " is become " + cur + " to " + c.getMP());
		} else {
			if (o2.getClass().getName().equals("com.project1.Slime")) {
				Slime s = (Slime) o2;
				s.setStatus("Iced");

				try {
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
				}

				System.out.println("Slime is Iced.");
			}
			else {
				Boss b = (Boss)o2;
				b.setStatus("ICed");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
				}
				System.out.println("Boss is Iced");
			}
		}
		item.remove(num - 1);
	}

	@Override
	public void attack(Object o1, Object o2) {
		Monster m = null;
		Character c = null;
		if (o1.getClass().getName().equals("com.project1.Archer")) {
			c = (Archer) o1;
		} else if (o1.getClass().getName().equals("com.project1.Warrior")) {
			c = (Warrior) o1;
		} else {
			c = (Magician) o1;
		}
		String str = "";
		int attack = c.getAttack();
		if (o2.getClass().getName().equals("com.project1.Slime")) {
			m = (Slime) o2;
			str = "Slime";
		} else {
			m = (Boss)o2;
			str = "Boss";
		}

		if(c.isSkill()) {
			c.skill(c, m);
			attack *= 2;
		} 
		int cur = m.getHP();
		if (criticalJudgement(c.getCritical())) {
			attack *= 2;
			try {				
				Thread.sleep(500);
				System.out.println("Critical damage!");
			} catch (Exception e) {
			}
		}
		m.setHP(cur - attack);
		if (m.getHP() <= 0) {
			m.setHP(0);
		}
		try {			
			Thread.sleep(500);
			System.out.println(str + " was attacked and became " + m.getHP() + "HP.");
		} catch (Exception e) {
		}
		if (m.getHP() == 0) {
			isAlive(m);
		}
		c.setSkill(false);
	}

	@Override
	public void attackJudgement(Object o1, Object o2) {
		Random rand = new Random();
		Monster m = null;
		String str = "";
		int num = rand.nextInt(100);
		if (o2.getClass().getName().equals("com.project1.Slime")) {
			m = (Slime) o2;
			str = "Slime";

		}else if(o2.getClass().getName().equals("com.project1.Boss")) {
			m = (Boss)o2;
			str = "Boss";
		}
		if (num >= (100 - m.getEvasion())) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}

			System.out.println(str + " succeeded in evasion and became " + m.getHP() + "HP.");

			return;

		}
		attack(o1, m);   
	}

	@Override
	public boolean criticalJudgement(int critical) {
		Random rand = new Random();
		int num = rand.nextInt(100);
		if (num > (100 - critical)) {
			return true;
		}
		return false;
	}

	@Override
	public void print(Object o) {
		Character c = null;
		System.out.println();
		if(o.getClass().getName().equals("com.project1.Archer")) {
			c = (Archer)o;
			System.out.println("Archer's");
		}
		else if(o.getClass().getName().equals("com.project1.Warrior")) {
			c = (Warrior)o;
			System.out.println("Warrior's ");
		}
		else {
			c = (Magician)o;
			System.out.println("Magician's");
		}
		System.out.println("HP: " +c.getHP()+ ", MP: " +c.getMP());
		System.out.println("Attack: " +c.getAttack());
		System.out.println("Evasion: " +c.getEvasion());
		System.out.println("Critical: " +c.getCritical()+"\n");
	}

	@Override
	public void isAlive(Object o) {
		Monster c = null;
		if (o.getClass().getName().equals("com.project1.Slime")) {
			c = (Slime) o;
			System.out.println("Slime is dead.");
		}else if(o.getClass().getName().equals("com.project1.Boss")) {
			c = (Boss)o;
			System.out.println("Boss is dead.");
		}
		c.setIsAlive(false);
	}

	@Override
	public void skill(Object o1, Object o2) {
	}

	public void showStatus(Object o1, Object o2) {
		Character c = null;
		String s = "";
		if (o1.getClass().getName().equals("com.project1.Archer")) {
			c = (Archer) o1;
			s = "Archer";
		} else if (o1.getClass().getName().equals("com.project1.Warrior")) {
			c = (Warrior) o1;
			s = "Warrior";
		} else {
			c = (Magician) o1;
			s = "Magician";
		}
		Monster m = null;
		String str = "";
		int hp = c.getHP();
		int mp = c.getMP();
		if (o2.getClass().getName().equals("com.project1.Slime")) {
			m = (Slime) o2;
			str = "Slime";
		} else if (o2.getClass().getName().equals("com.project1.Boss")) {
			m = (Boss) o2;
			str = "Boss";
		}
		try {
			Thread.sleep(500);
			System.out.println("\n" + s);

			System.out.print("HP: ");
			for (int i = 0; i < c.getHP() / 10; i++) {
				System.out.print("■");
			}
			for (; hp < c.getMaxHP(); hp += 10) {
				System.out.print("□");
			}

			System.out.print("\nMP: ");
			for (int i = 0; i < c.getMP() / 10; i++) {
				System.out.print("■");
			}
			for (; mp < c.getMaxMP(); mp += 10) {
				System.out.print("□");
			}

			System.out.println("\n\n" + str);
			System.out.print("HP: ");
			for (int i = 0; i < m.getHP() / 10; i++) {
				System.out.print("■");
			}
			hp = m.getHP();
			for (; hp < m.getMaxHP(); hp += 10) {
				System.out.print("□");
			}
		} catch (Exception e) {
		}
		System.out.println("");
	}

	public void abilityRise(Character c) {
		Scanner sc = new Scanner(System.in);
		Character ch = null;
		if (c.getClass().getName().equals("com.project1.Archer")) {
			ch = (Archer) c;
		} else if (c.getClass().getName().equals("com.project1.Warrior")) {
			ch = (Warrior) c;
		} else {
			ch = (Magician) c;
		}
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.print("\nWhich ability? ");
		System.out.print("\n1.HP 2.MP 3.Attack 4.Evasion 5.Critical: ");
		int num = sc.nextInt();
		switch(num) {
		case 1:
			ch.setMaxHP(ch.getMaxHP() + 50);
			break;
		case 2:
			ch.setMaxMP(ch.getMaxMP() + 50);
			break;
		case 3:
			ch.setAttack(ch.getAttack()+20);
			break;
		case 4:
			ch.setEvasion(ch.getEvasion()+20);
			break;
		case 5:
			ch.setCritical(ch.getCritical()+20);
			break;
		}
	}
}