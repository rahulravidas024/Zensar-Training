package com.demo.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class PlayerWithComparatorMainClass {

	public void display1(ArrayList<PlayerWithComparator> l) {
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
	}

	public static void main(String[] args) {
		ArrayList<PlayerWithComparator> list = new ArrayList<>();
		list.add(new PlayerWithComparator(250, "Sachin"));
		list.add(new PlayerWithComparator(300, "Virat"));
		list.add(new PlayerWithComparator(150, "Dhoni"));
		list.add(new PlayerWithComparator(100, "Chahal"));
		list.add(new PlayerWithComparator(400, "Kapildev"));
		Collections.sort(list, new PlayerWithComparator());
		PlayerWithComparatorMainClass obj = new PlayerWithComparatorMainClass();
		obj.display1(list);

	}

}
