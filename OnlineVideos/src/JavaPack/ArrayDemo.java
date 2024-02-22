package JavaPack;

public class ArrayDemo {

	public static void main(String[] args) {
		int d[][]= {{22,33,4,55},
					{34,21,42},
					{25,89,78,5,6}
					};
		
		for(int k[]:d) {
			for(int l:k) {
				System.out.print(" "+ l);
			}
			System.out.println();
		}
	}
}
