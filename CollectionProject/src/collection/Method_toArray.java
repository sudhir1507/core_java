package collection;
import java.util.*;
public class Method_toArray {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		
		Object obj[]=al.toArray();
		for(int i=0;i<obj.length;i++) {
			System.out.println(obj[i]);
		}
	}
}
