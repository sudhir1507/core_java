package colloctionpractical1;
import java.util.*;
public class VectorOpertionAPp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vector v=new Vector();
		do {
			
			System.out.println("\n1 . add new element");
			System.out.println("2 . display all elements ");
			System.out.println("3 . search specific elements");
			System.out.println("4 . delete element");
			System.out.println("5 . sort elements in ascending order");
			System.out.println("6 . sort elements in ascending order");
			System.out.println("7 . find max element");
			System.out.println("8 . find min element");
			System.out.println("Enter choice :");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter element to vector :");
				int data=sc.nextInt();
				v.add(data);
				break;
			case 2:
				Iterator i=v.iterator();
				while(i.hasNext()) {
					Object obj=i.next();
					System.out.print(obj+" ");
				}
				break;
			case 3:
				System.out.println("Enter element to search :");
				data=sc.nextInt();
				boolean b=v.contains(data);
				if(b) {
					System.out.println("Data Found..");
				}else {
					System.out.println("Data Not Found..");
				}
				break;
			case 4:
				System.out.println("Enter element to delete");
				data=sc.nextInt();
				int index=v.indexOf(data);
				if(index!=-1) {
					v.remove(index);
					System.out.println("element removed..");
				}else {
					System.out.println("not found element to delete");
				}
				break;
			case 5:
				System.out.println("Elements sorted in ascending order ");
				Collections.sort(v);
				break;
			case 6:
				System.out.println("Elements sorted in descending order");
				Collections.sort(v,Collections.reverseOrder());
				break;
			case 7:
				System.out.println("Maximum Element of vector array");
				System.out.println(Collections.max(v));
				break;
			case 8:
				System.out.println("Minimun element of vector array ");
				System.out.println(Collections.min(v)); 
				break;
			default:
				System.out.println("Wrong choice..!");
			
			}
		}while(true);
	}

}
