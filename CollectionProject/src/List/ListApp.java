package List;
import java.util.*;
public class ListApp {

	public static void main(String[] args) {
		List ll=new ArrayList();
		ll.add(12);
		ll.add(12);
		ll.add(13);
		ll.add(14);
		
		Iterator i=ll.iterator();
		while(i.hasNext()) {
			Object obj=i.next();
			System.out.println(obj);
		}
	}

}
