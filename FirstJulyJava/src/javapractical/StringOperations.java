package javapractical;
/*
 *  input String :I am indian

       first ouput :  naidni ma I
       Secound output :  i ma naidni 
       Third  outout :indian am i
       Fourth output :  iNdIan am I
       Fifth output :   I am inn
 */
import java.util.*;
class Stringreve{
	String str=" ";
	void setString(String str) {
		this.str=str;
	
	}
	void reverseString() {
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		System.out.println("First output : "+sb);
	}
	void wordReverseAtsame() {
		String ss[]=str.split(" ");
		System.out.print("second output : ");
		for (int i = 0; i < ss.length; i++)
		{
			StringBuffer s=new StringBuffer(ss[i]);
			System.out.print(s.reverse()+" ");
		}
	}
	void reverseWord() {
		String ss[]=str.split(" ");
		System.out.print("\nThird output : ");
		for (int i =ss.length-1; i >=0; i--) {
			System.out.print(ss[i]+" ");
		}
	}
	void replaceN() {
//		StringBuffer s=new StringBuffer(str);
		String ss[]=str.split(" ");
		System.out.print("\nThird output : ");
		for (int i =ss.length-1; i >=0; i--) {
			str.toCharArray();
			StringBuffer s=new StringBuffer(str);
			System.out.print(s.replace(1, 2, "N")+" ");
		}
		
		
	}
}

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner xyz=new Scanner(System.in);
		System.out.println("enter the string");
		String str=xyz.nextLine();
        
		Stringreve obj=new Stringreve();
		obj.setString(str);
		obj.reverseString();
		obj.wordReverseAtsame();
		obj.reverseWord();
		obj.replaceN();
		xyz.close();
	}
   
}

//String str="I am indian";
//String ss[]=str.split(" ");
//for(int i=0;i<ss.length;i++){
//    StringBuffer s=new StringBuffer(ss[i]);
//    System.out.print(s.reverse()+" ");
//}