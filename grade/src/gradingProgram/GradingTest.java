package gradingProgram;

import java.util.ArrayList;

public class GradingTest {

	public static void main(String[] args) {

		ArrayList<Student> studentList = new ArrayList<>();
		
		studentList.add(new KoreanStudent("안성원","181213",95 , 56));
		studentList.add(new ComputerStudent("오태훈","182330",95 , 98));
		studentList.add(new KoreanStudent("이동호","171518",100 , 88));
		studentList.add(new KoreanStudent("조성욱","172350",89 , 95));
		studentList.add(new ComputerStudent("최태평","171290",83 , 56));

		
		ScorePrint.koreanscore(studentList);
		ScorePrint.mathscore(studentList);

		
	}

}
