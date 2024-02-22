package List;

import java.util.ArrayList;
import java.util.List;

public class Method_contains {

	public static void main(String[] args) {
		List ll=new ArrayList();
		ll.add(100);
		ll.add(200);
		ll.add(300);
		ll.add(400);
		
		boolean b=ll.contains(2000);
		if(b) {
			System.out.println("found");
		}else {
			System.out.println("Not found");
		}

	}

}
