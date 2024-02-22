package arrayaList;

import java.util.ArrayList;
import java.util.Collections;

public class RepeatativElement {

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
		int count=1;
		for(int i=0;i<al.size();i++) {    //100 100 100 200 200 300 400
			for(int j=i+1;j<al.size();j++) {
				if(al.get(i)==al.get(j))
				{
					al.remove(al);
				}
			}
			
		}
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
//		System.out.println(al.get(i)+"---->"+count);


	}

}
