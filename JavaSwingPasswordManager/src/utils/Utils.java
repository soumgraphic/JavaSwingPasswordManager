package utils;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.UUID;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Utils {
	
	private final static java.util.logging.Logger log = java.util.logging.Logger.getLogger("logger");
	
	public static java.util.logging.Logger getLogger(Level l,String message){
		log.log(l,message);
		return log;
	}
	
	public static String generateUUID() {
		UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();
        
        return randomUUIDString;
	}
	
	public static java.sql.Date dateRetrieveConvert(String inputDate) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
		Date date = null;
		try {
			date = df.parse(inputDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		java.sql.Date sqlDate = new java.sql.Date( date.getTime() );
	    
		return sqlDate;
	}
	
	public static void errorDbConnection() {
		getLogger(Level.SEVERE,
				"Erreur lors de la connexion à la base de donnée, veuillez vérifiez si la base de donée est bien démarré !");
	}
	
	public static boolean isNullOrEmpty(String str) {
        if(str != null && !str.trim().isEmpty())
            return false;
        return true;
    }
	
	public static boolean validateEmail(String email) {
		// Email Regex java
		final String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
		Pattern pattern;
		Matcher matcher;
		pattern = Pattern.compile(EMAIL_REGEX, Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(email);
		return matcher.matches();
	}
	
	public static boolean checkStringMinLength(String chaine, int minLength) {
		if (chaine.length() < minLength) {
			return false;
		}else {
			return true;
		}
	}
	
	public static void showErrorMessage (JFrame frame, String message) {
		JOptionPane.showMessageDialog(frame, message + " :)","Password Manager - Erreur",0);
	}
	
	public static void showSuccessMessage (JFrame frame, String message) {
		JOptionPane.showMessageDialog(frame, message,"Password Manager",0);
	}
	
}
