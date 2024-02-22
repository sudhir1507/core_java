package list;
import java.util.LinkedList;
public class Linked_List {

	public static void main(String[] args) {
		var List = new LinkedList<Double>();
		List.add(1.1);
		List.add(1.2);
		List.add(1.3);
		List.add(1.3);
		List.add(1.4);
		List.add(1.5);
		List.add(1.6);
		
		//System.out.println(List.get(2));
		//List.set(2, 3.3);
		//System.out.println(List.get(2));
		
		//List.clear();
		//List.remove(2);
		//List.add(3, 6.6);
		
		System.out.println(List.peekFirst());
		System.out.println(List.peekLast());
		
		System.out.println(List.pollFirst());
		System.out.println(List.pollLast());

		System.out.println(List);
//		System.out.println(List.indexOf(1.3));
//		System.out.println(List.lastIndexOf(1.3));
//		System.out.println(List.contains(99.0));
//		System.out.println(List.subList(2, 4));
	
	}
}
