package List;
import java.util.*;
public class Method_get {

	public static void main(String[] args) {
		List ll=new ArrayList();
		ll.add(100);
		ll.add(200);
		ll.add(300);
		ll.add(400);
		//to fetch the data from list collection
//		for(int i=0;i<ll.size();i++) {
//			Object obj=ll.get(i);
//			System.out.println(obj);
//		}
		
		//search data using index
		Object obj=ll.get(2);
		if(obj!=null) {
			System.out.println("Data Found");
		}else {
			System.out.println("Not found");
		}
	}

}
