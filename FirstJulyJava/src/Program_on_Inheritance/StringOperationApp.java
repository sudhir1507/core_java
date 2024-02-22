package Program_on_Inheritance;

import java.util.Scanner;

abstract class StringOperation{
	abstract void performOpertion(String x);
}
class ConvertToUppercase extends StringOperation{
	public void performOpertion(String x) {
		String str="";
		char c;
		for (int i = 0; i < x.length(); i++) {
			if(x.charAt(i)>='a'&&x.charAt(i)<='z') {
				c=(char)(x.charAt(i)-32);
			}else {
				c=x.charAt(i);
			}
			str=str+c;
		}
		System.out.println("String after converting Uppercase :"+str);
	}
}
class MaxRepatativeChar extends StringOperation{
	public void performOpertion(String x){
		char ch[]=x.toCharArray();
		for (int i = 0; i < ch.length-1; i++) {
			for (int j = i+1; j < ch.length; j++) {
				char c=ch[i];
				ch[i]=ch[j];
				ch[j]=c;
			}
		}
		int count=1,i=0,max=0;
		char temp=' ';
		for (i = 0; i < ch.length-1; i++) {
			if(ch[i]==ch[i+1]) {
				count++;
			}else {
				count=1;
			}
			if(count>max) {
				max=count;
				temp=ch[i];
			} 
		}
		System.out.println("Maximum Repetative charector : "+temp);
	}
}
class WordReverse extends StringOperation{
	public void performOpertion(String x) {
		
	}
}
public class StringOperationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String x=sc.nextLine();
		ConvertToUppercase obj1=new ConvertToUppercase();
		obj1.performOpertion(x);
		
		MaxRepatativeChar obj2=new MaxRepatativeChar();
		obj2.performOpertion(x);
	}

}
