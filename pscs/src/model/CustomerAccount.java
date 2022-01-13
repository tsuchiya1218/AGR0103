package model;

public class CustomerAccount extends Account {
	
	private String barcode;

	public CustomerAccount(String accountName, String accountId, String passoword, String mailAddress,
			int userAttribute, String barcode) {
		super(accountName, accountId, passoword, mailAddress, userAttribute);
		this.barcode = barcode;
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public void pakingLocationSaving() {
		
	}
	
	public void deleteAccount() {
		
	}
	
	public void payment() {
		
	}
	
	public void changeAccountInfomation() {
		
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	
}
