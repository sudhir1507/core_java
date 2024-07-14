package Pattern;

public class PalindromeTringular {

	public static void main(String[] args) {
		for(int i=1;i<5;i++) {
			int k=i+1;
			for(int j=1;j<8;j++) {
				if(j>=5-i&&j<=3+i&&j<5) {
					System.out.print(--k);
					
				}else if(j>=5-i&&j<=3+i&&j>4) {
					
					System.out.print(++k);
					
				}else {
					System.out.print(" ");
					
				}
			}
			System.out.println();
		}

	}

}
