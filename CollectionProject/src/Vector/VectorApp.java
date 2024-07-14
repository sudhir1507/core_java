package Vector;
import java.util.*;
public class VectorApp {

	public static void main(String[] args) {
//constructor create vector object with default initial capacity
// 10 if its capacity get cross it will occupies double the 
//memories than its current capacity
		Vector v=new Vector();  
		System.out.println("Capacity of vector "+v.capacity());
		System.out.println("size of vector " +v.size());
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		Enumeration em=v.elements();
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
		System.out.println("Capacity of vector "+v.capacity());
		System.out.println("size of vector " +v.size());
	}

}
