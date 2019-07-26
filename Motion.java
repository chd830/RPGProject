package com.project1;
import java.util.*;

public interface Motion {
	public void useItem(Object o1, Object o2, List<String> item);
	public void attacked(Object o1, int attack);
	public void attackJudgement(Object o1, int evasion);
	public void getItem(Object o, List<String> item);
	public void dead(Object o);
}
