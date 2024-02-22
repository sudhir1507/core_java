package Exception_Handling;
class DivApp{
	int a;
	int b;
	public void setVal(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public int getDiv() throws ArithmeticException{
		return (a/b);
	}
}
public class ThrowsDemoApp {

	public static void main(String[] args) {
		DivApp da=new DivApp();
		da.setVal(10, 0);
		try {
			int result=da.getDiv();
			System.out.println(result);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
System.out.println("Rest of the code");
	}

}
