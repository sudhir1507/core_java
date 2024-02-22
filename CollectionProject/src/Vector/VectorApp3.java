package Vector;
import java.util.*;
public class VectorApp3 {

	public static void main(String[] args) {
		Vector v=new Vector(3,2);
		System.out.println("Capacity of vector "+v.capacity());
		System.out.println("size of vector " +v.size());
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
	
		
		System.out.println("Capacity of vector "+v.capacity());
		System.out.println("size of vector " +v.size());
	
	}

}
