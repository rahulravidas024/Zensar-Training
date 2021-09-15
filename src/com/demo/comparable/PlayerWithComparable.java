package com.demo.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class PlayerWithComparable {

	public void display(ArrayList<Player1> l) {
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
	}

	public static void main(String[] args) {
		ArrayList<Player1> list = new ArrayList<>();
		list.add(new Player1(250, "Sachin"));
		list.add(new Player1(300, "Virat"));
		list.add(new Player1(150, "Dhoni"));
		list.add(new Player1(100, "Chahal"));
		list.add(new Player1(400, "Kapildev"));
		Collections.sort(list);
		PlayerWithComparable obj = new PlayerWithComparable();
		obj.display(list);

	}

}
