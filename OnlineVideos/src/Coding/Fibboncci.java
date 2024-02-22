package Coding;

public class Fibboncci {

	public static void main(String[] args) {
		int n1=0,n2=1,n3,count=10;
		System.out.print(n1+" "+n2);
		for(int i=2;i<count;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}

	}

}
//upto given number
//int n=100,firstnum=0,secondnum=1;
//
//while(firstnum<=n){
//	System.out.print(firstnum+" ");
//	int nextterm=firstnum+secondnum;
//	firstnum=secondnum;
//	secondnum=nextterm;
//	
//}