package collectionsClass;
import java.util.*;
public class FreaquencyOfDigitsInArraY {

	public static void main(String[] args) {
		List list=new ArrayList(10);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements of arrayList");
		for(int i=0;i<10;i++) {
			int a=sc.nextInt();
			list.add(a);
		}
		
		System.out.println("Frequency of each digits ");
		HashSet set=new HashSet(list);
		
		for(Object obj:set) {
			System.out.println(obj+" "+Collections.frequency(list, obj)
			);
		}

	}

}
