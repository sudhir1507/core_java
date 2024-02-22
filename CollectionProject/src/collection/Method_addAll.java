package collection;
import java.util.*;
public class Method_addAll {

	public static void main(String[] args) {
		Collection l1=new ArrayList() ;
		l1.add(100);
		l1.add(200);
		l1.add(300);
		
		Collection l2=new ArrayList() ;
		boolean b=l2.addAll(l1);
		if(b) {
			System.out.println("Added..");
		}else {
			System.out.println("Not Added");
		}
		
		Iterator ii=l2.iterator();
		while(ii.hasNext()) {
			Object obj=ii.next();
			System.out.println(obj);
		}
	}

}
