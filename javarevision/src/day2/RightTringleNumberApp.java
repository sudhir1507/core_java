package day2;

public class RightTringleNumberApp {

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=8;i++) {
			   for(int j=1;j<=7;j++) {
				   if(i>j) {
					   System.out.print(++count+" ");
				   }
			   }
			   System.out.println();
		   }

	}

}
