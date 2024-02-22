package java_basics;

public class Nested_if {

	public static void main(String[] args) {
//		int marks=99;
//		if(marks>=90) {
//			System.out.println("A grade");
//		}else if (marks>75){
//			System.out.println("B grade");
//		}else if(marks>60) {
//			System.out.println("C grade");
//		}else if(marks>40) {
//			System.out.println("D grade");
//		}else {
//			System.out.println("fail");
//		}
		
		
// greatest number among  3 numbers
		int n1=500;
		int n2=200;
		int n3=300;
		if(n1>n2 && n1>n3) {
			System.out.println("n1 is grater");
		}else if(n2>n1 && n2>n3) {
			System.out.println("n2 is grater");
		}else {
			System.out.println("n3 is grater");
		}
	}

}
