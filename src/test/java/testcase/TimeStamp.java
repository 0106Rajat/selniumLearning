package testcase;

import java.util.Date;

public class TimeStamp {

	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d.toString().replace(":","_").replace(" ","_"));
	}

}
