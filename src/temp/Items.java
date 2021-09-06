package temp;
import java.util.Scanner;
public class Items {

	public static void main(String[] args) {
//		Inventory in = new Inventory();
		// in.setItemName("Mobile");
		// in.setItemCost(10000);
		// in.setItemNo(1);
		// in.setItemQuantity(2);

		// System.out.println("Item Name: " + in.getItemName());
		// System.out.println("Item No: " + in.getItemNo());
		// System.out.println("Item Cost: " + in.getItemCost());
		// System.out.println("Item Quantity: " + in.getItemQuantity());
		
		Inventory iv[] = new Inventory[5];
		Inventory obj = new Inventory();
		obj.acceptDetails(1, 10000, 2, "Laptop");
		iv[0] = obj;
		obj.acceptDetails(2, 20000, 2, "Mobile");
		iv[1] = obj;
		obj.acceptDetails(3, 30000, 2, "TV");
		iv[2] = obj;
		obj.acceptDetails(4, 40000, 2, "Fridge");
		iv[3] = obj;
		obj.acceptDetails(5, 50000, 2, "Printer");
		iv[4] = obj;
		for(int i=0; i<iv.length; i++)
		{
//			iv[i].acceptDetails(1, 100000, 2, "Laptop");
//			System.out.println(iv[i]);
			
			iv[i].displayDetails();
			System.out.println("____________________________");
		}
		

//		Supplier sp = new Supplier();
//		sp.showSupplierDetails();
//
//		in.acceptDetails(1, 10000, 2, "Mobile");
//		in.displayDetails();
//		in.bill();
	}

}
