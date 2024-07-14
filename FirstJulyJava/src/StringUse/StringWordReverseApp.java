package StringUse;

import java.util.Scanner;

public class StringWordReverseApp {
    public static String StringRev(String str) {
    	String words[]=str.split(" ");  
    	String revstr="";
    	for(int i=0;i<words.length;i++) {    //{i am java coder}
    		if(i==words.length-1) {     //i=0 len=3
    			revstr=words[i]+revstr;
    		}else {
    			revstr=" "+words[i]+revstr; // coder java am i
    		}
    	}
    	return revstr;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		System.out.println("String before reverse:"+str);
		String srev=StringRev(str);
		System.out.println("String after reverse:"+srev);
	}

}
