package testPractice;

public class Students {
	String subject;
	int midterm;
	int finalterm;
	int exp;
	
	//시험 점수 합산
	public int total () {
		return midterm + finalterm + exp;
	}
}