package ConstructorPreact;
class Sum{
	int a[];
	public Sum(int a[]) {
		this.a=a;
	}
	public int getSum() {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		return sum;
	}
}
public class SumApp {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		Sum s=new Sum(a);
		System.out.println(s.getSum());
	}

}
