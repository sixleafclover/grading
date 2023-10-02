package gradingProgram;

public class Student{

	//필 (이름 점수 private)
	private String stName;
	String stNum;
	String subject;
	String requireSub;
	private int mathScore;
	private int korScore;
	
	
	//생
	public Student() {
		
	}
	public Student(String stName, String stNum,int korScore,int mathScore) {
		this.stName=stName;
		this.stNum=stNum;
		this.setKorScore(korScore);
		this.setMathScore(mathScore);
	}
	
	
	//메
	//object toString 오버라이드
	@Override
	public String toString() {
		return getStName()+" | "+stNum;
	}
	
	
	//getter /setter
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public int getKorScore() {
		return korScore;
	}
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
}
