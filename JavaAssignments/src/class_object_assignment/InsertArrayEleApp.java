package class_object_assignment;

import java.util.Scanner;

class InsertArrayEle{
	int c[];
	void setIntArray(int ch[]) {
		c=ch;
		
	}
	void insertValueOnIndex() {
		System.out.println("Enter value and Index to insert Element : ");
		Scanner sc=new Scanner(System.in);
		int val=sc.nextInt();
		int index=sc.nextInt();
		for(int i=(c.length-2);i>=index;i--) {
			c[i+1]=c[i];
		}
		c[index]=val;
		System.out.println("Array After Inserting Value :");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+"\t");
		}
	}
}
public class InsertArrayEleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		System.out.println("Enter the size of array:");
		Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int ch[]=new int[size];
        System.out.println("Enter array Elements :");
        for (int i = 0; i < ch.length-1; i++) {
			ch[i]=sc.nextInt();
		}
     InsertArrayEle ii=new InsertArrayEle();
     ii.setIntArray(ch);
     ii.insertValueOnIndex();
	}

}
