package StringUse;

public class StringWaystoInitilize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="HELLO";
		String s2="HELLO";
		
		System.out.println("s1 hashcode : "+System.identityHashCode(s1));  //s1 and s2 have same hashcode
		System.out.printf("s2 hashcode : %d\n",System.identityHashCode(s2));
		
		String s3=new String("HELLO JAVA");
		String s4=new String("HELLO JAVA");
		
		System.out.println("s3 hashcode : "+System.identityHashCode(s3)); //s3 and s4 have same hashcode
		System.out.println("s4 hashcode : "+System.identityHashCode(s4));
				
	}

}
