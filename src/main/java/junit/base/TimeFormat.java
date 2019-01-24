package junit.base;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeFormat {
public static void main(String[] args) {
	Date d= new Date();
	System.out.println(d);
	SimpleDateFormat s= new SimpleDateFormat("HH-mm-ss");
	String v= s.format(d);
	System.out.println(v);
	
	//coding Short
	String x=new SimpleDateFormat("HH-mm-ss").format(new Date());
	System.out.println(x);
	
	//again short code
	System.out.println(new SimpleDateFormat("HH-mm-ss").format(new Date()));
		
}
}
