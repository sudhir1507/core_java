package Coding;

public class Customer {

	public static void main(String[] args) {
		int items=3;
		int bill=2000;
		int discount;
		System.out.println("Number of items purchese: " + items);
		System.out.println("Total bill ammount: "+ bill);
        if(bill<1000) {
        	System.out.println("No discount");
        }else {
        	if(items>2&&bill>2000) {
        		discount=(95*bill)/100;
        		
        	}
        }
	}

}
