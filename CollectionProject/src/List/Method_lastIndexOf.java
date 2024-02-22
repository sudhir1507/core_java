package List;

import java.util.ArrayList;
import java.util.List;

public class Method_lastIndexOf {

	public static void main(String[] args) {
		List ll=new ArrayList();
		ll.add(100);
		ll.add(200);
		ll.add(300);
		ll.add(400);
		ll.add(200);
		ll.add(500);

		
		int idx=ll.lastIndexOf(200);
		System.out.println(idx);
	}

}
