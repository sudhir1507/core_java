package Interface;
@FunctionalInterface
interface CubeA{
	int cubeCal(int x);
}
public class FunctinalInterface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		CubeA cc=(int x)->x*x*x;
		
		int ans=cc.cubeCal(a);
		System.out.println(ans);
	}

}
