package com.project1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.xml.stream.events.Characters;

public class Warrior extends Character implements Motion {
	private static final Object Object = null;

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
		System.out.println("전사의 레벨: ");	
		w.getLevel();
		System.out.println("HP: " +w.getHP()+ ", MP: " +w.getMP());
		System.out.println("공격력: " +w.getAttack());
		System.out.println("회피율: " +w.getEvasion());
		System.out.println("치명타율: " +w.getCritical());
		
		lists.add(w);
		
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
		}
	}
}


