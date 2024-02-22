package arrayaList;
import java.util.*;
public class SearchEleLL {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(100);
		list.add(200);
		list.add(300);
	    list.add(400);
	    list.add(500);
	    list.add(600);
	    list.add(700);
	    
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter values to search");
	    int value=sc.nextInt();
	    if(list.contains(value)) {
	    	System.out.println("Element found");
	    }else {
	    	System.out.println("Not Element found");
	    }
	    
	}

}
