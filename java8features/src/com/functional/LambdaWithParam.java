package com.functional;
interface Test3 {
    // The void type and the Integer type
    // is automatically inferred from here
    // and assigned to the lambda expression
    void print(Integer p1, Integer p2);
}
public class LambdaWithParam{
	 static void fun(Test3 t, Integer p1, Integer p2)
	    {
	        // calls the print function
	        t.print(p1, p2);
	    }
	public static void main(String[] args) {
		
		fun((p1, p2)
                -> System.out.println(p1 + " " + p2),
            10, 20);		
        
	}

}
