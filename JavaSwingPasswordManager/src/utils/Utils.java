package utils;

import java.util.Date;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import java.util.UUID;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import ui.AdminUI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Utils {

	private final static java.util.logging.Logger log = java.util.logging.Logger.getLogger("logger");

	public static java.util.logging.Logger getLogger(Level l, String message) {
		log.log(l, message);
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
		java.sql.Date sqlDate = new java.sql.Date(date.getTime());

		return sqlDate;
	}

	public static void errorDbConnection() {
		getLogger(Level.SEVERE,
				"Erreur lors de la connexion à la base de donnée, veuillez vérifiez si la base de donée est bien démarré !");
	}

	public static boolean isNullOrEmpty(String str) {
		if (str != null && !str.trim().isEmpty())
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
		} else {
			return true;
		}
	}

	public static void showErrorMessage(JFrame frame, String message) {
		final ImageIcon icon = new ImageIcon(Toolkit.getDefaultToolkit().getImage(Utils.class.getResource("/ui/images/cancel.png")));
		JOptionPane.showMessageDialog(frame, message + " :)", "Password Manager - Erreur",
				JOptionPane.INFORMATION_MESSAGE, icon);
	}

	public static int showConfirmDialog(JFrame frame, String message) { 
		final ImageIcon icon = new ImageIcon(Toolkit.getDefaultToolkit().getImage(Utils.class.getResource("/ui/images/warning.png")));
		int input = JOptionPane.showConfirmDialog(frame, message,
				"Password Manager - Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, icon);
		return input;
	}

	public static void showSuccessMessage(JFrame frame, String message) {
		JOptionPane.showMessageDialog(frame, message, "Password Manager", 0);
	}

	public static void enableButton(JTextField textField, JButton button) {
		if (!isNullOrEmpty(textField.getText().toString())) {
			button.setEnabled(false);
		} else {
			button.setEnabled(true);
		}
	}

	public static void openWebpage(String urlString) {
		try {
			Desktop.getDesktop().browse(new URL(urlString).toURI());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static final void showOrHidePasswordTxtFields(JPasswordField passwordField, JLabel labelForChangeIcon, char caractereCodagePass) {
		// TODO Auto-generated method stub
		String nomImage = labelForChangeIcon.getIcon().toString();
		//Split le chemin et recupère la dernière occurence de nom
		nomImage = nomImage.substring(nomImage.lastIndexOf("/")+1);
		
		String pass = passwordField.getText().toString();
		if (nomImage.equals("eye.png")) {
			passwordField.setEchoChar((char)0);
			labelForChangeIcon.setIcon(new ImageIcon(AdminUI.class.getResource("/ui/images/eye_invisible.png")));
		}else if (nomImage.equals("eye_invisible.png")) {
			passwordField.setEchoChar(caractereCodagePass);
			labelForChangeIcon.setIcon(new ImageIcon(AdminUI.class.getResource("/ui/images/eye.png")));
		}else if(nomImage.equals("eye_white.png")) {
			passwordField.setEchoChar((char)0);
			labelForChangeIcon.setIcon(new ImageIcon(AdminUI.class.getResource("/ui/images/eye_invisible_white.png")));
		}
		else if (nomImage.equals("eye_invisible_white.png")) {
			passwordField.setEchoChar(caractereCodagePass);
			labelForChangeIcon.setIcon(new ImageIcon(AdminUI.class.getResource("/ui/images/eye_white.png")));
		}
	}
	
	public static void refreshFrame(JFrame frame) {
		//frame.invalidate();
		//frame.validate();
		frame.revalidate();
		frame.repaint();
	}
	
	public static String generatePassword() {
        String SALTCHARS = "azertyuiopqsdfghjklmwxcvbnAZERTYUIOPQSDFGHJKLMWXCVBN0123456789+-*/=&\".-_+/*,'#";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 18) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }

}
