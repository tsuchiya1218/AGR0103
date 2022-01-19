package model;

import java.io.Serializable;

/**
 * 利用者のアカウント情報を保持するクラス
 * @author 20jy0105
 * @version 1.0
 */

public class Account implements Serializable {
	private String accountId;
	private String accountName;
	private String password;
	private String mainAddress;
	private int barcode;
	
	/**
	 * コンストラクタ
	 * @retrun void
	 */
	public Account() {}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMainAddress() {
		return mainAddress;
	}

	public void setMainAddress(String mainAddress) {
		this.mainAddress = mainAddress;
	}

	public int getBarcode() {
		return barcode;
	}

	public void setBarcode(int barcode) {
		this.barcode = barcode;
	}
	
	
}
