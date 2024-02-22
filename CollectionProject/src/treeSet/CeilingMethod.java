package treeSet;
import java.util.*;
public class CeilingMethod {

	public static void main(String[] args) {
		TreeSet set=new TreeSet();
		set.add(230);
		set.add(120);
		set.add(201);
		set.add(100);
		set.add(300);
		set.add(500);
		
//		TreeSet s=new TreeSet();
//		s=(TreeSet)set.clone();
		//System.out.println("Ceiling of 150 is "+set.ceiling(150));
       //System.out.println(set);
//        set.clear();
      //  System.out.println(s);
       Iterator it=set.descendingIterator();
       while(it.hasNext()) {
    	   System.out.println(it.next());
       }
	}

}
