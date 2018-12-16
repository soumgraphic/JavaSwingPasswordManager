import bean.UserBean;
import dao.UserDaoImpl;

public class Tester {
	public static void main(String[] args) {
		UserDaoImpl daoImpl = new UserDaoImpl();
		UserBean userBean = new UserBean();
		
		//System.out.println(daoImpl.testIfUserEmailExistInDb("enoc.coulibaly@gmail.com"));
		
		try {
			userBean = daoImpl.authenticationUser("dadju@gmail.com", "Bonjour01");
			System.out.println(userBean.toString());
			System.out.println("Code Retour = " + userBean.getCallDbFunctionBean().getCodeRetour() + " Message: " + userBean.getCallDbFunctionBean().getMessageRetour());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
