package Test1;
class Perfect{
	int number;
	public void setValue(int number) {
		this.number=number;
		System.out.println(number);
	}

	public boolean isPerfect() {
		int sum=0;
		int n=number;
		for(int i=1;i<number;i++) {
			if(number%i==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
		if(n==sum) {
			return true;
		}else {
			return false;
		}
	}
}
public class PerfectNumber {

	public static void main(String[] args) {
		Perfect t=new Perfect();
		int n=28;
		t.setValue(n);
		if(t.isPerfect()) {
			System.out.println("Perfect");
		}else {
			System.out.println("Not Perfect");
		}
	}

}
