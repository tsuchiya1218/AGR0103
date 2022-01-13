package model;



public class CustomerAccount extends Account {
	
	public CustomerAccount(String accountName, String accountId, String passoword, String mailAddress,
			int userAttribute) {
		super(accountName, accountId, passoword, mailAddress, userAttribute);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	private String barcode;
	
	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	
}
