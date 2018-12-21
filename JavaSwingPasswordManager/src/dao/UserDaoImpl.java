package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;

import bean.ReturnCallDbFunctionBean;
import bean.UserBean;
import database.DbConnexion;
import service.PasswordHash;
import utils.Constants;
import utils.Utils;

public class UserDaoImpl {
	/*
	 * INSERT INTO pm_user (u_id, u_name, u_email, u_password) VALUES (1, 'Soumaila
	 * A DIARRA', 'diarra176@gmail.com', 'soumaila');
	 */
	public static final String INSERT_USER_SQL_QUERY 			= "INSERT INTO PM_USER (U_ID,U_NAME,U_EMAIL,U_PASSWORD) VALUES(?,?,?,?)";
	public static final String SELECT_USER_SQL_QUERY_EMAIL 	= "SELECT * FROM PM_USER WHERE U_EMAIL=?";
	public static final String SELECT_USER_SQL_QUERY_ID 	    = "SELECT * FROM PM_USER WHERE U_ID=?";
	
	static ReturnCallDbFunctionBean callDbFunctionBean = new ReturnCallDbFunctionBean();

	public static UserBean insertUser(UserBean userBean) throws Exception {

		Connection con = null;
		PreparedStatement ps = null;
		UserBean user= new UserBean();
		try {
			con = DbConnexion.getConnection();
			if (con == null) {
				Utils.errorDbConnection();
				return user;
			}
			
			if (testIfUserEmailExistInDb(userBean.getEmailUser()) == false) {
				ps = con.prepareStatement(INSERT_USER_SQL_QUERY);
				String uuidGenerated = Utils.generateUUID();
				ps.setString(1, uuidGenerated);
				ps.setString(2, userBean.getNameUser());
				ps.setString(3, userBean.getEmailUser());
				ps.setString(4, PasswordHash.getSaltedHash(userBean.getPasswordUser()));
				
				int count = ps.executeUpdate();
				System.out.println("insertUser => " + ps.toString());
				if (count > 0) {
					user.setIdentifiantUser(uuidGenerated);
					user.setNameUser(userBean.getNameUser());
					user.setEmailUser(userBean.getEmailUser());
					callDbFunctionBean.setErrorRetour(false);
					callDbFunctionBean.setCodeRetour(Constants.COMPLETED_SUCCESSFULLY);
					callDbFunctionBean.setMessageRetour("Insertion de l'utilisateur " + userBean.getEmailUser() + " effectué avec succès !");
					user.setCallDbFunctionBean(callDbFunctionBean);
					
				}else {
					callDbFunctionBean.setErrorRetour(true);
					callDbFunctionBean.setCodeRetour(Constants.UNKNOW_ERROR);
					callDbFunctionBean.setMessageRetour("Une erreur est survenue lors de la création de votre compte !");
					user.setCallDbFunctionBean(callDbFunctionBean);
				}
			} else {
				callDbFunctionBean.setErrorRetour(true);
				callDbFunctionBean.setCodeRetour(Constants.EMAIL_EXIST);
				callDbFunctionBean.setMessageRetour("L'email " + userBean.getEmailUser() + " existe déjà !");
				user.setCallDbFunctionBean(callDbFunctionBean);
			}

		} catch (SQLException e) {
			try {
				if (con != null) {
					con.rollback();
				}
			} catch (SQLException e1) {
				throw e1;
			}
			throw e;
		} finally {
			try {
				DbConnexion.closePrepaerdStatement(ps);
				DbConnexion.closeConnection(con);
			} catch (SQLException e) {
				throw e;
			}
		}
		
		return user;

	}

	public static UserBean retrieveUserByEmail(String emailUser) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		UserBean userBean = new UserBean();
		try {
			con = DbConnexion.getConnection();
			if (con == null) {
				Utils.errorDbConnection();
				return userBean;
			}
			if((emailUser != null)&&(!emailUser.isEmpty())) {
				ps = con.prepareStatement(SELECT_USER_SQL_QUERY_EMAIL);
				ps.setString(1, emailUser);
				
				rs = ps.executeQuery();
				boolean testRowReturnLigne = rs.next();
				if (testRowReturnLigne == false) {
					callDbFunctionBean.setErrorRetour(true);
					callDbFunctionBean.setCodeRetour(Constants.NOT_FOUND);
					callDbFunctionBean.setMessageRetour("Aucun utilisateur ne correspond à l'utilisateur " + emailUser);
					userBean.setCallDbFunctionBean(callDbFunctionBean);
				}
				
				while (testRowReturnLigne) {
					userBean.setIdentifiantUser(rs.getString(Constants.U_ID));
					userBean.setNameUser(rs.getString(Constants.U_NAME));
					userBean.setEmailUser(rs.getString(Constants.U_EMAIL));
					userBean.setCreateDateUser(rs.getString(Constants.U_CREATE_DATE));
					userBean.setLastUpdateDateUser(rs.getString(Constants.U_LAST_UPDATE));
					callDbFunctionBean.setErrorRetour(false);
					callDbFunctionBean.setCodeRetour(Constants.COMPLETED_SUCCESSFULLY);
					callDbFunctionBean.setMessageRetour("L'utilisateur a été retrouver avec succès !");
					userBean.setCallDbFunctionBean(callDbFunctionBean);
					
					testRowReturnLigne = rs.next();
				}
			}

		} catch (SQLException e) {
			throw e;

		}

		finally {
			try {
				DbConnexion.closeResultSet(rs);
				DbConnexion.closePrepaerdStatement(ps);
				DbConnexion.closeConnection(con);

			} catch (SQLException e) {
				throw e;
			}
		}
		return userBean;
	}
	
	public static UserBean retrieveUserById(String id) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		UserBean userBean = new UserBean();
		try {
			con = DbConnexion.getConnection();
			if (con == null) {
				Utils.errorDbConnection();
				return userBean;
			}
			if((id != null)&&(!id.isEmpty())) {
				ps = con.prepareStatement(SELECT_USER_SQL_QUERY_ID);
				ps.setString(1, id);
				
				rs = ps.executeQuery();
				boolean testRowReturnLigne = rs.next();
				if (testRowReturnLigne == false) {
					callDbFunctionBean.setErrorRetour(true);
					callDbFunctionBean.setCodeRetour(Constants.NOT_FOUND);
					callDbFunctionBean.setMessageRetour("Aucun utilisateur ne correspond à l'utilisateur " + id);
					userBean.setCallDbFunctionBean(callDbFunctionBean);
				}
				
				while (testRowReturnLigne) {
					userBean.setIdentifiantUser(rs.getString(Constants.U_ID));
					userBean.setNameUser(rs.getString(Constants.U_NAME));
					userBean.setEmailUser(rs.getString(Constants.U_EMAIL));
					userBean.setCreateDateUser(rs.getString(Constants.U_CREATE_DATE));
					userBean.setLastUpdateDateUser(rs.getString(Constants.U_LAST_UPDATE));
					callDbFunctionBean.setErrorRetour(false);
					callDbFunctionBean.setCodeRetour(Constants.COMPLETED_SUCCESSFULLY);
					callDbFunctionBean.setMessageRetour("L'utilisateur a été retrouver avec succès !");
					userBean.setCallDbFunctionBean(callDbFunctionBean);
					
					testRowReturnLigne = rs.next();
				}
			}

		} catch (SQLException e) {
			throw e;

		}

		finally {
			try {
				DbConnexion.closeResultSet(rs);
				DbConnexion.closePrepaerdStatement(ps);
				DbConnexion.closeConnection(con);

			} catch (SQLException e) {
				throw e;
			}
		}
		return userBean;
	}
	
	public static UserBean authenticationUser(String emailUser, String passwordUser) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		UserBean userBean = new UserBean();
		
		try {
			
			if ((emailUser != null && !emailUser.isEmpty()) || (passwordUser != null && !passwordUser.isEmpty())) {
				
				con = DbConnexion.getConnection();
				if (con == null) {
					Utils.errorDbConnection();
					return userBean;
				}
				
				ps = con.prepareStatement(SELECT_USER_SQL_QUERY_EMAIL);
				ps.setString(1, emailUser);
				
				rs = ps.executeQuery();
				boolean testRowReturnLigne = rs.next();
				if (testRowReturnLigne == false) {
					callDbFunctionBean.setErrorRetour(true);
					callDbFunctionBean.setCodeRetour(Constants.NOT_FOUND);
					callDbFunctionBean.setMessageRetour("Aucun utilisateur ne correspond à l'utilisateur " + emailUser);
					userBean.setCallDbFunctionBean(callDbFunctionBean);
				}
				
				while (testRowReturnLigne) {
					if (PasswordHash.checkPassword(passwordUser, rs.getString(Constants.U_PASSWORD))) {
						userBean.setIdentifiantUser(rs.getString(Constants.U_ID));
						userBean.setNameUser(rs.getString(Constants.U_NAME));
						userBean.setEmailUser(rs.getString(Constants.U_EMAIL));
						userBean.setCreateDateUser(rs.getString(Constants.U_CREATE_DATE));
						userBean.setLastUpdateDateUser(rs.getString(Constants.U_LAST_UPDATE));
						callDbFunctionBean.setErrorRetour(false);
						callDbFunctionBean.setCodeRetour(Constants.COMPLETED_SUCCESSFULLY);
						callDbFunctionBean.setMessageRetour("L'utilisateur est authentifié avec succès !");
						userBean.setCallDbFunctionBean(callDbFunctionBean);
					}else {
						callDbFunctionBean.setErrorRetour(true);
						callDbFunctionBean.setCodeRetour(Constants.PASSWORD_ERROR);
						callDbFunctionBean.setMessageRetour("Mot de passe invalide !");
						userBean.setCallDbFunctionBean(callDbFunctionBean);
					}
					
					testRowReturnLigne = rs.next();
				}
				
			}

		} catch (SQLException e) {
			throw e;

		}

		finally {
			try {
				DbConnexion.closeResultSet(rs);
				DbConnexion.closePrepaerdStatement(ps);
				DbConnexion.closeConnection(con);

			} catch (SQLException e) {
				throw e;
			}
		}
		return userBean;
	}
	
	public static boolean testIfUserEmailExistInDb(String email) {
		UserBean userBean = new UserBean();
		boolean testEmail = false;
		try {
			if ((email != null && !email.isEmpty())) {
				userBean = retrieveUserByEmail(email);
				if ((userBean.getCallDbFunctionBean().isErrorRetour() == false) && (userBean.getCallDbFunctionBean().getCodeRetour() == Constants.COMPLETED_SUCCESSFULLY)) {
					testEmail = true;
				}else {
					testEmail = false;
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return testEmail;
	}
	
	public static boolean testIfUserIdExistInDb(String id) {
		UserBean userBean = new UserBean();
		boolean testId = false;
		try {
			if ((id != null && !id.isEmpty())) {
				userBean = retrieveUserById(id);
				if ((userBean.getCallDbFunctionBean().isErrorRetour() == false) && (userBean.getCallDbFunctionBean().getCodeRetour() == Constants.COMPLETED_SUCCESSFULLY)) {
					testId = true;
				}else {
					testId = false;
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return testId;
	}

}
