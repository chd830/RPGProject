package com.project1;
import java.util.*;

public interface Motion {
	public void useItem(Object o1, Object o2, List<String> item);
<<<<<<< HEAD
	public void attacked(Object o1, int attack);
	public void attackJudgement(Object o1, int evasion);
	public void getItem(Object o, List<String> item);
=======
	public void getItemByMonster(Object o1, List<String> item);
	public void attack(Object o, int attack);
	public void attackJudgement(Object o, int evasion);
	public void print(Object o);
>>>>>>> 248825b00653809bab5f07d19f820671784a918d
	public void dead(Object o);
}
