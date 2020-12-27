package coreJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal=Calendar.getInstance();
		 SimpleDateFormat sdf = new SimpleDateFormat("d/M/yyyy H:m:s");
		 System.out.println(sdf.format(cal.getTime()));
		 System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		 System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		 System.out.println(cal.get(Calendar.MINUTE));
	}

}
