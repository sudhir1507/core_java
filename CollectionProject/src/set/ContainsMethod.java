package set;
import java.util.*;
public class ContainsMethod {

	public static void main(String[] args) {
		Set s=new HashSet();
		s.add(20);
		s.add("Abc");
		
		s.add(new Date());
		s.add(23.4f);
		s.add(23.34);
		s.add(true);
		s.add('S');
		System.out.println(s);
		s.remove("Abc");
		System.out.println(s);
		if(s.contains(20)) {
			System.out.println("present");
		}else {
			System.out.println("Not present");
		}
	}

}
