
public class Student {
	
	// attributes
	private String studentID;
	private int answer;
	
	// constructor
	public Student(String id)
	{
		studentID = id;
	}
	
	// behaviors
	public int submitAnswer(int a) {
		answer = a;
		return answer;
	}
	
	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	

}
