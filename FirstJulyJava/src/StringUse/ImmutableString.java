package StringUse;

public class ImmutableString {

	public static void main(String[] args) {
		String name="Sachin";
		name.concat(" Tendulkar");    //Here Sachin is not changed but a new object is created 
										//with “Sachin Tendulkar”. That is why a string is known as immutable.
		System.out.println(name);     //when we print name then it will print sachin bcz we not assigned it after concataning
		name=name.concat(" Tendulkar"); //this time it will print "sachin tendulkar" bcz we assinged name after concataning
		System.out.println(name);  
	}

}
