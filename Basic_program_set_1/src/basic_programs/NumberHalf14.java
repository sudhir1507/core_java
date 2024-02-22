package basic_programs;

public class NumberHalf14 {

	public static void main(String[] args) {
		for(int i=1;i<6;i++) {
			for(int j=1;j<=5;j++) {
				if(j<=6-i) {
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}

	}

}
