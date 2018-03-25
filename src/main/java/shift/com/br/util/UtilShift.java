package shift.com.br.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilShift {

	public Timestamp stringObjToTimestamp(String obj) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    Date parsedDate = dateFormat.parse(obj);
	    return new java.sql.Timestamp(parsedDate.getTime());	    
	}
	
}
