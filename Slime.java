package com.project1;

import java.util.*;

public class Slime extends Monster {
	Random rand = new Random();
	
	public Slime() {
		setLevel(1);
		setHP(100);
		setAttack(10);
		setEvasion(100);
		setIsAlive(true);
		System.out.println("You met slime");
	}

<<<<<<< HEAD
	//°ø°ÝÇÏ´Â ¸Þ¼­µå
=======
	//ï¿½ï¿½ï¿½ï¿½ï¿½Ï´ï¿½ ï¿½Þ¼ï¿½ï¿½ï¿½. ï¿½ï¿½ï¿½ï¿½, Ä³ï¿½ï¿½ï¿½ï¿½, ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½Ý·ï¿½
>>>>>>> a50e3e020527f8e3417320fc564d452dd131eec9
	@Override
	public void attack(Object o1, Object o2, int attack) {
		Warrior w = (Warrior)o1;
		int cur = w.getHP();
		w.setHP(cur - attack);
		System.out.println("Warrior was attacked and became "+w.getHP()+"HP.");
		if(w.getHP() == 0) {
			isAlive(w);
		}
	}

<<<<<<< HEAD
	//°ø°ÝÀÎÁö È¸ÇÇÀÎÁö ÆÇÁ¤Ã¼Å© ¸Þ¼­µå
	@Override
	public void attackJudgement(Object o1, Object o2, int evasion) {	//È¸ÇÇ
=======
	//ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ È¸ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ ï¿½ï¿½ï¿½ï¿½Ã¼Å© ï¿½Þ¼ï¿½ï¿½ï¿½. ï¿½ï¿½ï¿½ï¿½, Ä³ï¿½ï¿½ï¿½ï¿½, ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ È¸ï¿½ï¿½
	@Override
	public void attackJudgement(Object o1, Object o2, int evasion) {
		Monster m = (Slime)o1;
		//ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½
		try {
			if(m.getStatus().equals("Iced") && count < 1) {
				count++;
				return;
			}
			else if(m.getStatus().equals("Fired")&& count < 1) {
				count++;
				System.out.println("Slime is in Fired status");
				attack(o2, m, 2);
				return;
			}
		} catch(Exception e) {
		}
		
		m.setStatus("");
		count = 0;
>>>>>>> a50e3e020527f8e3417320fc564d452dd131eec9
		Random rand = new Random();
		if(o1.getClass().getName().equals("com.project1.Warrior")) {
			Warrior w = (Warrior)o1;
			int num = rand.nextInt(100);
			num+=100;
			System.out.println(num+" : "+(100 - evasion));
			if(num >= (100 - evasion)) {
				System.out.println("È¸ÇÇ¿¡ ¼º°øÇØ¼­ Hp´Â "+w.getHP()+"ÀÔ´Ï´Ù.");
			}
			else {
				System.out.println("È¸ÇÇ½ÇÆÐ");
				this.attack(o1,o2, evasion);
			}
		}else if(o1.getClass().getName().equals("com.project1.Magician")) {
			Magician m = (Magician)o1;
			int num = rand.nextInt(100);
			num+=100;
			System.out.println(num+" : "+(100 - evasion));
			if(num >= (100 - evasion)) {
				System.out.println("È¸ÇÇ¿¡ ¼º°øÇØ¼­ Hp´Â "+m.getHP()+"ÀÔ´Ï´Ù.");
			}
			else {
				System.out.println("È¸ÇÇ½ÇÆÐ");
				this.attack(o1, o2,evasion);
			}			
		}else if(o1.getClass().getName().equals("com.project1.Archer")) {
			Archer a = (Archer)o1;
			int num = rand.nextInt(100);
			num+=100;
			System.out.println(num+" : "+(100 - evasion));
			if(num >= (100 - evasion)) {
				System.out.println("È¸ÇÇ¿¡ ¼º°øÇØ¼­ Hp´Â "+a.getHP()+"ÀÔ´Ï´Ù.");
			}
			else {
				System.out.println("È¸ÇÇ½ÇÆÐ");
				this.attack(o1, o2,evasion);
			}			
		}
<<<<<<< HEAD
=======
		attack(o2, m, c.getAttack());
	}

	@Override
	public boolean isAlive(Object o) {
		Character c = null;
		if(o.getClass().getName().equals("com.project1.Warrior")) {
			c = (Warrior)o;
			System.out.println("Warrior is dead.");
		}
		else if(o.getClass().getName().equals("com.project1.Magician")) {
			c = (Magician)o;
			System.out.println("Magician is dead.");
		}
		else {
			c = (Archer)o;
			System.out.println("Archer is dead.");
		}
		c.setIsAlive(false);
		return false;
>>>>>>> a50e3e020527f8e3417320fc564d452dd131eec9
	}
//
//	//Á×Àº°Å È®ÀÎÇÏ´Â ¸Þ¼­µå. 
//	@Override
//	public void dead(Object o) {
//		Character c = (Warrior)o;
//		System.out.println("Warrior is dead.");
//		c.setIsAlive(false);
//	}

}
