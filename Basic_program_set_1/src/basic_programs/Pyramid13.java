package basic_programs;

public class Pyramid13 {
	public static void main(String[] args) {
		for(int i=1;i<=7;i++) {
			int k=1;
			for(int j=1;j<=7;j++) {
				if(j<=i) {
					System.out.print(k+" ");
					k=k*(i-j)/j;
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
