package date_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Datetime_Formatter {

	public static void main(String[] args) {
		String str="23/03/87";
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("[dd-MM-yyyy][MMM-dd-yyyy][dd/MM/yy]");
				
		LocalDate d1= LocalDate.parse(str,formatter);
		System.out.println(d1);

	}

}
