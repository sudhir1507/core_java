package class_object_assignment;

//import java.util.Iterator;
import java.util.Scanner;

class ArrayFeqCount{
	int c[],count=1,i,j;
	void setIntArray(int ch[]) {
		c=ch;
	}
	void countFeqCount() {
		for (i = 0; i < c.length-1; i++) {
			for (j = i+1; j < c.length; j++) {
				if(c[i]>c[j]) {
					int temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		for (i = 0; i < c.length-1; i++) {
			if(c[i]==c[i+1]) {
				count++;
			}else {
				System.out.println(c[i]+" ----- "+count);
				count=1;
			}
		}
		System.out.println(c[i]+" ----- "+count);
	}
}
public class ArrayFreqCountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int size=sc.nextInt();
		int ch[]=new int[size];
		System.out.println("Enter the array Elements :");
		for (int i = 0; i < ch.length; i++) {
			ch[i]=sc.nextInt();
		}
		ArrayFeqCount aa=new ArrayFeqCount();
		aa.setIntArray(ch);
		aa.countFeqCount();
	}

}
