//package ExceptionHandlingPractical;
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class ExceptionHandlingApp {
//
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		do {
//		
//		System.out.println("\n1.ArithmaticException");
//		System.out.println("2.ArrayIndexOutOfBoundsException");
//		System.out.println("3.NullPointerException Exception");
//		System.out.println("4.ClassNotFoundException");
//		System.out.println("5.NumberFormatException");
//		System.out.println("6.InputMismatchException");
//		System.out.println("\nEnter the choice :");
//		int choice=sc.nextInt();
//		switch(choice) {
//		case 1:
//			int a=4,b=0;
//			try {
//				int c=a/b;
//				System.out.println("value of c "+c);
//			}
//			catch(ArithmeticException e) {
//				System.out.println(e);
//				System.out.println("\nDivision by zero ");
//			}
//			break;
//		case 2:
//			int arr[]= {1,2,3};
//			try {
//				System.out.println(arr[4]);
//			}catch(ArrayIndexOutOfBoundsException e) {
//				System.out.println(e);
//				System.out.println("Array limit Excede ");
//			}
//			break;
//		case 3:
//			try {
//				String str=null;
//				System.out.println(str.length());
//			}
//			catch(NullPointerException e) {
//				System.out.println(e);
//				System.out.println("String is Null ");
//			}
//			break;
//		case 4:
//			try {
//				Class.forName("Car");
//			}
//			catch(ClassNotFoundException e) {
//				System.out.println(e);
//				System.out.println("Class is Not Found..");
//			}
//			break;
//		case 5:
//			try {
//				int num=Integer.parseInt("abc");
//				System.out.println(num);
//			}catch(NumberFormatException e) {
//				System.out.println(e);
//				System.out.println("this String can not converted into number");
//			}
//			break;
//		case 6:
//			try {
//				System.out.println("Enter integer value ");
//				Integer i=sc.nextInt();
//				System.out.println("Square is "+(i*i));
//			}
//			catch(InputMismatchException e) {
//				System.out.println(e);
//				System.out.println("Input integer value...");
//			}
//		}
//		
//		}while(true);
//	}
//	
//
//}
