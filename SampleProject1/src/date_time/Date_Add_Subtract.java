package date_time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Date_Add_Subtract {

	public static void main(String[] args) {
	  LocalDate d1= LocalDate.now().minus(10,ChronoUnit.DECADES);
	  System.out.println(d1);
	  
	}

}
