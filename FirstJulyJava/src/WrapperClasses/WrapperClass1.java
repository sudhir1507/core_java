package WrapperClasses;

public class WrapperClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer ii=new Integer(5);  //using constructor
		Integer jj=new Integer(5);
		
		Integer kk=Integer.valueOf(5); //using valueOf() method
		Integer ll=Integer.valueOf(5);
		
		Integer mm=5;
		Integer nn=5;  //using autoboxing;
		
		boolean b=(ii==jj);
		boolean c=(kk==ll);
		boolean d=(mm==nn);
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
