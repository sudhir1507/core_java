package List;
import java.util.*;
public class Method_add {

	public static void main(String[] args) {
		List ll=new LinkedList();
		ll.add(100);
		ll.add(200);
		ll.add(300);
		ll.add(400);
		ll.add(500);
		System.out.println(ll);
		ll.add(2, 9999);
		System.out.println(ll);
	}

}
