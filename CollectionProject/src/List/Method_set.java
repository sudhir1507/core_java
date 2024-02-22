package List;
import java.util.*;
public class Method_set {

	public static void main(String[] args) {
		List ll=new ArrayList();
		ll.add(100);
		ll.add(200);
		ll.add(300);
		ll.add(400);
		
		System.out.println(ll);
		//this method replace data at specified index
		//to update data in list collection
		ll.set(2, 9999);
		
		System.out.println(ll);

	}

}
