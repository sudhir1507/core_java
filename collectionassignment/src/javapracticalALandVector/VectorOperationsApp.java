package javapracticalALandVector;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class VectorOperationsApp {

	public static void main(String[] args) {
		Vector v=new Vector();
		int val;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("\n1 . Add 10 elements in Vector");
			System.out.println("2 .Display all Elements of Vector");
			System.out.println("3 .Add new Element in Vector");
			System.out.println("4 .Search the value from Vector");
			System.out.println("5 .Sort all values in Acending order");
			System.out.println("6 .Sort all values in descending order");
			System.out.println("7 .find max value in Vector");
			System.out.println("8 .find min value in Vector");
			System.out.println("9 .Update value in Vector ");
			System.out.println("10 .Delete value in Vector");
			System.out.println("Enter choice ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter 10 values in Vector");
				for(int i=0;i<10;i++) {
					v.add(sc.nextInt());
				}
				break;
			case 2:
				System.out.println("All values of Vector");
				for(Object obj:v) {
					System.out.println(obj);
				}
				break;
			case 3:
				System.out.println("Add value to vector");
				v.add(sc.nextInt());
				System.out.println("Added Succesfully..!");
				break;
			case 4:
				System.out.println("Enter value to search");
				boolean isfound=v.contains(sc.nextInt());
				if(isfound) {
					System.out.println("Element found");
				}else {
					System.out.println("Element Not found");
				}
				break;
			case 5:
				System.out.println("Vector values in Ascending order");
				Collections.sort(v);
				for(Object obj:v) {
					System.out.println(obj);
				}
				break;
			case 6:
				System.out.println("Vector values in Descending order");
				Collections.sort(v,Collections.reverseOrder());
				for(Object obj:v) {
					System.out.println(obj);
				}
				break;
			case 7:
				System.out.println("Maximum of Vector "+Collections.max(v));
				break;
			case 8:
				System.out.println("Minimum of Vector "+Collections.min(v));
				break;
			case 9:
				System.out.println("Enter index and value to update");
				int index=sc.nextInt();
				val=sc.nextInt();
				v.set(index, val);
				System.out.println("Updated successfully..");
				break;
			case 10:
				System.out.println("Enter value to delete");
				val=sc.nextInt();
			    int pos=v.indexOf(val);
			    v.remove(pos);
				System.out.println("deleted successfully..");
				
				break;
			default:
				System.out.println("Worng choice");
				
			}
		}while(true);

	}

}
