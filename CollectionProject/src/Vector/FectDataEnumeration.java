package Vector;
import java.util.*;
public class FectDataEnumeration {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of vector :");
		int size=sc.nextInt();
		Vector v=new Vector(size);
		System.out.println("Enter element in vector ");
		for(int i=0;i<size;i++) {
			v.add(sc.nextInt());
		}
		System.out.println("Vector elements");
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			Object obj=e.nextElement();
			System.out.println(obj);
		}
		
	}

}
