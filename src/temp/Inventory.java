package temp;

public class Inventory {
	static float serviceTax = 18.5f;
	private int itemNo, itemCost, itemQuantity;
	private String itemName;

	public void setItemNo(int iNum) {
		itemNo = iNum;
	}

	public int getItemNo() {
		return itemNo;
	}

	public void setItemCost(int iCost) {
		itemCost = iCost;
	}

	public int getItemCost() {
		return itemCost;
	}

	public void setItemQuantity(int iQuantity) {
		itemQuantity = iQuantity;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemName(String iName) {
		itemName = iName;
	}

	public String getItemName() {
		return itemName;
	}

	static void updateServiceTax(float tax) {
		serviceTax = 25.00f;
	}

	public void acceptDetails(int iNum, int iCost, int iQuantity, String iName) {
		itemNo = iNum;
		itemCost = iCost;
		itemQuantity = iQuantity;
		itemName = iName;
	}

	public void displayDetails() {
		System.out.println("Item Number is: " + itemNo);
		System.out.println("Item Name is: " + itemName);
		System.out.println("Item Cost is: " + itemCost);
		System.out.println("Item Quantity is: " + itemQuantity);
	}

	public void bill() {
		float calculateBill = itemCost * itemQuantity;
		float calculateServiceTax = (calculateBill * serviceTax) / 100;
		float total = calculateServiceTax + calculateBill;
		System.out.println("Total Bill is: " + total);
	}
}
