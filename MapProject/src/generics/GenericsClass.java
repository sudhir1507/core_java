package generics;
import java.util.*;
public class GenericsClass {

	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
		al.add(100);
		al.add(200);
		al.add(3.23f);
		al.add("abc");
		al.add("mno");
		al.add(500);
		int sum=0;
		for(Object obj:al) {
			if(obj instanceof Integer) {
				sum+=(int)obj;
			}
		}
		System.out.println("Sum is "+sum);
	}

}
