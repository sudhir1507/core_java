package collection;
import java.util.*;
public class CollectionApp2 {

	public static void main(String[] args) {
		Collection ii=new ArrayList();
		ii.add(100);
		ii.add(200);
		ii.add(300);
		ii.add(4000);
		
		Iterator i=ii.iterator();
		while(i.hasNext()) {
			Object obj=i.next();
			System.out.println(obj);
		}
//		for(Object i:ii) {
//			System.out.println(i);
//		}

	}

}
