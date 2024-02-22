package collection;
import java.util.*;
public class Method_clear {

	public static void main(String[] args) {
		Collection cc=new ArrayList();
		cc.add(10);
		cc.add(30);
		cc.add("aaa");
		System.out.println("Size : "+cc.size());
		System.out.println(cc);
		cc.clear();
		System.out.println("Size : "+cc.size());
	}

}
