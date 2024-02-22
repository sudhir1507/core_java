package PracticeJava;

public class UseContinue {

	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
			if(i==5) {
				System.out.println("**");
				continue;
			}
			System.out.println(i);
		}

	}

}
