package stringpracticalMorseCodeAlgorithm;

import java.util.Scanner;

public class MorseCodeAlgoApp {
	
	public  void encryptToMarsh(String str,char enrpyt[],String[] decrypt){
		String s="";
		char ch[]=str.toCharArray();
		for (int i = 0; i <ch.length; i++) {
			for(int j=0;j<enrpyt.length;j++)
			if(ch[i]==enrpyt[j]) {
//				System.out.println(ch[i]);
				s=s+decrypt[j];
			}
		
		}
		System.out.println(s);
	}
	public  void marshToDecrpt(String str1,char enrpyt[],String[] decrypt){
		String ms="";
		String[] ss=str1.split(" ");
		for(int i=0;i<ss.length;i++) {
			for(int j=0;j<decrypt.length;j++) {
				if(ss[i].equals(decrypt[j])) {
					ms=ms+enrpyt[j];
				   }
			}
		}
		System.out.println(ms);
		}
		
	
	
	
	public static void main(String[] args) {
		char enrpyt[]= {
				'A','B','C','D','E','F','G','H','I','J','K',
				'L','M','N','O','P','Q','R','S','T','U','V',
				'W','X','Y','Z','0','1','2','3','4','5','6','7',
				'8','9'
		};
		String decrypt[]= {
				".-","-...","-.-.","-..",".","..-.","--.","....","..",
				".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
				"...","-","..-","...-",".--","-..-","-.--","--..",
				"-----",".----","..---","...--","....-",".....","-....",
				"--...","---..","----.",
		};
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter code to encrypt :");
		String str=sc.nextLine();
		MorseCodeAlgoApp obj=new MorseCodeAlgoApp();
		obj.encryptToMarsh(str,enrpyt,decrypt);
		System.out.println("enter morsh code to decrypt :");
		String str1=sc.nextLine();
		obj.marshToDecrpt(str1, enrpyt, decrypt);
		
		
	
		
	}

}
