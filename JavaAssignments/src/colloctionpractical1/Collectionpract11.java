package colloctionpractical1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Collectionpract11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Arraylist ");
		int size=sc.nextInt();
		ArrayList list=new ArrayList(size);
		System.out.println("Enter elements");
		for(int i=0;i<size;i++) {
			list.add(sc.nextInt());
		}
		do {
		System.out.println("\n1 . display all elements");
		System.out.println("2 . search specific elements");
		System.out.println("3 . add new element");
		System.out.println("4 . delete element");
		System.out.println("5 . sort elements in ascending order");
		System.out.println("6 . sort elements in ascending order");
		System.out.println("7 . find max element");
		System.out.println("8 . find min element");
		System.out.println("Enter choice :");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Iterator i=list.iterator();
			while(i.hasNext()) {
				Object obj=i.next();
				System.out.print(obj+" ");
			}
			break;
		case 2:
			System.out.println("Enter element to search");
			int el=sc.nextInt();
			boolean b=list.contains(el);
			if(b) {
				System.out.println("Element found ");
			}else {
				System.out.println("Element not found");
			}
			break;
		case 3:
			System.out.println("Enter element to add");
			int ad=sc.nextInt();
			list.add(ad);
			break;
		case 4:
			System.out.println("Enter index to delete");
			int del=sc.nextInt();
			list.remove(del);
			System.out.println("Element removed");
			break;
		case 5:
			System.out.println("sorting in descending order");
			for(int j=0;j<list.size();j++) { //4 3 2 6 3
				for(int k=j+1;k<list.size();k++) {
					int x=(int)list.get(j);  // 4 
					int y=(int)list.get(k);  // 3
					if(x<y) {  //
						int temp=x;
						list.set(j, y);  // 0 2
						list.set(k, temp);  // 1 1
						
					}
				}
			}
			
			break;
		case 6:
			System.out.println("Sorting in descending order");
			for(int j=0;j<list.size();j++) {
				for(int k=j+1;k<list.size();k++) {
					int x=(int)list.get(j);
					int y=(int)list.get(k);
					if(x>y) {  //3 1 7 2
						int temp=x; //t=3
						list.set(j, y); // 1
						list.set(k, temp); //3
						
					}
				}
			}
			break;
		case 7:
			System.out.println("MAX of ArrayList");
			int max=(int)list.get(0);
			for(int j=0;j<list.size();j++) {
					int x=(int)list.get(j);
					if(max<x) {  //3 1 7 2
						 max=x;
					}
				}
			System.out.println("maximum is "+max);
			break;
		case 8:
			System.out.println("Min of ArrayList");
			int min=(int)list.get(0);
			for(int j=0;j<list.size();j++) {
					int x=(int)list.get(j);
					if(min>x) {  //3 1 7 2
						 min=x;
					}
				}
			System.out.println("minimum is "+min);
		
		}
		}while(true);
	}

}
