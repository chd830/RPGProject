package com.project1;
import java.util.*;

public interface Motion {
	public void useItem(Object o1, Object o2, List<String> item);
	public void getItemByMonster(Object o1, List<String> item);
	public void attack(Object o1, Object o2, int attack);
	public void attackJudgement(Object o1, Object o2, int evasion);
	public boolean criticalJudgement(int critical);
	public void print(Object o);
	public void dead(Object o);
}
