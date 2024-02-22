package Program_on_Inheritance;

import java.util.Scanner;

abstract class ArrAbs{
	int[] arr1,arr2;
	
	public void setArray(int[] arr1,int[] arr2) {
		this.arr1=arr1;
		this.arr2=arr2;
	}
	abstract int[] getResultantArray();
}
class Intersection extends ArrAbs{
	
	public int[] getResultantArray() {
		int k=0;
		int[] arr3=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
					arr3[k++]=arr1[i];
				    
				}
			}
		}
		return arr3;
	}
}
class Union extends ArrAbs{
	
	public int[] getResultantArray() {
		int k=0;
		int[] arr3=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++) {
			arr3[k++]=arr1[i];
		}
		
		for(int i=0;i<arr2.length;i++) {   // 3  4 5 6 7 
			boolean flag=false;
			for(int j=0;j<arr1.length;j++) {
				if(arr2[i]==arr1[j]) {  //1 2 3 4 5  
					flag=true;
					break;
				}
			}
			if(!flag) {
				arr3[k++]=arr2[i];
			}
		}
		return arr3;
	}
}
public class UninAndIntersection {
    public static int SIZE=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of first array ");
		int size1=sc.nextInt();
		System.out.println("Enter size of Second array ");
		int size2=sc.nextInt();
		int arr1[]=new int[size1];
		int arr2[]=new int[size2];
		System.out.println("Enter first array elements");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter Second array elements");
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
		}
		ArrAbs obj=new Intersection();
		obj.setArray(arr1, arr2);
		int intersection[]=obj.getResultantArray();
		System.out.println("Inter section of two Array");
		for(int i=0;i<intersection.length;i++) {
			if(intersection[i]!=0)
			System.out.print(intersection[i]+" ");
		}
        ArrAbs obj1=new Union();
        obj1.setArray(arr1, arr2);
        int union[]=obj1.getResultantArray();
        System.out.println("\nUnion of two Array");
        for(int i=0;i<union.length;i++) {
   		if(union[i]!=0)
			System.out.print(union[i]+" ");
		}
	}

}
