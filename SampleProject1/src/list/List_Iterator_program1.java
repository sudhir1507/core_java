package list;

import java.util.ArrayList;
import java.util.ListIterator;

public class List_Iterator_program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(null);
		list.add(300);
		list.add(400);
		list.add(null);
		list.add(null);
		list.add(500);
		
		ListIterator itr=list.listIterator();
		while(itr.hasNext()) {
			if(itr.next()==null) {
				//itr.remove();
				itr.set(0);
			}
		}
		System.out.println(list);
	}

}
