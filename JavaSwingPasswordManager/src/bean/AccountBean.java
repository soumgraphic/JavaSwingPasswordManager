package bean;

import java.sql.Date;

public class AccountBean {
	String identifiantAccount;
	String nameAccount;
	String usernameAccount;
	String passwordAccount;
	String urlAccount;
	Date createDateAccount;
	Date lastUpdateDateAccount;
	String identifiantUserAccount;
	
	public AccountBean(String identifiantAccount, String nameAccount, String usernameAccount, String passwordAccount,
			String urlAccount, Date createDateAccount, Date lastUpdateDateAccount, String identifiantUserAccount) {
		super();
		this.identifiantAccount = identifiantAccount;
		this.nameAccount = nameAccount;
		this.usernameAccount = usernameAccount;
		this.passwordAccount = passwordAccount;
		this.urlAccount = urlAccount;
		this.createDateAccount = createDateAccount;
		this.lastUpdateDateAccount = lastUpdateDateAccount;
		this.identifiantUserAccount = identifiantUserAccount;
	}

	public String getIdentifiantAccount() {
		return identifiantAccount;
	}

	public void setIdentifiantAccount(String identifiantAccount) {
		this.identifiantAccount = identifiantAccount;
	}

	public String getNameAccount() {
		return nameAccount;
	}

	public void setNameAccount(String nameAccount) {
		this.nameAccount = nameAccount;
	}

	public String getUsernameAccount() {
		return usernameAccount;
	}

	public void setUsernameAccount(String usernameAccount) {
		this.usernameAccount = usernameAccount;
	}

	public String getPasswordAccount() {
		return passwordAccount;
	}

	public void setPasswordAccount(String passwordAccount) {
		this.passwordAccount = passwordAccount;
	}

	public String getUrlAccount() {
		return urlAccount;
	}

	public void setUrlAccount(String urlAccount) {
		this.urlAccount = urlAccount;
	}

	public Date getCreateDateAccount() {
		return createDateAccount;
	}

	public void setCreateDateAccount(Date createDateAccount) {
		this.createDateAccount = createDateAccount;
	}

	public Date getLastUpdateDateAccount() {
		return lastUpdateDateAccount;
	}

	public void setLastUpdateDateAccount(Date lastUpdateDateAccount) {
		this.lastUpdateDateAccount = lastUpdateDateAccount;
	}

	public String getIdentifiantUserAccount() {
		return identifiantUserAccount;
	}

	public void setIdentifiantUserAccount(String identifiantUserAccount) {
		this.identifiantUserAccount = identifiantUserAccount;
	}
	
	
	
	
}
