package arrayuse;
class TwoDArray{
	void setValue(int[]...x) {
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
	}
}
public class TwoDArrayWithInfiniteVrgs {

	public static void main(String[] args) {
		int[][] x=new int[][]
				{{1,2,5},
				 {3,4,6},
				 {9,8,7}
				};
		new TwoDArray().setValue(x);

	}

}
