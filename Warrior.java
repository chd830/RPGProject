package com.project1;

import java.util.*;

public class Warrior extends Character {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	public Warrior() {
		setLevel(1);
		setHP(100);
		setMP(10);
		setCritical(10);
		setAttack(10);
		setEvasion(10);
		setAlive(true);
		System.out.println("전사를 선택했습니다.");
	}

	@Override
	public void useItem(Object o1, Object o2, List<String> item) {
		Warrior w = (Warrior)o1;
		if(item.size() < 1) {
			System.out.println("아이템이 없습니다.");
			return;
		}
		System.out.println("아이템을 골라주십시오.");
		for(int i = 0; i < item.size(); i++) {
			System.out.print((i+1)+"."+item.get(i)+"\t");
		}
		int num = sc.nextInt();
		if(item.get(num-1).equals("Hp회복")) {
			int cur = w.getHP();
			w.setHP(cur+10);
			System.out.println("전사의 hp가 "+cur+"에서 "+w.getHP()+"가 되었습니다.");
		}
		else if(item.get(num-1).equals("Mp회복")) {
			int cur = w.getMP();
			w.setMP(cur+10);
			System.out.println("전사의 mp가 "+cur+"에서 "+w.getMP()+"가 되었습니다.");
		}
		else {
			if(o2.getClass().getName().equals("com.project1.Slime")) {
				Slime s = (Slime)o2;
				System.out.println("슬라임이 "+item.get(num-1)+"상태가 되었습니다.");
				s.setDamaged("빙결");
			}
		}
		item.remove(num-1);
	}

	@Override
	public void attackJudgement(Object o1, int evasion) {
		Random rand = new Random();
		Slime w = (Slime)o1;
		int num = rand.nextInt(100);
		if(num >= (100 - evasion)) {
			System.out.println("슬라임이 회피에 성공해서 Hp는 "+w.getHP()+"입니다.");
		}
		else {
			this.attacked(o1, evasion);
		}
	}

	@Override
	public void attacked(Object o1, int attack) {
		Monster m = null;
		if(o1.getClass().getName().equals("com.project1.Slime"))
			m = (Slime)o1;
		if(this.getHP() == 0)
			dead(this);
		int cur = m.getHP();
		m.setHP(cur - attack);
		System.out.println("슬라임의 Hp가 "+cur + "에서 "+m.getHP()+"이 되었습니다.");
		if(m.getHP() == 0) 
			dead(m);
	}

	@Override
	public void getItem(Object o, List<String> item) {
		if(o.getClass().getName().equals("com.project1.Slime")) {
			System.out.println("슬라임으로 부터 아이템을 얻었습니다");

		}
		//		else if() {
		//			
		//		}
		int num = rand.nextInt(10);
		if(num < 3) {
			item.add("Hp회복");
			System.out.println("Hp회복 아이템을 얻었습니다.");
		}
		else if(num < 6) {
			item.add("Mp회복");
			System.out.println("Mp회복 아이템을 얻었습니다.");
		}
		else { 
			item.add("빙결");
			System.out.println("빙결 아이템을 얻었습니다.");
		}
		this.setItem(item);
	}

	@Override
	public void dead(Object o) {
		Monster c = null;
		if(o.getClass().getName().equals("com.project1.Slime")) {
			c = (Slime)o;
			c.setAlive(false);
			System.out.println("슬라임이 죽었습니다.");
		}
	}


}
