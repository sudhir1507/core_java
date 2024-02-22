package arrayList;
import java.util.*;
public class RemoverIfMethod {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList();
//        a.add(5);
//        a.add(9);
//        a.add(20);
//        a.add(25);
//        a.add(27);
		  a.add("Sudhir");
		  a.add("Gajanan");
		  a.add("Mahesh");
		  a.add("Shivam");
		  a.add("Harsh");
//       remove name start with s 
		  a.removeIf(n->(n.charAt(0)=='S'));
        //remove those elements divisible by 5
//        a.removeIf(n->(n%5==0));
        for(Object o:a) {
        	System.out.println(o);
        }
	}

}
