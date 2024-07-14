package Pattern;

public class NUmberTringular {

	public static void main(String[] args) {
		for(int i=1;i<5;i++) {
			boolean flag=true;
			for(int j=1;j<8;j++) {
				if(j>=5-i&&j<=3+i&&flag) {
					System.out.print(i);
					flag=false;
				}else {
					System.out.print(" ");
					flag=true;
				}
			}
			System.out.println();
		}

	}

}
