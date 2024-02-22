package basic_programs;

public class NumberPattern15 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			int count=1;
			for(int j=1;j<=9;j++) {
				if(j<=4+i&& j>=6-i) {
					System.out.print(count);
					if(j<5)
						count++;
					else
						count--;
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
