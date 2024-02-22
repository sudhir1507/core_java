package Exception_Handling;
class Arrays{
	int a[];
	void setArr(int x[]){
		a=x;
	}
	int getArr()throws Exception {
		return a[3];
	}
}
public class ArrayThrowsExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]=new int[] {1,2};
		Arrays aa=new Arrays();
		aa.setArr(x);
		try {
			int result=aa.getArr();
			System.out.println(result);
		}catch(Exception e) {
			System.out.println("Exception is handled "+e);
		}finally {
			System.out.println("This is rest of the code..");
		}
	}

}
