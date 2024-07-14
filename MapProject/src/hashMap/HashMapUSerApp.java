package hashMap;

import java.util.*;


public class HashMapUSerApp {

	public static void main(String[] args) {
		HashMap map=new HashMap();
        Scanner sc=new Scanner(System.in);
       
        for(int i=0;i<5;i++){
            System.out.println("enter key and values");
            int ke=sc.nextInt();
            
            String val=sc.nextLine();
            map.put(ke,val);
        }
       Set keys = map.keySet();
       Iterator i=keys.iterator();
       while(i.hasNext()){
           Object k=i.next();
           Object v=map.get(k);
            System.out.println("key= "+k+" and values= "+v);
       }

	}

}
