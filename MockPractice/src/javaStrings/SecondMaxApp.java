package javaStrings;
//second max
public class SecondMaxApp {

	public static void main(String[] args) {
		int arr[]=new int[] {21,3,42,52,46,3,12};
		int first=arr[0];
		int second=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(first<arr[i]) {   //52<46
				second=first; //s=42
				first=arr[i];  //f=52
			}else {
				if(arr[i]>second&&arr[i]!=first) { //46>42
					second=arr[i];  //s=46
				}
			}
		}
		if(first==second) {
			System.out.println("No second element max");
		}else {
			System.out.println("second max "+second);
		}
	}

}
