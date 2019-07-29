package com.project1;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1.Warrior 2.Magician 3.Archer: ");

		//Character, Monster기준으로 자식클래스 생성
		Character c = new Warrior();
		Monster m = new Slime();
		
		//랜덤으로 아이템 생성
		c.getItemByMonster(m, c.getItem());
		c.getItemByMonster(m, c.getItem());
		c.getItemByMonster(m, c.getItem());
		
		c.print(c);
		
		//공격과 아이템사용 반복용 예시코드
		recur:for(int i = 0; ; i++) {
			if(i%2 == 0) {
				System.out.print("1.Attack 2.UseItem: ");
				int num = sc.nextInt();
				//아이템사용
				boolean check = true;
				do {
					if(m.getHP() == 0 || c.getHP() == 0)
						break recur;
					switch(num) {
					case 1:
						c.attackJudgement(m, c, c.getAttack());
						check = false;
						break;
					case 2:
						if(c.getItem().size() <= 0) {
							System.out.println("Item is null");
							break;
						}
						c.useItem(c, m, c.getItem());
						System.out.println("Have Item");
						check = false;
						break;

					}
				} while(check);
			}
			else {
				//공격
				m.attackJudgement(c, m, m.getAttack());
			}
		}
		//몬스터가 공격
		if(m.getHP() == 0) {
			c.getItemByMonster(m, c.item);
		}
	}
}

