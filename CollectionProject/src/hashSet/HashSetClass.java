package hashSet;
import java.util.*;
public class HashSetClass {

	public static void main(String[] args) {
		HashSet set=new HashSet();
		
		set.add(10);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(60);
		System.out.println("capacity of hashset "+set.size());
		System.out.println(set);

	}

}
