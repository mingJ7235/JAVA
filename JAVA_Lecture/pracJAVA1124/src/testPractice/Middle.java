package testPractice;

public class Middle extends Elementary{
	String teacher;
	int attend;
	int volunteer;
	
	@Override
	public int total() {
		return super.total() + attend + volunteer;
	}
	
}
