package Pattern;

public class NumberChangigPyramid {

	public static void main(String[] args) {
		int k=1;
		for(int i=1;i<5;i++) {
			for(int j=1;j<5;j++) {
				if(i>=j) {
					System.out.print(k++);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
