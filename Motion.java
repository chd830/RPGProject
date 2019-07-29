package com.project1;

import java.util.*;

public interface Motion {
	public void useItem(Object o1, Object o2, List<String> item); 	//캐릭터, 몬스터, 아이템
	public void getItemByMonster(Object o1, List<String> item);	//몬스터
	public void attack(Object o1, Object o2, int attack);	//캐릭터, 몬스터, 캐릭터의 공격력
	public void skill(Object o1, Object o2, int attack);	//캐릭터, 몬스터, 캐릭터의 공격력
	public void attackJudgement(Object o1, Object o2, int evasion);	//캐릭터, 몬스터, 캐릭터의 회피율
	public boolean criticalJudgement(int critical);	//캐릭터의 크리티
	public void print(Object o);	//캐릭터
	public boolean isAlive(Object o);	//몬스터 
}
