package com.project1;

import java.util.*;

public class Warrior extends Character implements Motion {
	Scanner sc = new Scanner(System.in);
	public Warrior() {
		setLevel(1);
		setHP(100);
		setMP(10);
		setAttack(10);
		setEvasion(10);
		setAlive(true);
		System.out.println("전사를 선택했습니다.");
	}

	@Override
	public void userItem(Object o1, Object o2, List<String> item) {
		Warrior w = (Warrior)o1;
		if(item != null) {
			System.out.println("아이템을 골라주십시오.");
			for(int i = 0; i < item.size(); i++) {
				System.out.print((i+1)+"."+item.get(i)+"\t");
			}
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
			
		}
		item.remove(num-1);
	}

	@Override
	public void attackJudgement(Object o, int evasion) {
		Random rand = new Random();
		Warrior w = (Warrior)o;
		int num = rand.nextInt(100);
		num+=100;
		System.out.println(num+" : "+(100 - evasion));
		if(num >= (100 - evasion)) {
			System.out.println("회피에 성공해서 Hp는 "+w.getHP()+"입니다.");
		}
		else {
			System.out.println("회피실패");
			this.attack(o, evasion);
		}
	}

	@Override
	public void attack(Object o, int attack) {
		Slime m = (Slime)o;
		int cur = m.getHP();
		m.setHP(cur - attack);
		System.out.println("슬라임의 Hp가 "+cur + "에서 "+m.getHP()+"이 되었습니다.");
	}

	@Override
	public void getItem(Object o, List<String> item) {
		if(o.getClass().getName().equals("com.project1.Slime")) {
			System.out.println("슬라임으로 부터 아이템을 얻었습니다");
			item.add("Hp회복");
			item.add("Mp회복");
			item.add("빙결");
			this.setItem(item);
		}
//		else if() {
//			
//		}

	}

	@Override
	public void dead(Object o) {
		Warrior w = (Warrior)o;
		w.setAlive(false);
		System.out.println("전사가 죽었습니다.");
	}


}
