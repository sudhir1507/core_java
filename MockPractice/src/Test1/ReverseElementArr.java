package Test1;
class Arr{
	int a[];
	public Arr(int []a) {
		this.a=a;
	}
	public void findRev() {
		int rev;
		for(int i=0;i<a.length;i++) {
			rev=0;
			int number=a[i];
			for(;number!=0;number/=10) {
				rev=rev*10+(number%10);
			}
			System.out.print(rev+"\t");
		}
	}
}
public class ReverseElementArr {

	public static void main(String[] args) {
		int a[]=new int[] {12,234,54,67,6};
		Arr ar=new Arr(a);
		ar.findRev();
		

	}

}
