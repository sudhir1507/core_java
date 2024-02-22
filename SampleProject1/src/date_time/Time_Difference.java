package date_time;

import java.time.Duration;
import java.time.LocalTime;

public class Time_Difference {

	public static void main(String[] args) {
		LocalTime t1 = LocalTime.of(7, 20);
		 Duration d= Duration.between(t1, LocalTime.now());
		System.out.println(d);
		System.out.println(d.toHours());
		System.out.println(d.toMinutes());

	}

}
