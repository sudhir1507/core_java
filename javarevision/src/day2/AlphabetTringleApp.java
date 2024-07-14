package day2;

public class AlphabetTringleApp {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			boolean flag=true;
			char ch=65;
			for(int j=1;j<=17;j++) {
				if(j>=10-i&&j<=8+i&&flag) {
					System.out.print(ch++);
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
