package javapracticalALandVector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int val;
		ArrayList list=new ArrayList<>();
		do {
			System.out.println("\n1 . Add 10 elements in Arraylist");
			System.out.println("2 .Display all Elements of AL");
			System.out.println("3 .Add new Element in Al");
			System.out.println("4 .Search the value from Al");
			System.out.println("5 .Sort all values in Acending order");
			System.out.println("6 .Sort all values in descending order");
			System.out.println("7 .find max value in Al");
			System.out.println("8 .find min value in Al");
			System.out.println("9 .Update value in Al ");
			System.out.println("10 .Delete value in Al");
			System.out.println("Enter choice ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter 10 values in AL");
				for(int i=0;i<10;i++) {
					list.add(sc.nextInt());
				}
				break;
			case 2:
				System.out.println("All values of AL");
				for(Object obj:list) {
					System.out.println(obj);
				}
				break;
			case 4:
				System.out.println("Enter value to search:");
				val=sc.nextInt();
				boolean flag=false;
				for(Object o:list) {
					if((int)o==val) {
						
						flag=true;
						break;
					}
				}
				if(flag) {
					System.out.println("Vaue is found");
				}else {
					System.out.println("Vaue is NOT found");
				}
				break;
			case 5:
				Collections.sort(list);
				System.out.println("Values of Ascending order of AL");
				for(Object obj:list) {
					System.out.println(obj);
				}
				break;
			case 6:
				Collections.sort(list,Collections.reverseOrder());
				System.out.println("Values of Desceneding order of AL");
				for(Object obj:list) {
					System.out.println(obj);
				}
				break;
			case 3:
				System.out.println("Add new Element in AL");
				val=sc.nextInt();
				list.add(val);
				break;
			case 7:
				System.out.println("Maximum of Al "+Collections.max(list));
				
				break;
			case 8:
				System.out.println("Minimum of Al "+Collections.min(list));

				break;
			case 9:
				System.out.println("Enter value and index to update in AL");
				int index=sc.nextInt();
				val=sc.nextInt();
				list.set(index, val);
				System.out.println("Updated succesfully..!");
				break;
			case 10: 
				System.out.println("Enter value to delete from AL");
				val=sc.nextInt();
				int pos=list.indexOf(val);
				list.remove(pos);
				System.out.println("Deleted successfully...");
				break;
			default:
				System.out.println("Worng choice");
			}
		}while(true);

	}

}
