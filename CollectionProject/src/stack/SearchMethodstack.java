package stack;
import java.util.*;
public class SearchMethodstack {

	public static void main(String[] args) {
		Stack s=new Stack();
		
		s.push(20);
		s.push(40);
		s.push(60);
		s.push(80);   //this is top of the stack and search method start its count from top
		
		System.out.println("stack is "+s);
		int pos=s.search(90);
		if(pos!=-1) {
			System.out.println("Element present at "+pos);
		}else {
			System.out.println("Element not found ");
		}
	}

}
