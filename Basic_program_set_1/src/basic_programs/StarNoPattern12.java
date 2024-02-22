package basic_programs;

public class StarNoPattern12 {

	public static void main(String[] args) {
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {


					if((j==5-i || j==3+i ) || (i==3+j || j == 11-i))
					{
						System.out.print("*");
						//if(j<5)
							
					}
					else
					{
						
						System.out.print(" ");
					}
			}
			System.out.println();
		}
	}

}
