package com.demo.comparator;

import java.util.Comparator;

public class PlayerWithComparator implements Comparator<PlayerWithComparator> {

	int run;
	String name;

	public PlayerWithComparator() {
	}

	public PlayerWithComparator(int prun, String pname) {
		run = prun;
		name = pname;
	}

	@Override
	public String toString() {
		return "Run= " + run + " " + "Name= " + name;
	}

	@Override
	public int compare(PlayerWithComparator o1, PlayerWithComparator o2) {

		return o1.name.compareTo(o2.name);
	}

}
