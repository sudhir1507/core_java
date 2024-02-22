package StringUse;
import java.util.Scanner;
class ReverseStrApp{
	String s="";
	public String reverseWords(String str) {
		String st[]=str.split(" ");
		for(int i=0;i<st.length;i++) {
			StringBuffer sb=new StringBuffer(st[i]);
			s=s+sb.reverse()+" ";
		}
		return s;
	}
}
public class ReverseWordApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=sc.nextLine();
		ReverseStrApp Rw=new ReverseStrApp();
		String s=Rw.reverseWords(str);
		System.out.println("Reverse word from string "+s);

	}

}
