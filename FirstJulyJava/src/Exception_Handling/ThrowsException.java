package Exception_Handling;
class Div{
	int a,b;
	void setValue(int x,int y) {
		a=x;
		b=y;
	}
	int getDiv()throws Exception{
		return a/b;
	}
}
public class ThrowsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Div d=new Div();
		d.setValue(10, 0);
		try {
			int result=d.getDiv();
			System.out.println("Division is "+result);
		}catch(Exception e) {
			System.out.println("Exception handle at function calling "+e);
		}
	}

}
