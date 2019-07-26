package com.project1;

import java.util.List;

public class Warrior extends Character implements Motion {
	public Warrior() {

		setLevel(1);
		setHP(100);
		setMP(10);
		setAttack(10);
		setEvasion(10);
		setCritical(10);	
		System.out.println("전사를 선택했습니다.");
		
	}

	@Override
	public void print(Object o) {
		Warrior w = (Warrior)o;
		System.out.println();
		System.out.println("전사의 레벨: "+w.getLevel());		
		System.out.println("HP: " +w.getHP()+ ", MP: " +w.getMP());
		System.out.println("공격력: " +w.getAttack());
		System.out.println("회피율: " +w.getEvasion());
		System.out.println("치명타율: " +w.getCritical());
	}

	
	@Override
	public void takeMedicine(Object o, List<String> item) {
		// TODO Auto-generated method stub

	}

	@Override
	public void attackJudgement(Object o, int evasion) {
		// TODO Auto-generated method stub

	}

	@Override
	public void attack(Object o, int attack) {
		if(o.getClass().getName().equals("com.project1.Slime")) {
			Slime m = (Slime)o;
			int cur = m.getHP();
			m.setHP(cur - attack);
			System.out.println("슬라임의 Hp가 "+cur + "에서 "+m.getHP()+"이 되었습니다.");
<<<<<<< HEAD
		}
=======
		}		
>>>>>>> 93a2bc7b421d5e438e7666520bfb2f6524abd010
	}


}
