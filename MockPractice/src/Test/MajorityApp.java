package Test;
abstract class ArrayData{
	int a[],size,number;
	public void aceptArray(int arr[],int size,int number) {
		a=arr;
		this.size=size;
		this.number=number;
	}
	public abstract boolean findMajority(); 
	
}
class FindMajority extends ArrayData{
	int count=0;
	public void aceptArray(int arr[],int size,int number) {
		super.aceptArray(arr, size, number);
	}
	@Override
	public boolean findMajority() {
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==number) {
				count++;
			}
		}
		System.out.println(count+"\t"+number);
		if(count>a.length/2) {
			
			return true;
		}else {
			return false;
		}
	}
	
}
public class MajorityApp {

	public static void main(String[] args) {
		int a[]=new int[] {2,3,3,4,4,5,9};
		FindMajority f=new FindMajority();
		f.aceptArray(a, a.length, 3);
		if(f.findMajority()) {
			System.out.println("majority element");
		}else {
			System.out.println("No Majority element");
		}
		

	}

}
