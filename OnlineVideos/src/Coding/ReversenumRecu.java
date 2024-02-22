package Coding;

public class ReversenumRecu {
	public static void reversenum(int n) {
		if(n<9) {
			System.out.print(n);
			
		}else {
			System.out.print(n%10);
			reversenum(n/10);
		}
	}
	public static void main(String[] args) {
		int n=34;
		reversenum(n);

	}

}
