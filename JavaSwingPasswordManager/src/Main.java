import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;

import bean.UserBean;
import dao.UserDaoImpl;
import database.DbConnexion;
import service.AESEncryption;
import utils.Constants;
import utils.Utils;

public class Main {
	
	public static void main(String[] args) {
		
		Utils.getLogger(Level.INFO, "Encryption en cours...");
		Statement stmt = null;
		
	    String originalString = "Bonjour soumaila Abdoulaye DIARRA ";
	    String encryptedString = AESEncryption.encrypt(originalString, Constants.SECRET_KEY) ;
	    String decryptedString = AESEncryption.decrypt(encryptedString, Constants.SECRET_KEY) ;
	    
	    Utils.getLogger(Level.INFO, "Fin de l'encryption");
        
	    /*
	    UserBean userBean = new UserBean("Enoc Coulibaly", "enoc.coulibaly@gmail.com", "Bonjour01");
	    */
	    
	    UserDaoImpl daoImpl = new UserDaoImpl();
	    UserBean userBean = null;
	    try {
	    		userBean = daoImpl.retrieveUser("enoc.coulibaly@gmail.com");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    System.out.println("L'utilisateur est " + userBean.toString());
	    		
	    /*
	    try {
			daoImpl.insertUser(userBean);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   		*/
        
	     
	    System.out.println(originalString);
	    System.out.println(encryptedString);
	    System.out.println(decryptedString);
	}
    
}
