package stack;
import java.util.*;
public class RemoveElementsMEthod {

	public static void main(String[] args) {
		Stack s=new Stack();
        s.add(20);
        s.add(40);
        s.add(60);
        s.add(80);
        System.out.println(s);
        System.out.println("index of "+s.indexOf(60));
        s.removeElementAt(2);
        System.out.println(s);
	}

}
