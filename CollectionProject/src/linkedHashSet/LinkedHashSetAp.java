package linkedHashSet;
import java.util.*;
public class LinkedHashSetAp {

	public static void main(String[] args) {
		LinkedHashSet set=new LinkedHashSet();
        set.add(30);
        set.add(50);
        set.add(70);
        set.add(90);
        
        if(set.contains(30))
        	System.out.println("yes");
        else 
        	System.out.println("No");
        
        set.clear();
	}

}
