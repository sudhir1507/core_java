package collectionsClass;
import java.util.*;
public class CollectionsClassApp {

	public static void main(String[] args) {
		List al=new ArrayList(5);
		Collections.addAll(al, 5,2,9,5,2);
		
		List list=new ArrayList(10);
		list.add(12);
		Collections.copy(list, al);
		System.out.println(list);
		for(Object obj:list) {
			System.out.println(obj);
		}
		//System.out.println(Collections.disjoint(al, list));

	}

}
