package collection;
import java.util.*;
public class Method_contains {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		boolean b=al.contains(20);
		if(b) {
			System.out.println("Element found..");
		}else {
			System.out.println("Element Not found..");
		}

	}

}
