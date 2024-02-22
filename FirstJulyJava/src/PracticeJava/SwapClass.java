package PracticeJava;
class SwapApp{
	Integer ii,jj;
	void swap(int ii,int jj)
	{
		this.ii=Integer.valueOf(ii);//11
		this.jj=Integer.valueOf(jj);//22
		ii=ii+jj; //ii=30
		jj=ii-jj; //jj=30-10 =20
		ii=ii-jj;  //ii=30-20 =10
		System.out.println("After swap "+ii+" and " +jj);
	}
}
//abstract class BBBB extends SwapApp{
//	abstract void shows();
//}
//class CCCC extends BBBB{
//	void shows() {
//		System.out.println("hii");
//	}
//}
public class SwapClass {
    
	/*public static void main(String[] args) {
		Integer ii=500;
		Integer jj=100;
		
		SwapApp s=new SwapApp();
		System.out.println("before swap "+ii+" and " +jj);
		s.swap(ii,jj);// 11 22
		System.out.println("After swap "+ii+" and " +jj);
		//BBBB nn=new CCCC();
	//	nn.shows();
	}*/
	
	
	    public static void main(String[] args) {
	        Integer objectValue = new Integer(20);
	        System.out.println("Original object value: " + objectValue);
	        
	        modifyObject(objectValue);
	        System.out.println("After modification, object value changes to: " + objectValue);
	    }
	    
	    public static void modifyObject(Integer value) {
	        value = value + 30; // This modifies the local reference, won't affect the original object
	        System.out.println("Inside modifyObject method: " + value);
	    }
	


}
