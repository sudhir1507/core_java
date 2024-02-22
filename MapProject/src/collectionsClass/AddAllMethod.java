package collectionsClass;
import java.util.*;
public class AddAllMethod {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		Collections.addAll(al, 9,3,8,4,7,5,6);
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
		
//		Collections.sort(al,Collections.reverseOrder());
//		System.out.println(al);
//		
		System.out.println("index of  8 is "+Collections.binarySearch(al,8));
	}

}
