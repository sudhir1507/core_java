package arrayuse;
class Test{
	public void show(int[]...arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
public class MethodVarArgArray {

	public static void main(String[] args) {
		Test t=new Test();
		//t.show(new int[] {1,2,3},new int[] {4,5,6},new int[] {7,8,9});
		int arr[][]={{1,2,3,45},{4,5,6,20,40,},{7,8,9}};
	     t.show(arr);
		
	}

}
