package arrays;

public class Array_2D {

	public static void main(String[] args) {
		
		String [][] arr= 
				{
				{"A","B","C"},
				{"D","E","F"},
				{"AB","CD","EF","GH"}
				};
		
		System.out.println(arr.length);
		System.out.println(arr[2].length);
		
		System.out.println(arr[2][1]);
		arr[2][1]="XZ";
		System.out.println(arr[2][1]);
		
		for(String[] x: arr ) {
			for(String y: x) {
				System.out.println(y);
			}
			System.out.println("------------");
		}
	}

}
