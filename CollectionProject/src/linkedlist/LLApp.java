package linkedlist;
import java.util.*;
public class LLApp {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add(10);
		list.add(30);
		list.add(40);
		list.add(60);
		
		list.add(1, 20);
		list.set(0, 1000);
		
		//list.remove(2);
		System.out.println(list.get(4));
		System.out.println(list);

	}

}
