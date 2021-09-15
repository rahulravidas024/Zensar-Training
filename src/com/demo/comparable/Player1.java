package com.demo.comparable;

public class Player1 implements Comparable<Player1> {

	int run;
	String name;

	public Player1() {
		// run =0;
		// name = null;
	}

	public Player1(int prun, String pname) {
		run = prun;
		name = pname;
	}

	@Override
	public String toString() {
		return "Run= " + run + " " + "Name= " + name;
	}

	@Override
	public int compareTo(Player1 o) {

		return this.run - o.run;
	}

}
