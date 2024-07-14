package Vector;
import java.util.*;
public class StringConcatApp {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("I");
		v.add("am");
		v.add("Indian");
		String s="";
		Iterator i=v.iterator();
		while(i.hasNext()) {
			Object obj=i.next();
			s=s+(String)obj+" ";
		}
		System.out.println(s);
	}

}
