package linkedlist;
import java.util.*;
public class CloneMethod {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add("abc");
		list.add("pqr");
		list.add("mno");
		list.add("stv");
		list.add("rst");
		System.out.println("first list "+list);
		LinkedList ll=new LinkedList();
		ll=(LinkedList)list.clone();
		System.out.println("second list "+ll);
	}

}
