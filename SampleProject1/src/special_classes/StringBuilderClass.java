package special_classes;

public class StringBuilderClass {

	public static void main(String[] args) {
		String str1="I";
		str1=str1+" Like";
		str1=str1+ " Java";
		
		System.out.println(str1);
		
		StringBuilder sb1=new StringBuilder("I");
		sb1.append(" Like");
		sb1.append(" Java");
		System.out.println(sb1);
		
		//insert
		StringBuilder sb2= new StringBuilder("Learning is fun");
		sb2.insert(9, "Java ");
		System.out.println(sb2);
		
		//replace
		sb2.replace(9, 13, "Everything");
		System.out.println(sb2);
		
		//delete
		sb2.delete(2, 10);
		System.out.println(sb2);
		
		//reverse
		sb2.reverse();
		System.out.println(sb2);
	}

}
