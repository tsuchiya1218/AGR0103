package model;

public class CustomerAccount extends Account{

	private String barcode;

	public CustomerAccount() {}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	
}
