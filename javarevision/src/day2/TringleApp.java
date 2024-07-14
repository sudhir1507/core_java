package day2;

public class TringleApp {

	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			boolean flag=true;
			for(int j=1;j<=11;j++) {
				if(j>=7-i&&j<=5+i&&flag) {
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
