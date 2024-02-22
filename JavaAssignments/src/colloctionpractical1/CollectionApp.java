package colloctionpractical1;
import java.util.*;
public class CollectionApp {

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
			System.out.println("sorting in ascending order");
			Collections.sort(list);
			System.out.println(list);
			break;
		case 6:
			System.out.println("Sorting in descending order");
			Collections.sort(list,Collections.reverseOrder());
			System.out.println(list);
			break;
		case 7:
			System.out.println("MAX of ArrayList");
			Object o=Collections.max(list);
			System.out.println(o);
			break;
		case 8:
			System.out.println("Min of ArrayList");
			Object ob=Collections.min(list);
			System.out.println(ob);
		
		}
		}while(true);

	}

}
