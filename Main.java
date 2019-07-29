package com.project1;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1.Warrior 2.Magician 3.Archer: ");
		int num = sc.nextInt();
		Character c = null;
		switch(num) {
		case 1:
			c = new Warrior();
			break;
		case 2:
			c = new Magician();
			break;
		case 3:
			c = new Archer();
			break;
		}
		
		c.print(c);
		Monster m = new Slime();
		
//		//�������� ������ ����
		c.getItemByMonster(m, c.getItem());
		c.getItemByMonster(m, c.getItem());
		c.getItemByMonster(m, c.getItem());
		
		//���ݰ� �����ۻ�� �ݺ��� �����ڵ�
		int i = 0;
		while(m.getIsAlive() && c.getIsAlive()) {
			
			if(i%2 == 0) {
				System.out.print("1.Attack 2.UseItem: ");
				num = sc.nextInt();
				//�����ۻ��
				boolean check = true;
				do {
					if(m.getHP() == 0 || c.getHP() == 0)
						break;
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
						check = false;
						break;

					}
				} while(check);
			}
			else {
				//����
				m.attackJudgement(c, m, m.getEvasion());
			}
			i++;
		}
		//���Ͱ� ����
		if(m.getHP() == 0) {
			c.getItemByMonster(m, c.item);
		}
		i++;
	}
}

