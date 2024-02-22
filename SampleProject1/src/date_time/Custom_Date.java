package date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Custom_Date {

	public static void main(String[] args) {
		LocalDate d1= LocalDate.of(2022, 07, 02);
		LocalDate d2 =LocalDate.of(2022, Month.JULY	, 02);
		
		System.out.println(d1);
		System.out.println(d2);
		
		LocalTime t1= LocalTime.of(8, 50);
		LocalTime t2= LocalTime.of(8, 50, 40);
		LocalTime t3= LocalTime.of(8, 50, 40, 3455);
		
		System.out.println(t1);
		System.out.println(t2);
		
		LocalDateTime dt1= LocalDateTime.of(d1, t3);
		LocalDateTime dt2= LocalDateTime.of(2022, 07, 02, 8, 50, 40, 3333);
		System.out.println(dt1);
		System.out.println(dt2);

	}

}
