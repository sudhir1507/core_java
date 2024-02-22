package collection;
import java.util.*;
public class Method_remove_add_boolean {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(22);
		al.add(23);
		al.add(24);
		
		boolean b=al.add(50);
		
		if(b) {
			System.out.println("Added ...");
		}else {
			System.out.println("Not Added..");
		}

	}

}
