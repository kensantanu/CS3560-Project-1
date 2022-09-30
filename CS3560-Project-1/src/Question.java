import java.util.*;

interface Question
{
	// behaviors
	public String getPrompt();

	public void setPrompt(String prompt);
	
	public void submitAnswer(Student s, int a);
	
	public HashMap<String, ArrayList<Boolean>> getStudentAnswer();
	
}
