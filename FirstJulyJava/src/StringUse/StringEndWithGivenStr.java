package StringUse;
import java.util.Scanner;
class StringEndGvnStr{
	public boolean isEndWithStr(String str,String str1){
		boolean isEnd=str.endsWith(str1);
		
		return isEnd;
		
	}
}
public class StringEndWithGivenStr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String");
		String str=sc.nextLine();
		System.out.println("Enter String to check");
		String str1=sc.nextLine();
		StringEndGvnStr sn=new StringEndGvnStr();
		boolean result=sn.isEndWithStr(str, str1);
		if(result) {
			System.out.println(str+" ends with "+str1);
		}else {
			System.out.println(str+"NOT ends with "+str1);
		}
	}

}
