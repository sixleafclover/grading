package gradingProgram;

public class ComputerStudent extends Student {
	
	//필
	final String requireSub = "수학";
	final String subject = "컴퓨터공학과";
	

	public ComputerStudent() {
		
	}

	public ComputerStudent(String stName, String stNum, int korScore, int mathScore) {
		super(stName, stNum, korScore, mathScore);
	}
	
	//메
	//Student toString 오버라이드
	@Override
	public String toString() {
		return super.toString()+" | "+requireSub+" | ";
	}
	
	
	
	

}
