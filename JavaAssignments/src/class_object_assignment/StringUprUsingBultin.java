package class_object_assignment;
class Converter{
	String s;
	void setString(String s) {
		this.s=s;
		StringBuffer ss=new StringBuffer(s);
		for(int i=0;i<s.length();i++) {
			if(Character.isLowerCase(s.charAt(i))) {
				ss.setCharAt(i,Character.toUpperCase(s.charAt(i)));
			}
		}
		System.out.println(ss);
	}
	
}
public class StringUprUsingBultin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello coder";
		
		Converter cc=new Converter();
		cc.setString(s);

	}

}
