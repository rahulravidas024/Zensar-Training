package com.demo.innerClass;

public class Society {

	String societyName;
	private String societyRegno;
	public void showSocietyDetails() 
	{
		System.out.println("Society");
	}
	
	class Flat{
		int flatno;
		String flatArea;
		String flatOwnerName;
		
		Flat()
		{
			this.flatno = 12;
			this.flatArea = "Nagpur";
			this.flatOwnerName = "Rahul";
		}
		Flat(int fNo, String fArea, String fOwnerName)
		{
			flatno = fNo;
			flatArea = fArea;
			flatOwnerName = fOwnerName;
		}
		public void showFlatDetails()
		{
			System.out.println("Flat Number: " + flatno);
			System.out.println("Flat Area : " + flatArea);
			System.out.println("Flat Owner Name: " + flatOwnerName);
		}
	}
}
