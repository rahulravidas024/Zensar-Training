package temp;

public class Items {


	public static void main(String[] args) {
		Inventory in = new Inventory();
		//in.setItemName("Mobile");
		//in.setItemCost(10000);
		//in.setItemNo(1);
		//in.setItemQuantity(2);
		
		//System.out.println("Item Name: " + in.getItemName());
		//System.out.println("Item No: " + in.getItemNo());
		//System.out.println("Item Cost: " + in.getItemCost());
		//System.out.println("Item Quantity: " + in.getItemQuantity());
		
		Supplier sp = new Supplier();
		sp.showSupplierDetails();
		
		in.acceptDetails(1, 10000, 2, "Mobile");
		in.displayDetails();
		in.bill();
	}

}
