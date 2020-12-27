package coreJava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//enter current date 
		
		Date d = new Date();
		 System.out.println(d.toString());
		 
		 SimpleDateFormat sdf = new SimpleDateFormat("d/M/yyyy H:m:s");
		 SimpleDateFormat sd = new SimpleDateFormat("d/M/yy H:m:s");
		System.out.println( sdf.format(d));
		System.out.println( sd.format(d));
		 
		 
		
		 
	}

}
