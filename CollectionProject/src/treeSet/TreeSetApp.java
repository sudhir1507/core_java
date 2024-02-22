package treeSet;
import java.util.*;
public class TreeSetApp {

	public static void main(String[] args) {
		//TreeSet set=new TreeSet();
		
		SortedSet s=new TreeSet();
		s.add(230);
		s.add(120);
		s.add(201);
		TreeSet set=new TreeSet(s);
//		set.add(230);
//		set.add(120);
//		set.add(201);
//		set.add(100);
//		set.add(300);
//		set.add(500);
		
		for(Object obj:set) {
			System.out.println(obj);
		}

	}

}
