package Exception_Handling;
class VoterException extends ArithmeticException{
	public String getVoterError(){
		return "Invalid Voter because below 18";
	}
}
class VoterMachine{
	void verifyVoter(int age) {
		if(age<18) {
			VoterException ve=new VoterException();
			throw ve;
		}else {
			System.out.println("valid voter");
		}
	}
}

public class UserExceptionApp {

	public static void main(String[] args) {
		
		try {
			VoterMachine vm=new VoterMachine();
			vm.verifyVoter(15);
		}catch(VoterException ve) {
			System.out.println(ve.getVoterError());
		}
	}

}
