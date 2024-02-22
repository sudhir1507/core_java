package Exception_Handling;
class DivClass{
	int a,b;
	void setValue(int a,int b) {
		this.a=a;
		this.b=b;
	}
	int getResult() throws Exception{
		return a/b;
	}
}
public class ThrowsClass {

	public static void main(String[] args) {
		DivClass d=new DivClass();
    	d.setValue(2, 0);
    	try {
		System.out.println(d.getResult()); 
    	}
    	catch(Exception e) {
    		System.out.println("Error is "+e);
    	}
	}

}
