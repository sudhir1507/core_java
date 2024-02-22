package Coding;
import java.util.*;
class Sort{
	int arr[];
	public void sortmethod(int a[]){
		arr=a;
	}
	public void show() {
		for(int i=0;i<arr.length;i++)
		   {
			   for(int j=i+1;j<arr.length;j++)
			   {
				   if(arr[i]>arr[j])
				   {
					   int temp=arr[i];
					       arr[i]=arr[j];
					       arr[j]=temp;
				   }
			   }
		   }
		   for(int i=0;i<arr.length;i++)
		   {
			   System.out.printf("a[%d]--->%d\n",i,arr[i]);
		   }
	}
}
public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner xyz=new Scanner(System.in);
   int a[]=new int[5];
   System.out.println("Enter the array value");
   for(int i=0;i<a.length;i++)
   {
	   a[i]=xyz.nextInt();
   }
   Sort s=new Sort();
   s.sortmethod(a);
   s.show();
   
		 
	}

}
