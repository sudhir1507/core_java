package hashSet;
import java.util.*;
public class HashSetC {

	public static void main(String[] args) {
		ArrayList set=new ArrayList();
		set.add(10);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(80);
		System.out.println("ArrayList is :"+set);
		HashSet s=new HashSet(set);
		System.out.println("Set is :"+s);
		

	}

}
