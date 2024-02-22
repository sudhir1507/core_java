package arrayuse;
class VrgArray{
	void setValue(int[]...a) {  //method with variable argument with infinite array.
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
public class VaribleArgmWithInfineArray {

	public static void main(String[] args) {
		new VrgArray().setValue(new int[] {1,2,3},new int[] {4,5,6},new int[] {9,8,7});

	}

}
