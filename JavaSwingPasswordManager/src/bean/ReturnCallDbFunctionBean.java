package bean;

public class ReturnCallDbFunctionBean {
	private int codeRetour;
	private boolean errorRetour;
	private String messageRetour;
	
	public int getCodeRetour() {
		return codeRetour;
	}
	public void setCodeRetour(int codeRetour) {
		this.codeRetour = codeRetour;
	}
	public boolean isErrorRetour() {
		return errorRetour;
	}
	public void setErrorRetour(boolean errorRetour) {
		this.errorRetour = errorRetour;
	}
	public String getMessageRetour() {
		return messageRetour;
	}
	public void setMessageRetour(String messageRetour) {
		this.messageRetour = messageRetour;
	}
}
