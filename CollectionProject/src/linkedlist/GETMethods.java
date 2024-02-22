package linkedlist;
import java.util.*;
public class GETMethods {

	public static void main(String[] args) {
		LinkedList al=new LinkedList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		
		
		Object v2=al.getFirst();
		System.out.println(v2);
		
		Object v3=al.getLast();
		System.out.println(v3);
		
		Object v1=al.get(2);
		System.out.println(v1);
		
	}

}
