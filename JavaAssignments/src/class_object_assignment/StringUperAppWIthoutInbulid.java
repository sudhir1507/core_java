package class_object_assignment;

public class StringUperAppWIthoutInbulid {
    public static String convertToUppr(String s) {
    	String r="";
    	char c;
    	for(int i=0;i<s.length();i++) {
    		if(s.charAt(i)>='a'&&s.charAt(i)<='z') {
    			c=(char)(s.charAt(i)-32);
    		}else {
    			c=(char)(s.charAt(i));
    		}
    		r=r+c;
    	}
    	return r;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertToUppr("hi coder"));
	}

}
