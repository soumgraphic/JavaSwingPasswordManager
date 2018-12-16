package bean;

import java.sql.Date;

public class UserBean {
	
	String identifiantUser;
	String nameUser;
	String emailUser;
	String passwordUser;
	String createDateUser;
	String lastUpdateDateUser;
	ReturnCallDbFunctionBean callDbFunctionBean;
	
	public UserBean(String identifiantUser, String nameUser, String emailUser, String passwordUser, String createDateUser,
			String lastUpdateDateUser, ReturnCallDbFunctionBean callDbFunctionBean) {
		super();
		this.identifiantUser = identifiantUser;
		this.nameUser = nameUser;
		this.emailUser = emailUser;
		this.passwordUser = passwordUser;
		this.createDateUser = createDateUser;
		this.lastUpdateDateUser = lastUpdateDateUser;
		this.callDbFunctionBean = callDbFunctionBean;
	}
	
	public UserBean(String nameUser, String emailUser, String passwordUser, ReturnCallDbFunctionBean callDbFunctionBean) {
		super();
		this.nameUser = nameUser;
		this.emailUser = emailUser;
		this.passwordUser = passwordUser;
		this.callDbFunctionBean = callDbFunctionBean;
	}
	
	public UserBean(String nameUser, String emailUser, String passwordUser) {
		super();
		this.nameUser = nameUser;
		this.emailUser = emailUser;
		this.passwordUser = passwordUser;
	}
	
	public UserBean() {
		
	}

	public String getIdentifiantUser() {
		return identifiantUser;
	}

	public void setIdentifiantUser(String identifiantUser) {
		this.identifiantUser = identifiantUser;
	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

	public String getEmailUser() {
		return emailUser;
	}

	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}

	public String getPasswordUser() {
		return passwordUser;
	}

	public void setPasswordUser(String passwordUser) {
		this.passwordUser = passwordUser;
	}

	public String getCreateDateUser() {
		return createDateUser;
	}

	public void setCreateDateUser(String createDateUser) {
		this.createDateUser = createDateUser;
	}

	public String getLastUpdateDateUser() {
		return lastUpdateDateUser;
	}

	public void setLastUpdateDateUser(String lastUpdateDateUser) {
		this.lastUpdateDateUser = lastUpdateDateUser;
	}

	public ReturnCallDbFunctionBean getCallDbFunctionBean() {
		return callDbFunctionBean;
	}

	public void setCallDbFunctionBean(ReturnCallDbFunctionBean callDbFunctionBean) {
		this.callDbFunctionBean = callDbFunctionBean;
	}

	@Override
	public String toString() {
		return "UserBean [identifiantUser=" + identifiantUser + ", nameUser=" + nameUser + ", emailUser=" + emailUser
				+ ", createDateUser=" + createDateUser + ", lastUpdateDateUser=" + lastUpdateDateUser + "]";
	}

	/*
	@Override
	public String toString() {
		return "UserBean [identifiantUser=" + identifiantUser + ", nameUser=" + nameUser + ", emailUser=" + emailUser
				+ ", passwordUser=" + passwordUser + ", createDateUser=" + createDateUser + ", lastUpdateDateUser="
				+ lastUpdateDateUser + ", callDbFunctionBean=" + callDbFunctionBean + 
				"[" + "callDbFunctionBean.codeRetour" + callDbFunctionBean.getCodeRetour() +
				"callDbFunctionBean.errorRetour" + callDbFunctionBean.isErrorRetour() +
				"callDbFunctionBean.messageRetour" + callDbFunctionBean.getMessageRetour() +
				"]";
	}
	*/
	

	

	
	
}
