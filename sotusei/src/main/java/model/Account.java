package model;

import java.io.Serializable;

/**
 * 利用者のアカウント情報を格納するスーパークラス
 * @author inagaki
 * @version 1.0
 */

public class Account implements Serializable {
	//フィールド変数
	private String accountName;
	private String accountId;
	private String password;
	private String mailAddress;
	private int userAttribute;

	//コンストラクタ
	public Account() {}

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
