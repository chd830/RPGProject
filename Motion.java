package com.project1;
import java.util.*;

public interface Motion {
	public void userItem(Object o1, Object o2, List<String> item);
	public void attack(Object o, int attack);
	public void attackJudgement(Object o, int evasion);
	public void getItem(Object o, List<String> item);
	public void dead(Object o);
}
