package Pattern;

public class RhombhusStar {

	public static void main(String[] args) {
		for(int i=1;i<6;i++) {
			for(int j=1;j<9;j++) {
				if(j<=3+i&&j>=i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
