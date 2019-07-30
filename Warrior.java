package com.project1;

import java.io.Serializable;
import java.util.*;

<<<<<<< HEAD
import com.project1.Character;

public class Warrior extends Character implements Serializable {
=======
<<<<<<< HEAD
public class Warrior extends Character {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
=======
public class Warrior extends Character implements Serializable{
	
>>>>>>> 2aa29df789e1ae6d0342e796062c7b5df523ac76
	/**
	 * 
	 */
	private static final long serialVersionUID = 5716387998910136780L;
<<<<<<< HEAD
	transient Scanner sc = new Scanner(System.in);
	transient Random rand = new Random();
	
=======
>>>>>>> chong

>>>>>>> 2aa29df789e1ae6d0342e796062c7b5df523ac76
	public Warrior() {

		setLevel(1);
		setHP(100);
		setMaxHP(getHP());
		setMP(10);
		setMaxMP(getMP());
		setCritical(50);
		setAttack(10);
		setEvasion(10);
		setIsAlive(true);
		System.out.println("Warrior is selected.");
	}

	@Override
	public void print(Object o) {
		Warrior w = (Warrior) o;
		System.out.println();
		System.out.println("Warrior's Level is: " + w.getLevel());
		System.out.println("HP: " + w.getHP() + ", MP: " + w.getMP());
		System.out.println("Attack: " + w.getAttack());
		System.out.println("Evasion: " + w.getEvasion());
		System.out.println("Critical: " + w.getCritical() + "\n");
<<<<<<< HEAD
		
=======


>>>>>>> 2aa29df789e1ae6d0342e796062c7b5df523ac76
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD

	//아이템이 있는지 화깅ㄴ하고 아이템을 사용하는 메서드
>>>>>>> 2aa29df789e1ae6d0342e796062c7b5df523ac76
	@Override
	public void useItem(Object o1, Object o2, List<String> item) {
=======
	@Override
	public void useItem(Object o1, Object o2, List<String> item) {
		Scanner sc = new Scanner(System.in);
>>>>>>> chong
		Warrior w = (Warrior) o1;
		if (item.size() < 0) {
			System.out.println("Item is empty");
			return;
		}
<<<<<<< HEAD
		System.out.print("Select Item: \t");
		for(int i = 0; i < item.size(); i++) {
			System.out.print((i+1)+"."+item.get(i)+"\t");
		}
		
		int num = sc.nextInt();
		System.out.println(item.get(num - 1)+"\' is selected");
		if(item.get(num - 1).equals("Hp up")) {
=======
		System.out.println("Select Item: ");
		for (int i = 0; i < item.size(); i++) {
			System.out.print((i + 1) + "." + item.get(i) + "\t");
		}
		int num = sc.nextInt();
		System.out.println("\'" + item.get(num - 1) + "\' is selected");
		if (item.get(num - 1).equals("Hp up")) {
>>>>>>> 2aa29df789e1ae6d0342e796062c7b5df523ac76
			int cur = w.getHP();
			w.setHP(cur + 10);
			System.out.println("Hp of the warrior is become " + cur + " to " + w.getHP());
		} 
		else if (item.get(num - 1).equals("Mp up")) {
			int cur = w.getMP();
			w.setMP(cur + 10);
			System.out.println("Mp of the warrior is become " + cur + " to " + w.getMP());
		}
		else {
			if (o2.getClass().getName().equals("com.project1.Slime")) {
				Slime s = (Slime) o2;
				s.setStatus("Iced");
				System.out.println("Slime is Iced.");
			}
		}
		item.remove(num - 1);
	}

	@Override
	public void attackJudgement(Object o1, Object o2, int evasion) {
<<<<<<< HEAD
		Random rand = new Random();
		Monster m = null;
		int num = rand.nextInt(100);
<<<<<<< HEAD
		if(o2.getClass().getName().equals("com.project1.Slime")) {
			m = (Slime)o2;
=======
		if(o1.getClass().getName().equals("com.project1.Slime")) {
			m = (Slime)o1;
=======
		Random rd = new Random();
		int num = rd.nextInt(100);
		Monster m =null;

		//o1 : com.Project1.Warrior
		if(o1.getClass().getName().equals("com.project1.Slime")) {
			m= (Slime)o2;
>>>>>>> chong
		}
		else if(o1.getClass().getName().equals("com.project1.Slime2")) {
			m=(Slime)o2;
		}
		System.out.println("num: "+ num + ", evasion: "+(100-evasion));
		if(num>=(100-evasion)) {
			
>>>>>>> 2aa29df789e1ae6d0342e796062c7b5df523ac76
		}
		else {
			System.out.println("Slime evasion success");
			return;
<<<<<<< HEAD
=======
		}
<<<<<<< HEAD
		if(o2.getClass().getName().equals("com.project1.Slime")) {
			m = (Slime)o2;
>>>>>>> 2aa29df789e1ae6d0342e796062c7b5df523ac76
		}
		attack(o1, m, ((Warrior)o1).getAttack());
=======
		attack(o1, m, getAttack());
>>>>>>> chong
	}

	@Override 
	public boolean criticalJudgement(int critical) {
		Random rd = new Random();
		int num = rd.nextInt(100);
		if(num >=(100-critical)) {

			System.out.println("critical failure"+  getCritical());
			return false;

		}else{
			System.out.println("critical success" + getCritical());
			critical = getAttack()*2;
			return true;
		}
<<<<<<< HEAD
	 	return false;
	}
	
=======
<<<<<<< HEAD
		return false;
	}

	//공격메서드
=======
	}
>>>>>>> chong
>>>>>>> 2aa29df789e1ae6d0342e796062c7b5df523ac76
	@Override
	public void attack(Object o1, Object o2, int attack) {
		Monster m = (Slime)o2;
		int cur = m.getHP();
<<<<<<< HEAD

=======
>>>>>>> 2aa29df789e1ae6d0342e796062c7b5df523ac76
		if(criticalJudgement(((Warrior)o1).getCritical())) {
			attack *= 2;
			System.out.println("Critical damage!");
		}
		m.setHP(cur - attack);
<<<<<<< HEAD
		System.out.println("Slime was attacked and became "+m.getHP()+"HP.");
		if(m.getHP() <= 0) {
=======
		if(m.getHP() <= 0) {
			m.setHP(0);
		}
		System.out.println("Slime was attacked and became " + m.getHP() + "HP.");
		if (m.getHP() == 0) {
>>>>>>> 2aa29df789e1ae6d0342e796062c7b5df523ac76
			isAlive(m);
		}

	}

	@Override
	public void getItemByMonster(Object o1, List<String> item) {
		Random rand = new Random();
		Monster m = null;
<<<<<<< HEAD
	
=======
<<<<<<< HEAD
		if (o1.getClass().getName().equals("com.project1.Slime")) {
			m = (Slime) o1;
			System.out.println("Get item from slime");
		}
		//슬라임에게 아이템을 얻는다고 표시
=======
		if(o1.getClass().getName().equals("com.project1.Slime")) {
			m = (Slime)o1;
			System.out.println("Get item from slime");
		}
>>>>>>> chong
>>>>>>> 2aa29df789e1ae6d0342e796062c7b5df523ac76
		int num = rand.nextInt(10);
		System.out.println("Random Item: "+num);
		if(num < 3) {
<<<<<<< HEAD
			System.out.print("Get \'Hp up\'");
			item.add("Hp up");
		}
		else if(num < 6) {
			System.out.print("Get \'Mp up\'");
			item.add("Mp up");
		}
		else {
			System.out.print("Get \'Iced\'");
=======
			System.out.println("Get \'Hp up\'");
			item.add("Hp up");
		} else if (num < 6) {
<<<<<<< HEAD
			System.out.print("Get \'Mp up\'");
=======
			System.out.println("Get \'Mp up\'");
>>>>>>> chong
			item.add("Mp up");
		}
		else {
			System.out.println("Get \'Iced\'");
>>>>>>> 2aa29df789e1ae6d0342e796062c7b5df523ac76
			item.add("Iced");
		}
	}

	@Override
	public boolean isAlive(Object o) {
		Monster c = null;
		if (o.getClass().getName().equals("com.project1.Slime")) {
			c = (Slime) o;
			System.out.println("Slime is dead.");
		}
		c.setIsAlive(false);
		return false;
	}		
<<<<<<< HEAD
=======

>>>>>>> 2aa29df789e1ae6d0342e796062c7b5df523ac76
	public void skill(Object o1, Object o2, int attack) {
		System.out.println("�쟾�궗 �뒪�궗 �궗�슜");
		attack(o1, o2, attack*2);
	}
	
	public void showStatus(Object o1, Object o2) {
		Warrior w = (Warrior)o1;
		Monster m = null;
		String str = "";
		int hp = w.getHP();
		int mp = w.getMP();
		if(o2.getClass().getName().equals("com.project1.Slime")) {
			m = (Slime)o2;
			str = "Slime";
		}
		System.out.println("\nWarrior");
		System.out.print("HP: ");
		for(int i = 0; i < w.getHP()/10; i++) {
			System.out.print("�뼚");
		}
		for(;hp < w.getMaxHP();hp += 10) {
			System.out.print("�뼞");
		}
		System.out.print("\nMP: ");
		for(int i = 0; i < w.getMP()/10; i++) {
			System.out.print("�뼚");
		}
		for(;w.getMP() < w.getMaxMP();mp+=10) {
			System.out.print("�뼞");
		}
		System.out.println("\n\n"+str);
		System.out.print("HP: ");
		for(int i = 0; i < m.getHP()/10; i++) {
			System.out.print("�뼚");
		}
		hp = m.getHP();
		for(;hp < m.getMaxHP();hp += 10) {
			System.out.print("�뼞");
		}
		System.out.println("");
	}
<<<<<<< HEAD


=======
>>>>>>> 2aa29df789e1ae6d0342e796062c7b5df523ac76
}
