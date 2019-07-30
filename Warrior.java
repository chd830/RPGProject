package com.project1;

import java.io.Serializable;
import java.util.*;

public class Warrior extends Character implements Serializable{
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();

	public Warrior() {

		setLevel(1);
		setHP(100);
		setMP(10);
		setCritical(50);
		setAttack(10);
		setEvasion(10);
		setIsAlive(true);
		System.out.println("Warrior is selected");
	}

	//캐릭터의 정보 출력 메서드
	@Override
	public void print(Object o) {
		Warrior w = (Warrior) o;
		System.out.println();
		System.out.println("Warrior's Level is: " + w.getLevel());
		System.out.println("HP: " + w.getHP() + ", MP: " + w.getMP());
		System.out.println("Attack: " + w.getAttack());
		System.out.println("Evasion: " + w.getEvasion());
		System.out.println("Critical: " + w.getCritical() + "\n");


	}


	//아이템이 있는지 확인하고 아이템을 사용하는 메서드
	@Override
	public void useItem(Object o1, Object o2, List<String> item) {
		Warrior w = (Warrior) o1;
		if (item.size() < 0) {
			System.out.println("Item is empty");
			return;
		}
		System.out.println("Select Item: ");
		for (int i = 0; i < item.size(); i++) {
			System.out.print((i + 1) + "." + item.get(i) + "\t");
		}
		int num = sc.nextInt();
		System.out.println("\'" + item.get(num - 1) + "\' is selected");
		if (item.get(num - 1).equals("Hp up")) {
			int cur = w.getHP();
			w.setHP(cur + 10);
			System.out.println("Hp of the warrior is become " + cur + " to " + w.getHP());
		} else if (item.get(num - 1).equals("Mp up")) {
			int cur = w.getMP();
			w.setMP(cur + 10);
			System.out.println("Mp of the warrior is become " + cur + " to " + w.getMP());
		} else {
			if (o2.getClass().getName().equals("com.project1.Slime")) {
				Slime s = (Slime) o2;
				s.setStatus("Iced");
				System.out.println("Slime is Iced.");
			}
		}
		item.remove(num - 1);
	}

	//공격인지 회피인지 판정체크 메서드
	@Override
	public void attackJudgement(Object o1, Object o2, int evasion) {
		//캐릭터, 몬스터, 캐릭터의 회피율
		Random rd = new Random();
		int num = rd.nextInt(100);
		Monster m =null;

		//회피성공
		//o1 : com.Project1.Warrior
		if(o1.getClass().getName().equals("com.project1.Slime")) {
			m= (Slime)o2;
		}
		else if(o1.getClass().getName().equals("com.project1.Slime2")) {
			m=(Slime)o2;
		}
		if(num>=(100-evasion)) {
			//회피 실패, 캐릭터가 공격
			System.out.println("evasion failure : "+getHP());
			
		}
		else {
			//회피 성공
			System.out.println("evasion success");
			return;
		}
		attack(o1, m, getAttack());
	}

	//크리티컬이 터지는지 확인하는 메서드(현재는 무조건 크리티컬상태)
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
	}

	//공격메서드
	@Override
	public void attack(Object o1, Object o2, int attack) {
		//슬라임만 공격당하도록 되어있음
		Monster m = (Slime)o1;
		int cur = m.getHP();
		//크리티컬이 터졌을 때 데미지가 두배로 들어가게 되어있음.
		if(criticalJudgement(((Warrior)o2).getCritical())) {
			attack *= 2;
			System.out.println("Critical damage!");
		}
		m.setHP(cur - attack);
		System.out.println("Slime was attacked and became " + m.getHP() + "HP.");
		if (m.getHP() == 0) {
			isAlive(m);
		}

	}

	//몬스터에게 확률로 아이템을 얻는 메서드
	@Override
	public void getItemByMonster(Object o1, List<String> item) {
		Monster m = null;
		//슬라임에게 아이템을 얻는다고 표시
		if(o1.getClass().getName().equals("com.project1.Slime")) {
			m = (Slime)o1;
			System.out.println("Get item from slime");
		}
		int num = rand.nextInt(10);
		System.out.println("Random Item: "+num);
		if(num < 3) {
			System.out.println("Get \'Hp up\'");
			item.add("Hp up");
		} else if (num < 6) {
			System.out.println("Get \'Mp up\'");
			item.add("Mp up");
		}
		else {
			System.out.println("Get \'Iced\'");
			item.add("Iced");
		}
	}

	//죽은거 확인하는 메서드.
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
}
