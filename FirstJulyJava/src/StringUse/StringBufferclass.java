package StringUse;

public class StringBufferclass {

	public static void main(String[] args) {
		StringBuffer sf=new StringBuffer("Hello ");
		//append()
//		sf.append("Java");
//		System.out.println(sf);
//		
		//insert()
//		sf.insert(1, "java");
//		System.out.println(sf);

		//replace()
		sf.replace(1, 4, "java");
		System.out.println(sf);
		
		//delete()
//		sf.delete(1, 4);
//		System.out.println(sf);
		
		//reverse()
//		sf.reverse();
//		System.out.println(sf);
	}

}
