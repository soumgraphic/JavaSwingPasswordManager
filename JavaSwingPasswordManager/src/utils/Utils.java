package utils;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.UUID;
import java.util.logging.Level;

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
	
}
