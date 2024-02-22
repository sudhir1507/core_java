package sortedset;
import java.util.*;
public class FirstLastMethod {

	public static void main(String[] args) {
		SortedSet set=new TreeSet();
		
		set.add(34);
		set.add(344);
		set.add(10);
		set.add(1);
		set.add(40);
		
		System.out.println("This is first or lowest element "+set.first());
        System.out.println("This is last or highest element "+set.last());
	}

}
