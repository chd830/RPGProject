package com.project1;

import java.util.*;

public interface Motion {
	public void useItem(Object o1, Object o2, List<String> item); 	//ĳ����, ����, ������
	public void getItemByMonster(Object o1, List<String> item);	//����
	public void attack(Object o1, Object o2, int attack);	//ĳ����, ����, ĳ������ ���ݷ�
	public void skill(Object o1, Object o2, int attack);	//ĳ����, ����, ĳ������ ���ݷ�
	public void attackJudgement(Object o1, Object o2, int evasion);	//ĳ����, ����, ĳ������ ȸ����
	public boolean criticalJudgement(int critical);	//ĳ������ ũ��Ƽ
	public void print(Object o);	//ĳ����
	public boolean isAlive(Object o);	//���� 
}
