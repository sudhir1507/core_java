package set;

import java.util.*;

public class SetAddMethod {

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
		

	}

}
