package Program_on_Inheritance;

import java.util.Scanner;

class ArrInsert{
	int a[];
	int index,value;
	void setArr(int a[],int index,int value) {
		this.a=a;
		this.index=index;
		this.value=value;
	}
	public int[] getArray() {
		 for(int i=a.length-2;i>=index;i--) {  //6-2 4  4>=2 4--
			 a[i+1]=a[i];
		 }
		 a[index]=value;
		 return a;
	}
	
}
public class InsertElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size ");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<size-1;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter index and value");
		int index=sc.nextInt();
		int value=sc.nextInt();
		ArrInsert obj=new ArrInsert();
		obj.setArr(a, index, value);
		int res[]=obj.getArray();
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]+" ");
		}

	}

}
