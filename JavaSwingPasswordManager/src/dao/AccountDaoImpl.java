package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.AccountBean;
import bean.ReturnCallDbFunctionBean;
import bean.UserBean;
import database.DbConnexion;
import service.AESEncryption;
import service.PasswordHash;
import utils.Constants;
import utils.Utils;

public class AccountDaoImpl {
	public static final String INSERT_ACCOUNT_SQL_QUERY 					= "INSERT INTO PM_ACCOUNT (A_ID,A_NAME,A_USERNAME,A_PASSWORD,A_URL,PM_USER_U_ID) VALUES(?,?,?,?,?,?)";
	public static final String SELECT_ACCOUNT_SQL_QUERY_ID 				= "SELECT * FROM PM_ACCOUNT WHERE A_ID=?";
	public static final String SELECT_ACCOUNTS_SQL_QUERY 					= "SELECT * FROM PM_ACCOUNT";
	public static final String SELECT_ACCOUNTS_SQL_QUERY_BY_USER_ID 		= "SELECT * FROM PM_ACCOUNT WHERE PM_USER_U_ID = ?";
	public static final String DELETE_ACCOUNT_SQL_QUERY_ID 				= "DELETE FROM PM_ACCOUNT WHERE A_ID=?";
	public static final String UPDATE_ACCOUNT_SQL_QUERY_ID 				= "UPDATE PM_ACCOUNT SET A_NAME=?, A_USERNAME=?, A_PASSWORD=?, A_URL=?,A_LAST_UPDATE=CURRENT_TIMESTAMP WHERE A_ID=?";

	static ReturnCallDbFunctionBean callDbFunctionBean = new ReturnCallDbFunctionBean();
	static UserBean userBean = new UserBean();

	public static AccountBean insertAccount(AccountBean accountBean) throws Exception {

		Connection con = null;
		PreparedStatement ps = null;
		AccountBean account = new AccountBean();
		try {
			con = DbConnexion.getConnection();
			if (con == null) {
				Utils.errorDbConnection();
				return account;
			}

			if (UserDaoImpl.testIfUserIdExistInDb(accountBean.getUserBean().getIdentifiantUser()) == true) {
				ps = con.prepareStatement(INSERT_ACCOUNT_SQL_QUERY);
				ps.setString(1, Utils.generateUUID());
				ps.setString(2, accountBean.getNameAccount());
				ps.setString(3, accountBean.getUsernameAccount());
				ps.setString(4, AESEncryption.encrypt(accountBean.getPasswordAccount()));
				ps.setString(5, accountBean.getUrlAccount());
				ps.setString(6, accountBean.getUserBean().getIdentifiantUser());

				int count = ps.executeUpdate();
				System.out.println("insertUser => " + ps.toString());
				if (count > 0) {
					account.setUsernameAccount(accountBean.getUsernameAccount());
					userBean.setIdentifiantUser(accountBean.getUserBean().getIdentifiantUser());
					account.setUserBean(userBean);
					callDbFunctionBean.setErrorRetour(false);
					callDbFunctionBean.setCodeRetour(Constants.COMPLETED_SUCCESSFULLY);
					callDbFunctionBean.setMessageRetour("Ajout du compte utilisateur "
							+ accountBean.getUsernameAccount() + " effectué avec succès !");
					account.setCallDbFunctionBean(callDbFunctionBean);

				} else {
					callDbFunctionBean.setErrorRetour(true);
					callDbFunctionBean.setCodeRetour(Constants.UNKNOW_ERROR);
					callDbFunctionBean
							.setMessageRetour("Une erreur est survenue lors de l'ajout du compte utilisateur !");
					account.setCallDbFunctionBean(callDbFunctionBean);
				}
			} else {
				callDbFunctionBean.setErrorRetour(true);
				callDbFunctionBean.setCodeRetour(Constants.USER_ID_NOT_EXIST);
				callDbFunctionBean.setMessageRetour("L'identifiant utilisateur "
						+ accountBean.getUserBean().getIdentifiantUser() + " n'existe pas dans la base de donnée !");
				account.setCallDbFunctionBean(callDbFunctionBean);
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

		return account;
	}

	public static AccountBean retrieveAccountById(String idAccount) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		AccountBean accountBean = new AccountBean();

		try {
			con = DbConnexion.getConnection();
			if (con == null) {
				Utils.errorDbConnection();
				return accountBean;
			}
			if ((idAccount != null) && (!idAccount.isEmpty())) {
				ps = con.prepareStatement(SELECT_ACCOUNT_SQL_QUERY_ID);
				ps.setString(1, idAccount);

				rs = ps.executeQuery();
				boolean testRowReturnLigne = rs.next();
				if (testRowReturnLigne == false) {
					callDbFunctionBean.setErrorRetour(true);
					callDbFunctionBean.setCodeRetour(Constants.NOT_FOUND);
					callDbFunctionBean
							.setMessageRetour("Aucun compte ne correspond à l'identifiant de compte " + idAccount);
					accountBean.setCallDbFunctionBean(callDbFunctionBean);
				}

				while (testRowReturnLigne) {
					accountBean.setIdentifiantAccount(rs.getString(Constants.A_ID));
					accountBean.setNameAccount(rs.getString(Constants.A_NAME));
					accountBean.setUsernameAccount(rs.getString(Constants.A_USERNAME));
					accountBean.setPasswordAccount(AESEncryption.decrypt(rs.getString(Constants.A_PASSWORD)));
					accountBean.setUrlAccount(rs.getString(Constants.A_URL));
					accountBean.setCreateDateAccount(rs.getString(Constants.A_CREATE_DATE));
					accountBean.setLastUpdateDateAccount(rs.getString(Constants.A_LAST_UPDATE));
					userBean.setIdentifiantUser(rs.getString(Constants.PM_USER_U_ID));
					accountBean.setUserBean(userBean);
					callDbFunctionBean.setErrorRetour(false);
					callDbFunctionBean.setCodeRetour(Constants.COMPLETED_SUCCESSFULLY);
					callDbFunctionBean.setMessageRetour("Le compte a été retrouver avec succès !");
					accountBean.setCallDbFunctionBean(callDbFunctionBean);

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
		return accountBean;
	}

	public static List<AccountBean> retrieveAllAccounts() throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<AccountBean> listAccountsBean = new ArrayList<AccountBean>();
		AccountBean accountBean = new AccountBean();

		try {
			con = DbConnexion.getConnection();
			if (con == null) {
				Utils.errorDbConnection();
				return listAccountsBean;
			}

			ps = con.prepareStatement(SELECT_ACCOUNTS_SQL_QUERY);

			rs = ps.executeQuery();
			boolean testRowReturnLigne = rs.next();
			if (testRowReturnLigne == false) {
				callDbFunctionBean.setErrorRetour(true);
				callDbFunctionBean.setCodeRetour(Constants.NOT_FOUND);
				callDbFunctionBean
						.setMessageRetour("Aucun compte ne correspond trouvé !");
				accountBean.setCallDbFunctionBean(callDbFunctionBean);
				listAccountsBean.add(accountBean);
			}

			while (testRowReturnLigne) {
				accountBean = new AccountBean();
				
				accountBean.setIdentifiantAccount(rs.getString(Constants.A_ID));
				accountBean.setNameAccount(rs.getString(Constants.A_NAME));
				accountBean.setUsernameAccount(rs.getString(Constants.A_USERNAME));
				accountBean.setPasswordAccount(AESEncryption.decrypt(rs.getString(Constants.A_PASSWORD)));
				accountBean.setUrlAccount(rs.getString(Constants.A_URL));
				accountBean.setCreateDateAccount(rs.getString(Constants.A_CREATE_DATE));
				accountBean.setLastUpdateDateAccount(rs.getString(Constants.A_LAST_UPDATE));
				
				userBean.setIdentifiantUser(rs.getString(Constants.PM_USER_U_ID));
				accountBean.setUserBean(userBean);
				
				callDbFunctionBean.setErrorRetour(false);
				callDbFunctionBean.setCodeRetour(Constants.COMPLETED_SUCCESSFULLY);
				callDbFunctionBean.setMessageRetour("Le compte a été retrouver avec succès !");
				accountBean.setCallDbFunctionBean(callDbFunctionBean);
				listAccountsBean.add(accountBean);

				testRowReturnLigne = rs.next();
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
		return listAccountsBean;
	}
	
	public static List<AccountBean> retrieveAllAccountsByUserId(String userId) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<AccountBean> listAccountsBean = new ArrayList<AccountBean>();
		AccountBean accountBean = new AccountBean();

		try {
			con = DbConnexion.getConnection();
			if (con == null) {
				Utils.errorDbConnection();
				return listAccountsBean;
			}
			
			if (UserDaoImpl.testIfUserIdExistInDb(userId) == true) {
				
				ps = con.prepareStatement(SELECT_ACCOUNTS_SQL_QUERY_BY_USER_ID);
				ps.setString(1, userId);

				rs = ps.executeQuery();
				boolean testRowReturnLigne = rs.next();
				if (testRowReturnLigne == false) {
					callDbFunctionBean.setErrorRetour(true);
					callDbFunctionBean.setCodeRetour(Constants.NOT_FOUND);
					callDbFunctionBean
							.setMessageRetour("Il n'y a aucun compte correspondant à l'utilisateur " + userId);
					accountBean.setCallDbFunctionBean(callDbFunctionBean);
					listAccountsBean.add(accountBean);
				}

				while (testRowReturnLigne) {
					accountBean = new AccountBean();
					
					accountBean.setIdentifiantAccount(rs.getString(Constants.A_ID));
					accountBean.setNameAccount(rs.getString(Constants.A_NAME));
					accountBean.setUsernameAccount(rs.getString(Constants.A_USERNAME));
					accountBean.setPasswordAccount(AESEncryption.decrypt(rs.getString(Constants.A_PASSWORD)));
					accountBean.setUrlAccount(rs.getString(Constants.A_URL));
					accountBean.setCreateDateAccount(rs.getString(Constants.A_CREATE_DATE));
					accountBean.setLastUpdateDateAccount(rs.getString(Constants.A_LAST_UPDATE));
					
					userBean.setIdentifiantUser(rs.getString(Constants.PM_USER_U_ID));
					accountBean.setUserBean(userBean);
					
					callDbFunctionBean.setErrorRetour(false);
					callDbFunctionBean.setCodeRetour(Constants.COMPLETED_SUCCESSFULLY);
					callDbFunctionBean.setMessageRetour("Le compte a été retrouver avec succès !");
					accountBean.setCallDbFunctionBean(callDbFunctionBean);
					listAccountsBean.add(accountBean);

					testRowReturnLigne = rs.next();
				}
				
			} else {
				
				callDbFunctionBean.setErrorRetour(true);
				callDbFunctionBean.setCodeRetour(Constants.USER_ID_NOT_EXIST);
				callDbFunctionBean.setMessageRetour("L'identifiant utilisateur "
						+ accountBean.getUserBean().getIdentifiantUser() + " n'existe pas dans la base de donnée !");
				accountBean.setCallDbFunctionBean(callDbFunctionBean);
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
		return listAccountsBean;
	}
	
	public static AccountBean deleteAccountById(String idAccount) throws SQLException {
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		AccountBean accountBean = new AccountBean();

		try {
			con = DbConnexion.getConnection();
			if (con == null) {
				Utils.errorDbConnection();
				return accountBean;
			}
			
			if ((idAccount != null) && (!idAccount.isEmpty())) {
				
				if (testIfAccountIdExistInDb(idAccount) == true) {
					
					ps = con.prepareStatement(DELETE_ACCOUNT_SQL_QUERY_ID);
					ps.setString(1, idAccount);

					int count = ps.executeUpdate();
					System.out.println("insertUser => " + ps.toString());
					if (count > 0) {
						accountBean.setIdentifiantAccount(accountBean.getIdentifiantAccount());
						callDbFunctionBean.setErrorRetour(false);
						callDbFunctionBean.setCodeRetour(Constants.COMPLETED_SUCCESSFULLY);
						callDbFunctionBean.setMessageRetour("Suppression du compte "
								+ idAccount + " effectué avec succès !");
						accountBean.setCallDbFunctionBean(callDbFunctionBean);

					} else {
						callDbFunctionBean.setErrorRetour(true);
						callDbFunctionBean.setCodeRetour(Constants.UNKNOW_ERROR);
						callDbFunctionBean
								.setMessageRetour("Une erreur est survenue lors de la suppression du compte utilisateur !");
						accountBean.setCallDbFunctionBean(callDbFunctionBean);
					}
					
				} else {
					
					callDbFunctionBean.setErrorRetour(true);
					callDbFunctionBean.setCodeRetour(Constants.USER_ID_NOT_EXIST);
					callDbFunctionBean.setMessageRetour("L'identifiant du compte "
							+ idAccount + " n'existe pas dans la base de donnée !");
					accountBean.setCallDbFunctionBean(callDbFunctionBean);
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
		
		return accountBean;
	}
	
	
	public static AccountBean updateAccount(AccountBean accountBean) throws Exception {

		Connection con = null;
		PreparedStatement ps = null;
		AccountBean account = new AccountBean();
		try {
			con = DbConnexion.getConnection();
			if (con == null) {
				Utils.errorDbConnection();
				return account;
			}

			if (UserDaoImpl.testIfUserIdExistInDb(accountBean.getUserBean().getIdentifiantUser()) == true) {
				
				ps = con.prepareStatement(UPDATE_ACCOUNT_SQL_QUERY_ID);
				ps.setString(1, accountBean.getNameAccount());
				ps.setString(2, accountBean.getUsernameAccount());
				ps.setString(3, AESEncryption.encrypt(accountBean.getPasswordAccount()));
				ps.setString(4, accountBean.getUrlAccount());
				ps.setString(5, accountBean.getIdentifiantAccount());
				
				System.out.println(ps.toString());

				int count = ps.executeUpdate();
				System.out.println("updateAccount => " + ps.toString());
				if (count > 0) {
					userBean.setIdentifiantUser(accountBean.getUserBean().getIdentifiantUser());
					account.setUserBean(userBean);
					
					callDbFunctionBean.setErrorRetour(false);
					callDbFunctionBean.setCodeRetour(Constants.COMPLETED_SUCCESSFULLY);
					callDbFunctionBean.setMessageRetour("Modification du compte utilisateur "
							+ accountBean.getIdentifiantAccount() + " effectué avec succès !");
					account.setCallDbFunctionBean(callDbFunctionBean);

				} else {
					callDbFunctionBean.setErrorRetour(true);
					callDbFunctionBean.setCodeRetour(Constants.UNKNOW_ERROR);
					callDbFunctionBean
							.setMessageRetour("Une erreur est survenue lors de la modification du compte utilisateur !");
					account.setCallDbFunctionBean(callDbFunctionBean);
				}
			} else {
				callDbFunctionBean.setErrorRetour(true);
				callDbFunctionBean.setCodeRetour(Constants.USER_ID_NOT_EXIST);
				callDbFunctionBean.setMessageRetour("L'identifiant utilisateur "
						+ accountBean.getUserBean().getIdentifiantUser() + " n'existe pas dans la base de donnée !");
				account.setCallDbFunctionBean(callDbFunctionBean);
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

		return account;
	}
	
	public static boolean testIfAccountIdExistInDb(String idAccount) {
		AccountBean accountBean = new AccountBean();
		boolean testId = false;
		try {
			if ((idAccount != null && !idAccount.isEmpty())) {
				accountBean = retrieveAccountById(idAccount);
				if ((accountBean.getCallDbFunctionBean().isErrorRetour() == false) && (accountBean.getCallDbFunctionBean().getCodeRetour() == Constants.COMPLETED_SUCCESSFULLY)) {
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
