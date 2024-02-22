package Exception_Handling;

public class ExcepMCQApp {
    public int cal() {
    	try {
			return 2/0;
		}catch(ArithmeticException e) {
		  return 1;	
		}finally {
			return 0;
		}
    }
	public static void main(String[] args) {
		ExcepMCQApp ee=new ExcepMCQApp();
		ee.cal();

	}

}
