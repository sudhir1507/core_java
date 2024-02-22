package Coding;

import java.util.*;
class  Test1{
    public void show(int a,int b){
        int c=a+b;
        System.out.println("sum is "+c);
    }
}
public class Test{
public static void main(String X[]){
	int a,b,c;
	// a=Integer.parseInt(X[0]);
	// b=Integer.parseInt(X[1]);
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of a and b\n");
	a=sc.nextInt();
	b=sc.nextInt();
	Test1 t=new Test1();
	t.show(a,b);
	
}
}
