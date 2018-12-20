package bean;

import java.sql.Date;

public class AccountBean {
	String identifiantAccount;
	String nameAccount;
	String usernameAccount;
	String passwordAccount;
	String urlAccount;
	String createDateAccount;
	String lastUpdateDateAccount;
	UserBean userBean;
	ReturnCallDbFunctionBean callDbFunctionBean;
	
	public AccountBean(String identifiantAccount, String nameAccount, String usernameAccount, String passwordAccount,
			String urlAccount, String createDateAccount, String lastUpdateDateAccount, UserBean userBean,
			ReturnCallDbFunctionBean callDbFunctionBean) {
		super();
		this.identifiantAccount = identifiantAccount;
		this.nameAccount = nameAccount;
		this.usernameAccount = usernameAccount;
		this.passwordAccount = passwordAccount;
		this.urlAccount = urlAccount;
		this.createDateAccount = createDateAccount;
		this.lastUpdateDateAccount = lastUpdateDateAccount;
		this.userBean = userBean;
		this.callDbFunctionBean = callDbFunctionBean;
	}

	public AccountBean(String nameAccount, String usernameAccount, String passwordAccount,
			String urlAccount, UserBean userBean) {
		super();
		this.nameAccount = nameAccount;
		this.usernameAccount = usernameAccount;
		this.passwordAccount = passwordAccount;
		this.urlAccount = urlAccount;
		this.userBean = userBean;
	}
	
	public AccountBean(String identifiantAccount, String nameAccount, String usernameAccount, String passwordAccount,
			String urlAccount, UserBean userBean) {
		super();
		this.identifiantAccount = identifiantAccount;
		this.nameAccount = nameAccount;
		this.usernameAccount = usernameAccount;
		this.passwordAccount = passwordAccount;
		this.urlAccount = urlAccount;
		this.userBean = userBean;
	}
	
	public AccountBean(UserBean userBean) {
		super();
		this.userBean = userBean;
	}
	
	public AccountBean() {
		
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

	public String getCreateDateAccount() {
		return createDateAccount;
	}

	public void setCreateDateAccount(String createDateAccount) {
		this.createDateAccount = createDateAccount;
	}

	public String getLastUpdateDateAccount() {
		return lastUpdateDateAccount;
	}

	public void setLastUpdateDateAccount(String lastUpdateDateAccount) {
		this.lastUpdateDateAccount = lastUpdateDateAccount;
	}

	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}

	public ReturnCallDbFunctionBean getCallDbFunctionBean() {
		return callDbFunctionBean;
	}

	public void setCallDbFunctionBean(ReturnCallDbFunctionBean callDbFunctionBean) {
		this.callDbFunctionBean = callDbFunctionBean;
	}

	@Override
	public String toString() {
		return "AccountBean [identifiantAccount=" + identifiantAccount + ", nameAccount=" + nameAccount
				+ ", usernameAccount=" + usernameAccount + ", passwordAccount=" + passwordAccount + ", urlAccount="
				+ urlAccount + ", createDateAccount=" + createDateAccount + ", lastUpdateDateAccount="
				+ lastUpdateDateAccount + ", getUserBean()=" + getUserBean().getIdentifiantUser() + ", getCallDbFunctionBean()="
				+ getCallDbFunctionBean().toString() + "]";
	}

	

	
	
	
	
	
	
	
}
