package arrayuse;

public class AnnonyusArr {
	public static void showArr(int a[]) {
		for(int i:a) {
			System.out.print(i+" ");
		}
	}
	public static int[] returnArr() {
		return new int[] {1,2,3,4,5,7};
	}
	public static void main(String[] args) {
	    showArr(new int[] {1,2,3,4,6});
	    int a[]=returnArr();
	    System.out.println();
	    for(int i:a) {
	    	System.out.print(i+" ");
	    }
	}

}
