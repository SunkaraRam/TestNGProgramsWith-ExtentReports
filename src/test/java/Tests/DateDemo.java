package Tests;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateDemo {
	
	   public static void main(String args[]) {
		   
		   SimpleDateFormat dateTimeInGMT = new SimpleDateFormat("yyyy-MMM-dd hh:mm:ss aa");
		   dateTimeInGMT.setTimeZone(TimeZone.getTimeZone("GMT"));	
		   String date = dateTimeInGMT.format(new Date());

		   }

}
