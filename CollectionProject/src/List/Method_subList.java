package List;

import java.util.ArrayList;
import java.util.List;

public class Method_subList {

	public static void main(String[] args) {
		List ll=new ArrayList();
		ll.add(100);
		ll.add(200);
		ll.add(300);
		ll.add(400);
		ll.add(500);
		ll.add(600);
		System.out.println(ll);
		List l1=ll.subList(1, 3);
		System.out.println(l1);

	}

}
