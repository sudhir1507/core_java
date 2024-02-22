package class_object_assignment;
class ConvertToUpr{
	char c[];;
	void setCharArray(char ch[]) {
		c=ch;
	}
	void convertToUpperCase() {
		for(int i=0;i<c.length;i++) {
			if(c[i]>='a'&&c[i]<='z') {
				c[i]=(char)(c[i]-32);
			}
		}
		System.out.println(c);
	}
}
public class ConvertToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch=new char[]{'g','o','o','d'};
		ConvertToUpr cc=new ConvertToUpr();
		cc.setCharArray(ch);
		cc.convertToUpperCase();
	}

}
