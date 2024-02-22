package linkedHashSet;
import java.util.*;
public class LinkedHashSetApp {

	public static void main(String[] args) {
		LinkedHashSet lset=new LinkedHashSet();
		lset.add(10);
		lset.add(20);
		lset.add(30);
		lset.add(40);
		lset.add(50);
		lset.add(60);
	    
		for(Object obj:lset) {
			System.out.println(obj);
		}
		
		LinkedHashSet set=new LinkedHashSet(lset);
		for(Object obj:set) {
			System.out.println(obj);
		}
	}

}
