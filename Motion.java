package com.project1;

import java.util.*;

public interface Motion {
	public void takeMedicine(Object o, List<String> item);
	public void attack(Object o, int attack);
	public void attackJudgement(Object o, int evasion);
	public void print(Object o);
}
