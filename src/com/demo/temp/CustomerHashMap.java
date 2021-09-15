package com.demo.temp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class CustomerHashMap {
	
	int id;
	String name;
	public CustomerHashMap()
	{
		
	}

	public CustomerHashMap(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public String toString()
	{
		return "Id:  " + id + "Name: " + name;
	}
	
	public static void main(String[] args) {
			ArrayList<CustomerHashMap> l = new ArrayList<>();
			HashMap<CustomerHashMap, String> cs = new HashMap<>();
			cs.put(new CustomerHashMap(23, "Anil"), "Laptop" );
			cs.put(new CustomerHashMap(36, "Shiv"), "Mobile" );
			cs.put(new CustomerHashMap(23, "Anil"), "Laptop" );
			
			TreeMap<String, Integer> tr = new TreeMap<>();
			tr.put("Red", 2000);
			tr.put("Black", 3000);
			tr.put("Gray", 4000);
			Set<String> set1 = tr.keySet();
			Iterator<String> itr1 = set1.iterator();
			while(itr1.hasNext())
			{
				System.out.println(itr1.next());
			}
			
			
			
			Set<CustomerHashMap> set = cs.keySet();
			System.out.println(cs);
			Iterator<CustomerHashMap> itr = set.iterator();
			while(itr.hasNext())
			{
				CustomerHashMap customer =  itr.next();
				String items = cs.get(customer); 
				System.out.println();
			}
	}

}
