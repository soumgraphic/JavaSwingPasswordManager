import java.util.ArrayList;
import java.util.List;

import bean.AccountBean;
import bean.UserBean;
import dao.AccountDaoImpl;
import utils.Constants;

public class TestAccount {
	public static void main(String[] args) {
		
		/*
		 * Ajout d'un compte lier à un utilisateur
		 */
		
		/*
		 
		UserBean userBean = new UserBean();
		AccountDaoImpl accountDaoImpl = new AccountDaoImpl();
		userBean.setIdentifiantUser("c858cfb2-e53b-43cf-bc81-66cb85b8fdd0");
		AccountBean accountBean = new AccountBean("Oumar Sanogo", "oumar.s@gmail.com", "12345678", "https://www.youtube.com/", userBean);
		try {
			accountBean = accountDaoImpl.insertAccount(accountBean);
			if ((accountBean.getCallDbFunctionBean().getCodeRetour() == Constants.COMPLETED_SUCCESSFULLY) && (accountBean.getCallDbFunctionBean().isErrorRetour() == false)) {
				System.out.println("Username du compte ajouter " + accountBean.getUsernameAccount());
				System.out.println("Identifiant utilisateur " + accountBean.getUserBean().getIdentifiantUser());
				System.out.println("Message de retour " + accountBean.getCallDbFunctionBean().getMessageRetour());
			}else {
				System.out.println(accountBean.getCallDbFunctionBean().getMessageRetour());
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		*/
		
		
		/*
		 * Affichage d'un compte via son id.
		 */
		
		/* 
		
		UserBean userBean = new UserBean();
		AccountDaoImpl accountDaoImpl = new AccountDaoImpl();
		AccountBean accountBean = new AccountBean();
		try {
			accountBean = accountDaoImpl.retrieveAccountById("e63d8d83-f57e-4f3b-88bf-d444e9c23c8d");
			if ((accountBean.getCallDbFunctionBean().getCodeRetour() == Constants.COMPLETED_SUCCESSFULLY) && (accountBean.getCallDbFunctionBean().isErrorRetour() == false)) {
				System.out.println(accountBean.toString());
				System.out.println("Message de retour " + accountBean.getCallDbFunctionBean().getMessageRetour());
			}else {
				System.out.println(accountBean.getCallDbFunctionBean().getMessageRetour());
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		*/
		
		
		/*
		 * Affichage de tous les comptes.
		 */
		
		
		 
		UserBean userBean = new UserBean();
		AccountDaoImpl accountDaoImpl = new AccountDaoImpl();
		List<AccountBean> accounts = new ArrayList<AccountBean>();
		try {
			accounts = accountDaoImpl.retrieveAllAccounts();
			for (AccountBean accountBean : accounts) {
				if ((accountBean.getCallDbFunctionBean().getCodeRetour() == Constants.COMPLETED_SUCCESSFULLY) && (accountBean.getCallDbFunctionBean().isErrorRetour() == false)) {
					System.out.println(accountBean.toString());
					System.out.println("Message de retour " + accountBean.getCallDbFunctionBean().getMessageRetour());
				}else {
					System.out.println(accountBean.getCallDbFunctionBean().getMessageRetour());
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		/*
		 * Suppression d'un compte via son id.
		 */
		 
		/*
		 
		AccountDaoImpl accountDaoImpl = new AccountDaoImpl();
		AccountBean accountBean = new AccountBean();
		try {
			accountBean = accountDaoImpl.deleteAccountById("74bd8c65-ca07-46c7-9689-727e9402ed95");
			if ((accountBean.getCallDbFunctionBean().getCodeRetour() == Constants.COMPLETED_SUCCESSFULLY) && (accountBean.getCallDbFunctionBean().isErrorRetour() == false)) {
				System.out.println(accountBean.getIdentifiantAccount());
				System.out.println("Message de retour " + accountBean.getCallDbFunctionBean().getMessageRetour());
			}else {
				System.out.println(accountBean.getCallDbFunctionBean().getMessageRetour());
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		*/
		
		
		/*
		 * Mise à jour d'un compte lier à un utilisateur
		 */
		 
		/*
		 
		UserBean userBean = new UserBean();
		AccountDaoImpl accountDaoImpl = new AccountDaoImpl();
		userBean.setIdentifiantUser("c858cfb2-e53b-43cf-bc81-66cb85b8fdd0");
		AccountBean accountBean = new AccountBean("895a61c1-0f6c-495e-8bee-2d92cbfee28c","Assetou DIARRA KADI", "setou.s@gmail.com", "12345678", "https://www.youtube.com/", userBean);
		try {
			accountBean = accountDaoImpl.updateAccount(accountBean);
			if ((accountBean.getCallDbFunctionBean().getCodeRetour() == Constants.COMPLETED_SUCCESSFULLY) && (accountBean.getCallDbFunctionBean().isErrorRetour() == false)) {
				System.out.println("Identifiant utilisateur " + accountBean.getUserBean().getIdentifiantUser());
				System.out.println("Message de retour " + accountBean.getCallDbFunctionBean().getMessageRetour());
			}else {
				System.out.println(accountBean.getCallDbFunctionBean().getMessageRetour());
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		*/
		
	}
}
