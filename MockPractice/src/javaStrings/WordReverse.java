package javaStrings;

public class WordReverse {

	public static void main(String[] args) {
		String str = "Aditya Prashant Patil";
		String newStr ="";
		boolean b = false;
		int k=str.length();
		for(int i=str.length()-1;i>=0;i--)
		{
			char c = str.charAt(i);
			if(c ==' ' || i==0)
			{
				b=true;
				if(i==0)
				{
					i--;
				}
				int p=k;
				for(int j=i+1;j<k;j++)
				{
					c = str.charAt(j);
					newStr = newStr + c;
				}
				if(b)
				{
					b = false;
					newStr += ' ' ;
				}
				k = i;
			}
		}
		System.out.println(newStr);

	}

}
