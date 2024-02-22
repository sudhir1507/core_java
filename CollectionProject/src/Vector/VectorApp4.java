package Vector;
import java.util.*;
public class VectorApp4 {

	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add(10);
		c.add(2);
		c.add("aa");
		c.add('Q');
		
		Vector v=new Vector(c);
		System.out.println(v);

	}

}
