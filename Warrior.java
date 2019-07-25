package com.Project1;

public class Warrior extends Character {
	public Warrior() {
		setLevel(1);
		setHP(100);
		setMP(10);
		setAttack(10);
		setEvasion(10);
		System.out.println("전사를 선택했습니다.");
	}

	@Override
	public void attack(Object o, int attack) {
		if(o.getClass().getName().equals("com.Project1.Slime")) {
			Slime m = (Slime)o;
			int cur = m.getHP();
			m.setHP(cur - attack);
			System.out.println("슬라임의 Ht가 "+cur + "에서 "+m.getHP()+"이 되었습니다.");
		}
	}


}
