package java_basics;

public class Factrorial {

	public static void main(String[] args) {
		int num=3;
		long fact=1;
		for(int i=1;i<=num;++i) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
