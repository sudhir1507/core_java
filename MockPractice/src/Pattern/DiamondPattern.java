package Pattern;

public class DiamondPattern {

	public static void main(String[] args) {
		for(int i=1;i<8;i++) {
			boolean flag=true;
			for(int j=1;j<8;j++) {
				if(j>=5-i&&j<=3+i&&i<5&&flag) {
					System.out.print("*");
					flag=false;
				}else if(j<=5-i&&j>=3+i&&i>4&&flag){
					System.out.print("*");
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
