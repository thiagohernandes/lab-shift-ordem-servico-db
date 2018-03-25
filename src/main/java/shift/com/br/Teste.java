package shift.com.br;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import shift.com.br.util.UtilShift;

public class Teste {

	public static void main(String args[]) throws ParseException {
		
		String s = "2018-03-24 17:50:43";
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	    Date parsedDate = dateFormat.parse(s);
	    
	    Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
	    
		java.util.Date date = new java.util.Date(new Long(timestamp.getTime()));
		String dateStr = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
		System.out.println(dateStr);
		
		String ss = "2018-03-24 17:50:43";
		
		System.out.println(new UtilShift().stringObjToTimestamp(ss));
	}
	
}
