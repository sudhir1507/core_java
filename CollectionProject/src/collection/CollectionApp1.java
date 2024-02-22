package collection;

import java.util.*;

public class CollectionApp1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of ArrayList");
		int n=sc.nextInt();
		ArrayList<Integer> al=new ArrayList<>(n);
		System.out.println("Enter the Elements ");
		
		for(int i=0;i<n;i++) {
			al.add(sc.nextInt());
		}
		System.out.println("ArrayList ");
		Iterator i=al.iterator();
		while(i.hasNext()) {
			Object obj=i.next();
			System.out.println(obj);
		}

	}

}
