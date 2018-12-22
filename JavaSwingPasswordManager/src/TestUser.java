import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bean.UserBean;
import dao.UserDaoImpl;
import utils.Constants;

public class TestUser {
	
	public static void main(String[] args) {
		
		/*
		 * Insertion d'un user
		 */
		
		
		 
		try {
		
			UserDaoImpl daoImpl = new UserDaoImpl();
			UserBean userBean = new UserBean("Saran soman", "saran.d@gmail.com", "12345678");
			userBean = daoImpl.insertUser(userBean);
			if ((userBean.getCallDbFunctionBean().getCodeRetour() == Constants.COMPLETED_SUCCESSFULLY) && (userBean.getCallDbFunctionBean().isErrorRetour() == false)) {
				System.out.println("Email du user ajouté " + userBean.getEmailUser());
				System.out.println("Message de retour " + userBean.getCallDbFunctionBean().getMessageRetour());
				System.out.println(userBean.toString());
			} else {
				System.out.println("Message de retour " + userBean.getCallDbFunctionBean().getMessageRetour());
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		/*
		 * Affichage d'un user via son Id ou son email
		 */
		
		/* 
		
		try {
		
			UserDaoImpl daoImpl = new UserDaoImpl();
			UserBean userBean = new UserBean();
			//userBean = daoImpl.retrieveUserByEmail("alioune.d@gmail.com");
			userBean = daoImpl.retrieveUserById("c858cfb2-e53b-43cf-bc81-66cb85b8fdd0");
			if ((userBean.getCallDbFunctionBean().getCodeRetour() == Constants.COMPLETED_SUCCESSFULLY) && (userBean.getCallDbFunctionBean().isErrorRetour() == false)) {
				System.out.println(userBean.toString());
				System.out.println("Message de retour " + userBean.getCallDbFunctionBean().getMessageRetour());
			}else {
				System.out.println("Message de retour " + userBean.getCallDbFunctionBean().getMessageRetour());
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		*/
		
		
		/*
		 * Authentification d'un user via son email et son mot de passe 
		 */
		
		/*
		
		try {
		
			UserDaoImpl daoImpl = new UserDaoImpl();
			UserBean userBean = new UserBean();
			userBean = daoImpl.authenticationUser("dadju@gmail.com", "Bonjour01");
			if ((userBean.getCallDbFunctionBean().getCodeRetour() == Constants.COMPLETED_SUCCESSFULLY) && (userBean.getCallDbFunctionBean().isErrorRetour() == false)) {
				System.out.println(userBean.toString());
				System.out.println("Message de retour " + userBean.getCallDbFunctionBean().getMessageRetour());
			}else {
				System.out.println("Message de retour " + userBean.getCallDbFunctionBean().getMessageRetour());
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		*/
	}
}
