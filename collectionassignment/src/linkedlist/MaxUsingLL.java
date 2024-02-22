package linkedlist;
import java.util.*;
public class MaxUsingLL {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add(100);
		list.add(200);
		list.add(500);
		list.add(30);
		list.add(24);
		list.add(56);
	    int max=(int)list.get(0);
		for(int i=0;i<list.size();i++) {
			if(max<(int)list.get(i)) {
				max=(int)list.get(i);
			}
		}
	  System.out.println("Maximum is : "+max);
	}

}
