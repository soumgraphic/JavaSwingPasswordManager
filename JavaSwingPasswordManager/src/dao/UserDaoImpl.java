package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;

import bean.UserBean;
import database.DbConnexion;
import utils.Constants;
import utils.Utils;

public class UserDaoImpl {
	/*
	 * INSERT INTO pm_user (u_id, u_name, u_email, u_password)
		   VALUES (1, 'Soumaila A DIARRA', 'diarra176@gmail.com', 'soumaila');
	 */
	public static final String INSERT_SQL_QUERY     		= "INSERT INTO PM_USER (U_ID,U_NAME,U_EMAIL,U_PASSWORD) VALUES(?,?,?,?)";
	public static final String SELECT_SQL_QUERY_EMAIL    = "SELECT U_ID,U_NAME,U_EMAIL,U_CREATE_DATE,U_LAST_UPDATE FROM PM_USER WHERE U_EMAIL=?";

	
	public static void insertUser( UserBean userBean) throws SQLException {
		
	      Connection con = null;
	      PreparedStatement ps = null;
	      try
	      {
	         con = DbConnexion.getConnection();
	         if ( con == null )
	         {
	            Utils.getLogger(Level.SEVERE, "Erreur lors de la connexion à la base de donnée, veuillez vérifiez si la base de donée est bien démarré !");
	            return;
	         }
	         con.setAutoCommit( false );
	         
	         ps = con.prepareStatement( INSERT_SQL_QUERY );
	         ps.setString( 1, Utils.generateUUID());
	         ps.setString( 2, userBean.getNameUser() );
	         ps.setString( 3, userBean.getEmailUser() );
	         ps.setString( 4, userBean.getPasswordUser() );

	         ps.execute();
	         System.out.println( "insertUser => " + ps.toString() );
	         con.commit();

	      } catch ( SQLException e ) {
	         try
	         {
	            if ( con != null )
	            {
	               con.rollback();
	            }
	         }
	         catch ( SQLException e1 )
	         {
	            throw e1;
	         }
	         throw e;
	      }
	      finally
	      {
	         try
	         {	
	        	 	DbConnexion.closePrepaerdStatement(ps);
	        	 	DbConnexion.closeConnection(con);
	         }
	         catch ( SQLException e )
	         {
	            throw e;
	         }
	      }

	   }
	
	
	public static UserBean retrieveUser( String emailUser ) throws SQLException
	   {
	      Connection con = null;
	      PreparedStatement ps = null;
	      ResultSet rs = null;
	      UserBean userBean = new UserBean();
	      try
	      {
	         con = DbConnexion.getConnection();
	         if ( con == null )
	         {
	        	 	Utils.getLogger(Level.SEVERE, "Erreur lors de la connexion à la base de donnée, veuillez vérifiez si la base de donée est bien démarré !");
		        return userBean;
	         }
	         ps = con.prepareStatement( SELECT_SQL_QUERY_EMAIL );
	         ps.setString( 1, emailUser );
	         rs = ps.executeQuery();
	         System.out.println( "retrieveUser => " + ps.toString() );
	         while ( rs.next() )
	         {	
	        	 	userBean.setIdentifiantUser(rs.getString(Constants.U_ID));
	        	 	userBean.setNameUser(rs.getString(Constants.U_NAME));
	        	 	userBean.setEmailUser(rs.getString(Constants.U_EMAIL));
	        	 	userBean.setCreateDateUser(rs.getString(Constants.U_CREATE_DATE));
	        	 	userBean.setLastUpdateDateUser(rs.getString(Constants.U_LAST_UPDATE));
	         }

	      }
	      catch ( SQLException e )
	      {
	         throw e;

	      }

	      finally
	      {
	         try
	         {	
	        	 	DbConnexion.closeResultSet(rs);
	        	 	DbConnexion.closePrepaerdStatement(ps);
	        	 	DbConnexion.closeConnection(con);
	          
	         }
	         catch ( SQLException e )
	         {
	            throw e;
	         }
	      }
	      return userBean;
	   }
	
	
	
}
