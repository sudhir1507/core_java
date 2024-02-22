package Coding;

public class PrimeCheck {

	public static void main(String[] args) {
		int n=4;
		boolean flag=false;
		for(int i=2;i<=n/2;++i) {
			if(n%i==0) {
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println("prime number");
		}else {
			System.out.println("Not prime number");
		}
	}

}
