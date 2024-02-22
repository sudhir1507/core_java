package arrayaList;

import java.util.Collections;
import java.util.Iterator;
import java.util.*;

public class FindUniqueValues {

		public static void main(String[] args) {
			
			ArrayList v = new ArrayList();
			v.add(200);
			v.add(65);
			v.add(200);
			v.add(500);
			v.add(600);
			v.add(65);
			v.add(800);
			v.add(500);
			System.out.println("Before Delete DATA:"+v);
				
			for(int i=0;i<v.size();i++)
			{
				for(int j=(i+1);j<v.size();j++)
				{
					if((int)v.get(i)==(int)v.get(j))
					{
						
						v.set(i, -1);
						v.set(j, -1);
						
					}
				}
				
			}
			
			
			Iterator iter = v.iterator();
			while (iter.hasNext()) {
				
				Object it = iter.next();
				if((int)it==-1)
				{
					iter.remove();
					
				}
				
			}
		
			System.out.println("After Delete DATA:"+v);
		}
}
