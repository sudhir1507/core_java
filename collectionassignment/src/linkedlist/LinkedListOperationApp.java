package linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListOperationApp {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		
		int val;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("\n1 . Add New Element in Linkedlist at begining");
			System.out.println("2 .Add New Element at the end of Linkedlist");
			System.out.println("3 .Search the value from linkedlist");
			System.out.println("4 .Delete the element from linkedlist");
			System.out.println("5 .Display the total size of linkedlist");
			System.out.println("6 .Check LinkedList is empty or not id empty then display message linkedlist empty otherwise show message linkedlist is not empty");
			System.out.println("7 .Travel the linkedlist in forward as well as backward direction");
			System.out.println("Enter choice ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter element to add at begining");
				val=sc.nextInt();
				list.addFirst(val);
				break;
			case 2:
				System.out.println("Enter element to add at end");
				val=sc.nextInt();
				list.addLast(val);
				break;
			case 3:
				System.out.println("Enter element to search");
				val=sc.nextInt();
				boolean isfound=list.contains(val);
				if(isfound) {
					System.out.println("Element found");
				}else {
					System.out.println("Element not found");
				}
				break;
			case 4:
				System.out.println("Enter element to delete");
				val=sc.nextInt();
				list.remove(val);
				break;
			case 5:
				System.out.println("Size of LinkedList "+list.size());
				break;
			case 6:
				boolean isempty=list.isEmpty();
				if(!isempty) {
					System.out.println("List is not Empty");
				}else {
					System.out.println("List is Empty");
				}
				break;
			case 7:
				System.out.println("Linkedlist in forward direction ");
				ListIterator li=list.listIterator();
				while(li.hasNext()) {
					Object obj=li.next();
					System.out.println();
				}
				System.out.println("Linkedlist in forward direction ");
                
				break;
			default:
				System.out.println("Worng choice..!");
			}
		}while(true);

	}

}
