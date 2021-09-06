package temp;

public class Supplier {

	private int supplierId;
	private String supplierName;
	private String supplierMobile;

	Supplier() {

	}

	public void setSupplierId(int id) {
		supplierId = id;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierName(String name) {
		supplierName = name;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierMobile(String mobile) {
		supplierMobile = mobile;
	}

	public String getSupplierMobile() {
		return supplierMobile;
	}

	public void showSupplierDetails() {
		System.out.println("Supplier Id: " + supplierId);
		System.out.println("Supplier Name: " + supplierName);
		System.out.println("Supplier Mobile: " + supplierMobile);
	}

	/*
	 * Supplier(int id, String name, String mobile) { supplierId = id; supplierName
	 * = name; supplierMobile = mobile; }
	 */

}
