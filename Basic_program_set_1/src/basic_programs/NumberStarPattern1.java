package basic_programs;

public class NumberStarPattern1 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			boolean flag=true;
			for(int j=1;j<=17;j++) {
				if(j>=10-i && j<9+i && flag) {  //9 10
					System.out.print(i);
					flag=false;
				}else {
					System.out.print("*");
					flag=true;
				}
			}
			System.out.println();
		}
	}

}
