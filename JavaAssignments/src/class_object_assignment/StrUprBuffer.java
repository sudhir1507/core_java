package class_object_assignment;

public class StrUprBuffer {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello Coder";
		StringBuffer ss=new StringBuffer(s);
		for(int i=0;i<s.length();i++) {
			if(Character.isLowerCase(s.charAt(i))) {
				ss.setCharAt(i, Character.toUpperCase(s.charAt(i)));
			}else {
				ss.setCharAt(i, Character.toLowerCase(s.charAt(i)));
			}
		}
		System.out.println("After conversion String : "+ss);
	}

}
