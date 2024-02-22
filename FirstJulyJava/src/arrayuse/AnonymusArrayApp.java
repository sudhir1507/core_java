package arrayuse;
class AnonymusArr{
	public void showArr(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
public class AnonymusArrayApp {

	public static void main(String[] args) {
		AnonymusArr obj=new AnonymusArr();
		obj.showArr(new int[] {1,2,3,4,5});

	}

}
