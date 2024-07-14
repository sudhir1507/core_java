package collection;

import java.util.*;

class CStack{
	Deque q=new LinkedList();        // f-10 20 30 40 50-e
    public void push(Object o){
        q.add(o);
    }
    public void pop(){
    
        q.removeLast();
    }
    public void display() {
    	System.out.println(q);
    }
}
public class CustomStack {

	public static void main(String[] args) {
		CStack s=new CStack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.pop();
		s.display();
	}

}
