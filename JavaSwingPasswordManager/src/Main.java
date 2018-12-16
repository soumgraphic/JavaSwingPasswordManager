import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;

import bean.ReturnCallDbFunctionBean;
import bean.UserBean;
import dao.UserDaoImpl;
import database.DbConnexion;
import service.AESEncryption;
import service.PasswordHash;
import utils.Constants;
import utils.Utils;

public class Main {
	
	public static void main(String[] args) {
		
		Utils.getLogger(Level.INFO, "Encryption en cours...");
		Statement stmt = null;
		
		ReturnCallDbFunctionBean callDbFunctionBean = new ReturnCallDbFunctionBean();
		
	    String originalString = "Bonjour soumaila Abdoulaye DIARRA ";
	    String encryptedString = AESEncryption.encrypt(originalString, Constants.SECRET_KEY) ;
	    String decryptedString = AESEncryption.decrypt(encryptedString, Constants.SECRET_KEY) ;
	    
	    Utils.getLogger(Level.INFO, "Fin de l'encryption");
        
	    UserBean userBean = new UserBean("Djeneba Seck", "djene.seck@gmail.com", "Bonjour01");
	    
	    UserDaoImpl daoImpl = new UserDaoImpl();
	    //UserBean userBean = null;
	    /*
	    try {
	    		userBean = daoImpl.retrieveUser("enoc.coulibaly@gmail.com");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	    		
	    try {
			userBean =  daoImpl.insertUser(userBean);
	    		//userBean = daoImpl.retrieveUser("enoc.coulibaly@gmail.com");
			if ((userBean.getCallDbFunctionBean().getCodeRetour() == Constants.COMPLETED_SUCCESSFULLY) && (userBean.getCallDbFunctionBean().isErrorRetour() == false)) {
				System.out.println(userBean.getCallDbFunctionBean().getMessageRetour());
			}else {
				System.out.println(userBean.getCallDbFunctionBean().getMessageRetour());
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    System.out.println("L'utilisateur est " + userBean.toString());
	    
	    /*
	     * Test PasswordHash
	     */
	    String mdp = "Soumaila";
	    try {
	    		String mdpHash = PasswordHash.getSaltedHash(mdp);
			System.out.println("Mdp "+ mdp +" hash " + mdpHash);
			System.out.println(PasswordHash.checkPassword(mdp, mdpHash));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	     
	    System.out.println(originalString);
	    System.out.println(encryptedString);
	    System.out.println(decryptedString);
	}
    
}
