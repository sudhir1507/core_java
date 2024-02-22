package StringUse;

public class CharArraytoString {

	public static void main(String[] args) {
		byte ascii[]= {71,70,71};  //array of byte
		char ch[]= {'G','f','g'};   //char array
		String s=new String(ascii);
		String s1=new String(ch);
		System.out.println("s = "+s);
		System.out.println("s1 = "+s1);

	}

}
