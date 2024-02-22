package Exception_Handling;
class VoterExcp extends Exception{
	public String getError(){
		return "Age Below 18..Invalid voter";
	}
}
class VoterVerifyApp{
	void verifyVoter(int age) throws VoterExcp {
		if(age<18) {
			VoterExcp ve=new VoterExcp();
			throw ve;
		}else {
			System.out.println("Valid voter");
		}
	}
}
public class VoterAppl {

	public static void main(String[] args) {
		VoterVerifyApp VVA=new VoterVerifyApp();
		
		try {
			VVA.verifyVoter(14);
		}catch(VoterExcp e) {
			System.out.println("Error is "+e.getError());
		}

	}

}
