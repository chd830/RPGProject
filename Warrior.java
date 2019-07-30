package com.project1;

import java.io.*;
import java.util.*;

<<<<<<< HEAD
import com.project1.Character;

public class Warrior extends Character implements Serializable {

   private static final long serialVersionUID = 5716387998910136780L;
   private static final String Warrior = null;
   transient Scanner sc = new Scanner(System.in);
   transient Random rand = new Random();
   
   public Warrior() {

      setLevel(1);
      setHP(100);
      setMaxHP(this.getHP());
      setMP(10);
      setMaxMP(this.getMaxMP());
      setCritical(100);
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
      
   }
   

   @Override
   public void useItem(Object o1, Object o2, List<String> item) {
      Warrior w = (Warrior) o1;
      if (item.size() < 0) {
         System.out.println("Item is empty");
         return;
      }
      System.out.print("Select Item: \t");
      for(int i = 0; i < item.size(); i++) {
         System.out.print((i+1)+"."+item.get(i)+"\t");
      }
      
      int num = sc.nextInt();
      System.out.println(item.get(num - 1)+"\' is selected");
      if(item.get(num - 1).equals("Hp up")) {
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
   //공격, 회피 판정
   public void attackJudgement(Object o1, Object o2, int evasion) {
      Random rand = new Random();
      Monster m = null;
      int num = rand.nextInt(100);
      if(o2.getClass().getName().equals("com.project1.Slime")) {
         m = (Slime)o2;
      }
      if(num >= (100 - evasion)) {
         System.out.println("attack failure");
         return;
      }
      attack(o1, m, ((Warrior)o1).getAttack());
      //캐릭터, 몬스터, 캐릭터 공격력
   }

   @Override 
   //크리티컬 판정
   public boolean criticalJudgement(int critical) {
=======
public class Warrior extends Character implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5716387998910136780L;

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
		System.out.println("Warrior is selected");
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


	}

	@Override
	public void useItem(Object o1, Object o2, List<String> item) {
		Scanner sc = new Scanner(System.in);
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

	@Override
	public void attackJudgement(Object o1, Object o2, int evasion) {
		Random rd = new Random();
		int num = rd.nextInt(100);
		Monster m =null;

		//o1 : com.Project1.Warrior
		if(o1.getClass().getName().equals("com.project1.Slime")) {
			m= (Slime)o2;
		}
		else if(o1.getClass().getName().equals("com.project1.Slime2")) {
			m=(Slime)o2;
		}
		if(num>=(100-evasion)) {
			System.out.println("evasion failure : "+getHP());
			
		}
		else {
			System.out.println("evasion success");
			return;
		}
		attack(o1, m, getAttack());
	}

	@Override 
	public boolean criticalJudgement(int critical) {
>>>>>>> a50e3e020527f8e3417320fc564d452dd131eec9
		Random rd = new Random();
		int num = rd.nextInt(100);
		if(num >=(100-critical)) {
			return false;	
		}else{
			System.out.println("critical success, " + "critical : "+getCritical());
			return true;
		}
<<<<<<< HEAD
   }
   
   @Override
   public void attack(Object o1, Object o2, int attack) {
      Monster m = (Slime)o2;
      int cur = m.getHP();
      if(criticalJudgement(((Warrior)o1).getCritical())) {
         attack *= 2;
         System.out.println("Critical damage!");
      }
      m.setHP(cur - attack);
      System.out.println("Slime was attacked and became "+m.getHP()+"HP.");
      if(m.getHP() <= 0) {
         isAlive(m);
      }
   }

   @Override
   public void getItemByMonster(Object o1, List<String> item) {
      Monster m = null;
   
      int num = rand.nextInt(10);
      if(num < 3) {
         System.out.print("Get \'Hp up\'");
         item.add("Hp up");
      }
      else if(num < 6) {
         System.out.print("Get \'Mp up\'");
         item.add("Mp up");
      }
      else {
         System.out.print("Get \'Iced\'");
         item.add("Iced");
      }
      if(o1.getClass().getName().equals("com.project1.Slime")) {
         m = (Slime)o1;
         System.out.print(" from slime\n");
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
   
   public void skill(Object o1, Object o2, int attack) {
      System.out.println("전사 스킬 사용");
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
         System.out.print("■");
      }
      for(;hp < w.getMaxHP();hp += 10) {
         System.out.print("□");
      }
      System.out.print("\nMP: ");
      for(int i = 0; i < w.getMP()/10; i++) {
         System.out.print("■");
      }
      for(;w.getMP() < w.getMaxMP();mp+=10) {
         System.out.print("□");
      }
      System.out.println("\n\n"+str);
      System.out.print("HP: ");
      for(int i = 0; i < m.getHP()/10; i++) {
         System.out.print("■");
      }
      hp = m.getHP();
      for(;hp < m.getMaxHP();hp += 10) {
         System.out.print("□");
      }
      System.out.println("");
   }


}
=======
	}
	@Override
	public void attack(Object o1, Object o2, int attack) {
		Monster m = (Slime)o2;
		int cur = m.getHP();
		if(criticalJudgement(((Warrior)o1).getCritical())) {
			attack *= 2;
			System.out.println("Critical damage!");
		}
		m.setHP(cur - attack);
		if(m.getHP() <= 0) {
			m.setHP(0);
		}
		System.out.println("Slime was attacked and became " + m.getHP() + "HP.");
		if (m.getHP() == 0) {
			isAlive(m);
		}

	}

	@Override
	public void getItemByMonster(Object o1, List<String> item) {
		Random rand = new Random();
		Monster m = null;
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

	public void skill(Object o1, Object o2, int attack) {
		System.out.println("��ų�� ����߽��ϴ�.");
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
			System.out.print("■");
		}
		for(;hp < w.getMaxHP();hp += 10) {
			System.out.print("□");
		}
		System.out.print("\nMP: ");
		for(int i = 0; i < w.getMP()/10; i++) {
			System.out.print("■");
		}
		for(;w.getMP() < w.getMaxMP();mp+=10) {
			System.out.print("□");
		}
		System.out.println("\n\n"+str);
		System.out.print("HP: ");
		for(int i = 0; i < m.getHP()/10; i++) {
			System.out.print("■");
		}
		hp = m.getHP();
		for(;hp < m.getMaxHP();hp += 10) {
			System.out.print("□");
		}
		System.out.println("");
	}
}
>>>>>>> a50e3e020527f8e3417320fc564d452dd131eec9
