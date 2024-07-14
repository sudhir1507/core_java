package Test;
class FindSum{
	int a[];
	int sum=0;
	void setValue(int...a) {
		this.a=a;
	}
	public int getSum() {
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}
}
public class SumApp {

	public static void main(String[] args) {
		FindSum obj=new FindSum();
		obj.setValue(1,2,4,5,3,6);
		int result=obj.getSum();
		System.out.println("sum is :"+result);

	}

}
