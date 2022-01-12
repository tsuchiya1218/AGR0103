package model;

public class Account {
	//フィールド変数
	private String accountName;
	private String accountId;
	private String passoword;
	private String mailAddress;
	private int userAttribute;
	
	//コンストラクタ
	public Account(String accountName, String accountId, String passoword, String mailAddress, int userAttribute) {
		super();
		this.accountName = accountName;
		this.accountId = accountId;
		this.passoword = passoword;
		this.mailAddress = mailAddress;
		this.userAttribute = userAttribute;
	}
	
	//アクセサ
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getPassoword() {
		return passoword;
	}
	public void setPassoword(String passoword) {
		this.passoword = passoword;
	}
	public String getMailAddress() {
		return mailAddress;
	}
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}
	public int getUserAttribute() {
		return userAttribute;
	}
	public void setUserAttribute(int userAttribute) {
		this.userAttribute = userAttribute;
	}	
	
}
