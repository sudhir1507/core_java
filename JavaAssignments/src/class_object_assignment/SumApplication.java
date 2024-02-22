package class_object_assignment;
class Sum{
	
	void calSum(int ...x) {
		int sum=0;
		for(int i=0;i<x.length;i++) {
			sum=sum+x[i];
		}
		System.out.println("Sum is "+sum);
	}
}
public class SumApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum s=new Sum();
		s.calSum(10,20,30,40);
		s.calSum(10);
		s.calSum(24+26);
	}

}
