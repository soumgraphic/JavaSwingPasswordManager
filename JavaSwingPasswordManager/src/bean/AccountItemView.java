package bean;

public class AccountItemView {
	
	String identifiantAccountItem;
	String usernameAccountItem;
	String nomCompletAccountItem;
	String passwordAccountItem;
	String etatPasswordAccountItem;
	String urlAccountItem;
	String etatUrlAccountItem;
	
	public AccountItemView(String identifiantAccountItem, String usernameAccountItem, String nomCompletAccountItem,
			String passwordAccountItem, String etatPasswordAccountItem, String urlAccountItem,
			String etatUrlAccountItem) {
		super();
		this.identifiantAccountItem = identifiantAccountItem;
		this.usernameAccountItem = usernameAccountItem;
		this.nomCompletAccountItem = nomCompletAccountItem;
		this.passwordAccountItem = passwordAccountItem;
		this.etatPasswordAccountItem = etatPasswordAccountItem;
		this.urlAccountItem = urlAccountItem;
		this.etatUrlAccountItem = etatUrlAccountItem;
	}

	public String getIdentifiantAccountItem() {
		return identifiantAccountItem;
	}

	public void setIdentifiantAccountItem(String identifiantAccountItem) {
		this.identifiantAccountItem = identifiantAccountItem;
	}

	public String getUsernameAccountItem() {
		return usernameAccountItem;
	}

	public void setUsernameAccountItem(String usernameAccountItem) {
		this.usernameAccountItem = usernameAccountItem;
	}

	public String getNomCompletAccountItem() {
		return nomCompletAccountItem;
	}

	public void setNomCompletAccountItem(String nomCompletAccountItem) {
		this.nomCompletAccountItem = nomCompletAccountItem;
	}

	public String getPasswordAccountItem() {
		return passwordAccountItem;
	}

	public void setPasswordAccountItem(String passwordAccountItem) {
		this.passwordAccountItem = passwordAccountItem;
	}

	public String getEtatPasswordAccountItem() {
		return etatPasswordAccountItem;
	}

	public void setEtatPasswordAccountItem(String etatPasswordAccountItem) {
		this.etatPasswordAccountItem = etatPasswordAccountItem;
	}

	public String getUrlAccountItem() {
		return urlAccountItem;
	}

	public void setUrlAccountItem(String urlAccountItem) {
		this.urlAccountItem = urlAccountItem;
	}

	public String getEtatUrlAccountItem() {
		return etatUrlAccountItem;
	}

	public void setEtatUrlAccountItem(String etatUrlAccountItem) {
		this.etatUrlAccountItem = etatUrlAccountItem;
	}

	@Override
	public String toString() {
		return "AccountItemView [identifiantAccountItem=" + identifiantAccountItem + ", usernameAccountItem="
				+ usernameAccountItem + ", nomCompletAccountItem=" + nomCompletAccountItem + ", passwordAccountItem="
				+ passwordAccountItem + ", etatPasswordAccountItem=" + etatPasswordAccountItem + ", urlAccountItem="
				+ urlAccountItem + ", etatUrlAccountItem=" + etatUrlAccountItem + "]";
	}

}
