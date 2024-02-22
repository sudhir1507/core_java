package arrayList;
import java.util.*;
public class ArrayListApp {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(0, 10);
		
		a.remove(2); //index removel
		//a.remove(50);
		
		System.out.println(a);
		a.add(2,100);
		System.out.println(a);
//		System.out.println("ArrayList element");
//		for(int i=0;i<a.size();i++) {
//			System.out.println( a.get(i));
//		}
		
//		for(Object obj:a) {
//			System.out.println(obj);
//		}

	}

}
