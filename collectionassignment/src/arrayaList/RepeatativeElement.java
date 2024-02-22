package arrayaList;

import java.util.ArrayList;
import java.util.Collections;

public class RepeatativeElement {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList();
		al.add (100);
		al.add (200);
		al.add (300);
		al.add (100);
		al.add (400);
		al.add (200);
		al.add (100);
    	Collections.sort(al);
    	System.out.println(al);
		int count=1,i;
		for( i=0;i<al.size()-1;i++) {    //100 100 100 200 200 300 400
			
				if(al.get(i).equals(al.get(i+1))) {
					count++;
				}else {
					System.out.println(al.get(i)+"--->"+count);
					count=1;
			    }
			
		}
		System.out.println(al.get(i)+"---->"+count);

	}

}
