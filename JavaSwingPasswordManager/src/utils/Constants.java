package utils;

public class Constants {
	
	public static final String SECRET_KEY = "qUmLBxQ9{d5j.%]D*`";
	public static final String JDBC_DRIVER_NAME = "org.sqlite.JDBC";
	public static final String DB_PATH = "pwd_manager.db";
	
	/*
	 * Constante de la table User
	 */
	public static final String TABLE_PM_USER = "PM_USER";
	public static final String U_ID = "U_ID";
	public static final String U_NAME = "U_NAME";
	public static final String U_EMAIL = "U_EMAIL";
	public static final String U_PASSWORD = "U_PASSWORD";
	public static final String U_CREATE_DATE = "U_CREATE_DATE";
	public static final String U_LAST_UPDATE = "U_LAST_UPDATE";
	
	/*
	 * Constante de la table account
	 */
	public static final String TABLE_PM_ACCOUNT = "PM_ACCOUNT";
	public static final String A_ID = "A_ID";
	public static final String A_NAME = "A_NAME";
	public static final String A_USERNAME = "A_USERNAME";
	public static final String A_PASSWORD = "A_PASSWORD";
	public static final String A_URL = "A_URL";
	public static final String A_CREATE_DATE = "A_CREATE_DATE";
	public static final String A_LAST_UPDATE = "A_LAST_UPDATE";
	public static final String PM_USER_U_ID = "PM_USER_U_ID";
	
	/*
	 * Constante des retour de l'appel de la Base de donnée.
	 */
	public static final int COMPLETED_SUCCESSFULLY = 0;
	public static final int NOT_FOUND = 20;
	public static final int PASSWORD_ERROR = 25;
	public static final int UNKNOW_ERROR = 30;
	public static final int EMAIL_EXIST = 35;
	public static final int USER_ID_NOT_EXIST = 40;
	public static final int ACCOUNT_ID_NOT_EXIST = 45;
	
	/*
	 * Social network links
	 */
	public static final String URL_GITHUB = "https://github.com/soumgraphic";
	public static final String URL_FACEBOOK = "https://www.facebook.com/soumgraphic/";
	public static final String URL_TWITTER = "https://twitter.com/soumailaadiarra";
	
}
