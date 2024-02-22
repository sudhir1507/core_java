package arrayuse;
class ArrApp{
	public int[] showArr() {
		return new int[] {1,2,3,4,5};
	}
}
public class ANonymusREturnApp {

	public static void main(String[] args) {
		ArrApp obj=new ArrApp();
		int a[]=obj.showArr();
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
