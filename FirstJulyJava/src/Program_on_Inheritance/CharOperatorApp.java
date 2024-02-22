package Program_on_Inheritance;

import java.util.Scanner;

interface CharOperator{
	void setCharArr(char ch[]);
	char[] getArrResult();
}
class ConvertToUpper implements CharOperator{
	char[] ch;
	public void setCharArr(char ch[]) {
		this.ch=ch;
	}
	public char[] getArrResult() {
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>=97&&ch[i]<=122) {
				ch[i]=(char) (ch[i]-32);
			}
		}
		return ch;
	}
}
class ChangeAlterNateChar implements CharOperator{
	char[] ch;
	public void setCharArr(char ch[]) {
		this.ch=ch;
	}
	public char[] getArrResult() {
		for(int i=0;i<ch.length;i++) {
			if(i%2==0) {
				if(ch[i]>=97&&ch[i]<=122) {
					ch[i]=(char) (ch[i]-32);
				}
			}
			if(i%2==1) {
				if(ch[i]>=65&&ch[i]<=90) {
					ch[i]=(char) (ch[i]+32);
				}
			}
			
		}
		return ch;
	}
}
public class CharOperatorApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter charactor array");
		char ch[]=sc.nextLine().toCharArray();
		CharOperator obj=new ConvertToUpper();
		obj.setCharArr(ch);
        char res[]=obj.getArrResult();
        System.out.println("After converting into Upper");
        for(int i=0;i<res.length;i++) {
        	System.out.print(res[i]);
        }
        obj=new ChangeAlterNateChar();
		obj.setCharArr(ch);
        char c[]=obj.getArrResult();
        System.out.println("\nAfter changeing alternate charactors");
        for(int i=0;i<c.length;i++) {
        	System.out.print(c[i]);
        }
	}

}
